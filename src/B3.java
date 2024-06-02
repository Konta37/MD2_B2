import java.util.Scanner;

public class B3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        if(number >=100){
            int hundred = number/100;
            int dozens = number%100;
            int dozensReal = dozens/10;
            int unitRow = dozens%10;
            System.out.println(renameNumber(hundred)+" hundred and "+renameNumber2(dozensReal)+" "+renameNumber(unitRow));
        } else if (number>20) {
            int dozens = number/10;
            int unitRow = number%10;
            System.out.println(renameNumber2(dozens)+" "+renameNumber(unitRow));
        } else if (number>=10) {
            System.out.println(renameNumber3(number));
        } else if (number>=0) {
            System.out.println(renameNumber(number));
        }
    }
    //Hàng trăm
    public static String renameNumber (int realNumber){
        switch(realNumber){
            case 1: return "One";
            case 2: return "Two";
            case 3: return "Three";
            case 4: return "Four";
            case 5: return "Five";
            case 6: return "Six";
            case 7: return "Seven";
            case 8: return "Eight";
            case 9: return "Nine";
            case 0: return "Zero";
            default: return "Nothing";
        }
    }
    //trường hợp chỉ >=10 và <21
    public static String renameNumber3 (int realNumber){
        switch(realNumber){
            case 10: return "ten";
            case 11: return "eleven";
            case 12: return "twelve";
            case 13: return "thirteen";
            case 14: return "fourteen";
            case 15: return "fifteen";
            case 16: return "sixteen";
            case 17: return "seventeen";
            case 18: return "eighteen";
            case 19: return "nineteen";
            case 20: return "twenty";
            default: return "Nothing";
        }
    }
    //hàng chục
    public static String renameNumber2 (int realNumber){
        switch(realNumber){
            case 2: return "twenty";
            case 3: return "thirty";
            case 4: return "forty";
            case 5: return "fifty";
            case 6: return "sixty";
            case 7: return "seventy";
            case 8: return "eighty";
            case 9: return "ninety";
            default: return "Nothing";
        }
    }
}
