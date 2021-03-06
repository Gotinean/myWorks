package Client;

public abstract class Client
{
    private double balance = 0;
    private String client;

    public String getClient() {
        return client;
    }

    public void setClient(String client) {
        this.client = client;
    }

    public double getBalance() {
        return balance;
    }
    public double putMoney(double amount){
        balance = balance + amount;
        return balance;
    }
    public double withdrawMoney(double amount){
        if (amount > balance){
            return balance;
        }
        else {
            balance = balance - amount;
            return balance;
        }
    }
}
