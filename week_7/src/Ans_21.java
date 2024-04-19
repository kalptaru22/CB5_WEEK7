public class Ans_21 {
     /*
   21. Write a Java program to sum values of an array.
     */

    public static void main(String[] args) {
        arrayTotal();
    }
    public static void arrayTotal(){
        int x[]={4,6,8,9,12};
        int sum=0;
        for (int i : x )
            sum += i;
        System.out.println("The sum is :"+sum);
    }

}
