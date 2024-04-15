import java.util.Scanner;

public class Ans_4 {
    /*
    4. Write if else condition and print your group name in console else others group name.
     */
    public static void main(String[] args) {
        groupName();
    }

    private static void groupName() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please Enter Any Group Name");
        String name = sc.nextLine();
        if (name.equals("Code 2")) {
            System.out.println(name + " is my group");
        } else {
            System.out.println(name + " is not my group");
        }

    }
}
