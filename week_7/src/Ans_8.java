import java.util.Scanner;

public class Ans_8 {
    /*
    8. Write a java program to get numbers from users and print whether it is positive or negative.
     */
    public static void main(String[] args) {
        positiveNegativeNumber();
    }

    public static void positiveNegativeNumber() {

        System.out.println("Please Enter any Number :");
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();//
        if (x >= 1) {
            System.out.println(x + " Is a Positive Number");
        } else if (x < 0) {
            System.out.println(x + " Is a Negative Number");
        } else if (x == 0) {
            System.out.println(x + " Is Zero");
        }

    }
}
