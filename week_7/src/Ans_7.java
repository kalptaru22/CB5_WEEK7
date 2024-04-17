import java.util.Scanner;

public class Ans_7 {
    /*
    7. Write a java program to input any number and find out if it’s odd or even.
     */
    public static void main(String[] args) {
        oddEven();
    }

    private static void oddEven() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please Enter Any Number :  ");
        int num = sc.nextInt();
        if (num % 2 == 0) {
            System.out.println("Entered Number is an Even number");
        } else {
            System.out.println("Entered Number is an Odd number");
        }
    }
}
