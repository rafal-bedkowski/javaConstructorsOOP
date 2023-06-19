public class Account {

    private int accountNumber;
    private double accountBalance;
    private String customerName;
    private String email;
    private int phoneNumber;

    public int getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(int accountNumber) {
        this.accountNumber = accountNumber;
    }

    public double getAccountBalance() {
        return accountBalance;
    }

    public void setAccountBalance(int accountBalance) {
        this.accountBalance = accountBalance;
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


    public void depositFound(double deposit) {

        accountBalance += deposit;
        System.out.println("Deposit of $ " + deposit + " made. New balance is $" + accountBalance);
    }

    public void withdrawFound(double withdraw) {
        if (accountBalance - withdraw < 0) {
            System.out.println("Insufficient Funds! You only have $" + accountNumber + " in your account.");
        } else {
            accountBalance -= withdraw;
            System.out.println("You take from the account: " + withdraw + "$. Your current balance is: " + accountBalance + "$");
        }
    }

}


