public class Customer extends User{
    private double balance;

    public Customer(String name, String cpf) {
        super(name, cpf);
    }


    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }
}
