import java.util.Scanner;

public class Ans_15 {
    /*
    Write a program that tells us input value is number or an alphabet or symbol.
     */
    public static void main(String[] args) {
        numberAlphabetSymbol();

    }

    public static void numberAlphabetSymbol() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Alphabet/Number or a Symbol");
        char ch = sc.next().charAt(0);
        if (ch >= 'a' && ch <= 'z') {
            System.out.println(ch + " is an Alphabet");
        } else if (ch >= '0' && ch <= '9') {
            System.out.println(ch + " ia a Number");
        } else {
            System.out.println(ch + " is a Symbol");
        }

    }
}
