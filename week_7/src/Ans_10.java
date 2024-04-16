import java.util.Scanner;

public class Ans_10 {
    /*Write a java program input sales id, seller's name, sales amount, and salary basic and then
     fined this sales
     Commission
     Sales amount >= 50,000 35%
     Sales amount >= 30,000 20%
     >= 20,000 10%
     >= 10,000 5%
     < 10,000 2%*/
    public static void main(String[] args)
    {
        salCom();//CALLING STATIC METHOD DIRECTLY
    }

    public static void salCom() {//STATIC METHOD
        Scanner sc = new Scanner(System.in);//
        System.out.println("Please Enter Sales ID : ");
        int Id = sc.nextInt();//id
        System.out.println("Please Enter Seller's name: ");
        String Name = sc.next();//name
        System.out.println("Please Enter Sales Amount: ");
        int sa = sc.nextInt();//Sales amount
        System.out.println("Please Enter Basic Salary: ");
        int bs = sc.nextInt();

        System.out.println("Sales ID  :  "+Id);
        System.out.println("Seller's NAme  :  "  +Name);
        System.out.println("Sales Amount  :  "  +sa);
        System.out.println("Basic Salary  :  "  +bs);


        int salescommission;
        if (sa >= 50000) {
            salescommission = ((sa * 35) / 100);
            System.out.println("Sales Commission is:  " + salescommission);
        } else if (sa >= 30000) {
            salescommission = ((sa * 20) / 100);
            System.out.println("Sales Commission is:  " + salescommission);
        } else if (sa >= 20000) {
            salescommission = ((sa * 10) / 100);
            System.out.println("Sales Commission is:  " + salescommission);
        } else if (sa >= 10000) {
            salescommission = ((sa * 5) / 100);
            System.out.println("Sales Commission is:  " + salescommission);
        } else if (sa < 10000) {
            salescommission = ((sa * 2) / 100);
            System.out.println("Sales Commission is:  " + salescommission);
        }
    }
}
