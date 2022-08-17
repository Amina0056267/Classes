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

    public String getId(){
        return id;
    }
    public void setId(String id) {
         this.id = id;}

   public String getName(){
        return name;
   }

    public String setName() {
        return this.name;
    }

    public int getBalance() {
        return balance;
    }

    public void getName(String name) {
        this.name = name;}

    public void setBalance(int balance){
        this.balance = balance;
    }

    public void greet( String welcomeMessage) {
        System.out.println("Welcome to your account!");
    }


    }


