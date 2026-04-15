package mystr;

public class MyString {
    private String data;
    
    public MyString() {
        this.data = "(test string)";
    }

    public MyString(String str) {
        this.data = "(" + str + ")";
    }

    public String toString() {
        return data;
    }

    public char charAt(int index) {
        return data.charAt(index);
    }

    public int compareTo(String anotherString) {
        return 0;
    }

    public MyString substring(int beginIndex, int endIndex) {
        String sub = data.substring(beginIndex, endIndex);
        return new MyString(sub);
    }
}
