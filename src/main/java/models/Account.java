package models;

public class Account {

    private String accountNumber;
    private Integer accountBalance;
    private Movements movement;

    public Account() {
        this.accountNumber = "1234567891";
        this.accountBalance = 250000;
        this.movement = new Movements();
    }

    public Account(String accountNumber, Integer accountBalance) {
        this.accountNumber = accountNumber;
        this.accountBalance = accountBalance;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public Integer getAccountBalance() {
        return accountBalance;
    }

    public void setAccountBalance(Integer accountBalance) {
        this.accountBalance = accountBalance;
    }

    @Override
    public String toString() {
        return "Account{" +
                "accountNumber='" + accountNumber + '\'' +
                ", accountBalance=" + accountBalance +
                ", movement=" + movement +
                '}';
    }
}
