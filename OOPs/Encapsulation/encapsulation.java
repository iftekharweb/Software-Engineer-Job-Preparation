public class encapsulation {
    private double balance; 

    public encapsulation(double balance) {
        this.balance = balance;
    }

    public double getBalance() {
        return balance;
    }

    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
        } else {
            System.out.println("Invalid deposit amount!");
        }
    }

    public static void main(String[] args) {
        encapsulation account = new encapsulation(1000);
        account.deposit(500);
        System.out.println(account.getBalance());
    }
}
