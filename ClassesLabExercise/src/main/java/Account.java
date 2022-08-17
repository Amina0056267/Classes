public class Account {

    public String id;
    public String name;
    public int balance;

    public String toString() {
        return "Account{" + "id='" + id + ", name='" + name + ", balance=" + balance + '}';
    }

    public Account(String personId, String personName, Integer personBalance) {
        this.id = personId;
        this.name = personName;
        this.balance = personBalance;
    }

//    METHODS

    public int getBalance() {
        return 100;
    }


    public String setId() { return this.id; }
    public String setName() { return this.name; }

    public void getName(String name) { this.name = name;}


    public void greet( String welcomeMessage) {
        System.out.println("Welcome to your account!");
    }
}
