package hint;

public class HugeInt {

    private String data;
    
    public HugeInt(String num) {
        this.data = num;
    }
    
    public String toString() {
        return data;
    }
    
    public String add(HugeInt b) {
        
        int carry = 0;
        String ans = new String();
        
        String aStr = this.data;
        String bStr = b.data;
        
        int i = aStr.length() - 1;
        int j = bStr.length() - 1;

        while (i >= 0 || j >= 0 || carry != 0) {
            
            int digitA = (i >= 0) ? aStr.charAt(i) - '0' : 0;
            int digitB = (j >= 0) ? bStr.charAt(j) - '0' : 0;
            
            int sum = digitA + digitB + carry;
            
            ans = (sum % 10) + ans;
            carry = sum / 10;
            
            i--;
            j--;
        }
        
        return ans;
    }
    
    private boolean isSmaller(String a, String b) {
        
        if (a.length() != b.length()) {
            return a.length() < b.length();
        }
        
        return a.compareTo(b) < 0;
    }
    
    public String subtract(HugeInt b) {
        
        String aStr = this.data;
        String bStr = b.data;
        
        // 判斷大小（決定正負）
        boolean negative = false;
        
        if (isSmaller(aStr, bStr)) {
            // 如果 a < b，就交換，最後加負號
            String temp = aStr;
            aStr = bStr;
            bStr = temp;
            negative = true;
        }
        
        StringBuilder ans = new StringBuilder();
        
        int i = aStr.length() - 1;
        int j = bStr.length() - 1;
        int borrow = 0;
        
        while (i >= 0) {
            
            int digitA = aStr.charAt(i) - '0' - borrow;
            int digitB = (j >= 0) ? bStr.charAt(j) - '0' : 0;
            
            if (digitA < digitB) {
                digitA += 10;
                borrow = 1;
            } else {
                borrow = 0;
            }
            
            int diff = digitA - digitB;
            ans.append(diff);
            
            i--;
            j--;
        }
        
        // 去掉前導 0
        while (ans.length() > 1 && ans.charAt(ans.length() - 1) == '0') {
            ans.deleteCharAt(ans.length() - 1);
        }
        
        ans.reverse();
        
        if (negative) {
            ans.insert(0, "-");
        }
        
        return ans.toString();
    }
    
}