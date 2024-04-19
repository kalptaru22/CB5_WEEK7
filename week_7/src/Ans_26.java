public class Ans_26 {
    /*
    26. Write a Java program to reverse a word.
    Sample Output:
    Input a word: dsaf
    Reverse word: fasd
     */
    public static void main(String[] args) {
        reverseAWord();
    }

    public static void reverseAWord() {
        String input = "dsaf";
        String output = "";

        for (int i = 0; i < input.length(); i++) {
            output = input.charAt(i) + output;
        }
        System.out.println(output);
    }
}
