package ch5Project;

import java.util.Scanner;

class AccountLogIn {
    private String accountName = "Myat Thet";
    public String gmail = "myat@.com";
    public String password = "weareone12";
    public int phNo = 1234;

    /**
     * if this method return null,that mean your password is incorrect
     *
     * @param password
     * @return
     */
    public AccountLogIn accountLogIn(String password) {
        if (this.password.equals(password)) {
            AccountLogIn obj = new AccountLogIn();
            return obj;
        } else {
            return null;
        }
    }

    public void setAccountName(String accountName) {
        this.accountName = accountName;
    }

    public void setGmail(String gmail) {
        this.gmail = gmail;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setPhNo(int phNo) {
        this.phNo = phNo;
    }

}

public class LogIn {
    public static void main(String[] args) {
        AccountLogIn logIn = new AccountLogIn();
        Scanner input = new Scanner(System.in);
        System.out.println("enter your password");
        logIn.accountLogIn(input.next());
        System.out.println(logIn);
        System.out.println(logIn.toString());
        logIn.setAccountName("Hun");

    }

}
