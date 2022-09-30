package org.Oops1BankingSystem;

//user class
public class User {
    int accBalance = 5000;
    String firstName="Test First name", lastName="Test Last Name", accountNum="1239 8701 5301", userName, password;

    public User() {
    }

    public User(int accBalance, String firstName, String lastName, String accountNum) {
        this.accBalance = accBalance;
        this.firstName = firstName;
        this.lastName = lastName;
        this.accountNum = accountNum;
    }

    public int getAccBalance() {
        return accBalance;
    }

    public void setAccBalance(int accBalance) {
        this.accBalance = accBalance;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getAccountNum() {
        return accountNum;
    }

    public void setAccountNum(String accountNum) {
        this.accountNum = accountNum;
    }

    public String getUserName() {
        return userName;
    }

    public String setUserName(String userName) {
        this.userName = userName;
        return userName;
    }

    public String getPassword() {
        return password;
    }

    public String setPassword(String password) {
        this.password = password;
        return password;
    }
}
