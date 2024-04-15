public class Ans_3 {
    /*
    3. Declare multidimensional array and store 5 countries and their capital and print them in
       console.
     */
    public static void main(String[] args) {
        multiDimensionalArray();
    }

    private static void multiDimensionalArray() {
        String[][] countries = {{"INDIA","ENGLAND","TURKEY","MOROCCO","ISRAEL"},
                               {"TEL AVIV","ISTANBUL","LONDON","DELHI","RABAT"}};
        System.out.println("COUNTRY  :  "+countries[0][0]+"     CAPITAL  :  "+countries[1][3]);
        System.out.println("COUNTRY  :  "+countries[0][1]+"   CAPITAL  :  "+countries[1][2]);
        System.out.println("COUNTRY  :  "+countries[0][2]+"    CAPITAL  :  "+countries[1][1]);
        System.out.println("COUNTRY  :  "+countries[0][3]+"   CAPITAL  :  "+countries[1][4]);
        System.out.println("COUNTRY  :  "+countries[0][4]+"    CAPITAL  :  "+countries[1][0]);

    }
}
