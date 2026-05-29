package atmex;
import java.io.*;
import java.util.*;

public class TestAccount {

    static Account findAccount(ArrayList<Account> accs, String id) {
        for (Account acc : accs) {
            if (acc.getId().equals(id))
                return acc;
        }
        return null;
    }

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<Account> accs = new ArrayList<Account>();
        String str;

        while (true) {
            System.out.println("\n========== ATM 帳戶模擬程式 ==========");
            System.out.println("(1)存款  (2)提款  (3)開戶  (4)餘額查詢  (5)離開");
            System.out.print("請輸入選項: ");

            try {
                str = br.readLine();
                int choice = Integer.parseInt(str);
                
                if (choice < 1 || choice > 5)
                    throw new OperationException("請輸入 1 到 5 之間的數字！");

                if (choice == 3) {
                    System.out.print("請輸入新帳號 ID: ");
                    String newId = br.readLine();

                    if (findAccount(accs, newId) != null) {
                        System.out.println("此帳號 ID 已存在。");
                        continue;
                    }

                    System.out.print("請輸入密碼: ");
                    String newPwd = br.readLine();
                    System.out.print("請輸入初始存款金額: ");
                    long initMoney = Long.parseLong(br.readLine());

                    Account newAcc = new Account(newId, newPwd, initMoney);
                    accs.add(newAcc);
                    System.out.println("開戶成功！");
                    continue;
                }

                if (choice == 5) {
                    System.out.println("感謝使用，再見！");
                    break;
                }

                System.out.print("請輸入帳號 ID: ");
                String loginId = br.readLine();
                System.out.print("請輸入密碼: ");
                String loginPwd = br.readLine();

                Account acc = findAccount(accs, loginId);

                if (acc == null) {
                    System.out.println("帳號不存在！");
                    continue;
                }

                if (!acc.getPassword().equals(loginPwd)) {
                    System.out.println("密碼錯誤！");
                    continue;
                }

                switch (choice) {
                    case 1:
                        System.out.print("請輸入存款金額: ");
                        long depositAmt = Long.parseLong(br.readLine());
                        try {
                            acc.deposite(depositAmt);
                            System.out.println("存款成功！目前餘額: " + acc.checkbalance());
                        } catch (AccountError e) {
                            System.out.println("存款失敗：" + e.getMessage());
                        }
                        break;

                    case 2:
                        System.out.print("請輸入提款金額: ");
                        long withdrawAmt = Long.parseLong(br.readLine());
                        try {
                            acc.withdraw(withdrawAmt);
                            System.out.println("提款成功！目前餘額: " + acc.checkbalance());
                        } catch (AccountError e) {
                            System.out.println("提款失敗：" + e.getMessage());
                        }
                        break;

                    case 4:
                        System.out.println("帳號 [" + loginId + "] 目前餘額: " + acc.checkbalance());
                        break;
                }

            } catch (OperationException e) {
                System.out.println("操作錯誤：" + e.getMessage());
            } catch (NumberFormatException e) {
                System.out.println("輸入格式錯誤，請輸入數字！");
            }
        }
    }
}
