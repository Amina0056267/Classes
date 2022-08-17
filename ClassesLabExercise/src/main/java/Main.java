import java.util.Scanner;

public class Main {

    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);

        Account myAccount = new Account("1", "Bob", 100);
        int myBalance = myAccount.getBalance();
        System.out.println(myAccount);
        System.out.println(myAccount.getBalance());


        // Circle


        Circle myCircle = new Circle(10);

        System.out.println("RADIUS: "+myCircle.getRadius());
        System.out.println("CIRCUMFERENCE: "+myCircle.getCircumference());


        myCircle.setRadius(15);

        System.out.println("RADIUS: "+myCircle.getRadius());
        System.out.println("CIRCUMFERENCE: "+myCircle.getCircumference());


        // Rectangle


        RectangleClass myRectangle = new RectangleClass(10, 12);

        System.out.println("PERIMETER :"+myRectangle.getPerimeter());
        System.out.println("AREA: "+myRectangle.getArea());
        System.out.println("DIAGONAL: "+myRectangle.getDiagonal());


        // Customer
        CustomerClass stan = new CustomerClass("stan", "moat", 100);

        System.out.println("FIRST NAME: "+ stan.getfirstName());
        System.out.println("HELD MONEY: "+ stan.getheldMoney());

        // - Using the subtractHeldMoney method
        stan.subtractheldMoney(20);
        System.out.println("HELD MONEY AFTER SUBTRACTION: "+ stan.getheldMoney());

        Account stanAccount = new Account("1", "Stan", 500);

        System.out.println(stanAccount.toString());






    }

}
