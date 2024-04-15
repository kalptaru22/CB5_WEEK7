import java.util.Scanner;

public class Ans_1 {
    /*
    1.  Write a java program that tells us that Input number is odd or even? HINT: use ternary
        operator (? :)
     */

    public static void main(String[] args) {
        oddEven();
    }

    public static void oddEven() {

        System.out.println("Please Enter a Number :"); //asking user for input
        Scanner sc = new Scanner(System.in); // scanner object
        int x = sc.nextInt();
        if (x % 2 == 0) {// if condition
            System.out.println("You Have Entered Number  " + x + ",  It is an Even Number. ");//If body
        } else {
            System.out.println("You Have Entered Number  " + x + ",  It is an Odd Number. ");//Else body
        }
    }
}
