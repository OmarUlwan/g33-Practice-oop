package se.lexicon.omar.model;

public class BankAccount {

    // Fields for account.
    private int accountNumber;
    private double balance;
    private String customerName;
    private String email;
    private int phoneNumber;
    private int id;

    // Static counter that increment and assign the account number.
    static int counter;

    //  Constructor that assign values to all fields.
    public BankAccount(int accountNumber, double balance, String customerName, String email, int phoneNumber) {
        this();
        this.accountNumber = accountNumber;
        this.balance = balance;
        this.customerName = customerName;
        this.email = email;
        this.phoneNumber = phoneNumber;
    }

    // Chaining construct for id counter.
    public BankAccount(){
        this.id = ++counter;
    }


    // Methods to deposit funds.
    public void deposit(double addMoney) {
        System.out.print("You get on: " + addMoney + "Kr" + " and your balance now:" + "\n"
                + getBalance() + " + " + addMoney + " = ");
        this.balance += addMoney;
        System.out.println(getBalance());
    }

    // Methods to withdraw funds.
    public void withdraw(double drawMoney) {
        if (balance < drawMoney) {
            System.out.println("You do not have enough money to complete the process" + "\n" +
                    getBalance() + " - " + drawMoney + " = " + "Error");
        } else {
            System.out.print("You sent: " + drawMoney + "Kr" + " and your balance now:" + "\n"
                    + getBalance() + " - " + drawMoney + " = ");
            this.balance -= drawMoney;
            System.out.println(getBalance());
        }
    }

    // Method to print account inf.
    public void getPrint() {
        System.out.println("ID: " + this.getId() + "\n" + "Account number: " + this.getAccountNumber()
                + "\n" + "Balance: " + this.getBalance() + "Kr" + "\n" + "Customer name: " + this.getCustomerName()
                + "\n" + "Email: " + this.getEmail() + "\n" + "Mobile: " + this.getPhoneNumber()
                + "\n" + "===================================");
    }


    // Getters and setters for all fields.

    public int getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(int accountNumber) {
        this.accountNumber = accountNumber;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(int phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public static int getCounter() {
        return counter;
    }

    public static void setCounter(int counter) {
        BankAccount.counter = counter;
    }

}