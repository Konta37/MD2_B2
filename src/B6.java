import java.util.Scanner;

public class B6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number=1;
//        do {
//            number = Integer.parseInt(sc.nextLine());
//        }while (number%5!=0 || number%7!=0 || number%11!=0);
        while (number%5!=0 || number%7!=0 || number%11!=0){
            number = Integer.parseInt(sc.nextLine());
        }

        System.out.println(number + " là số chia hết cho cả 5,7 và 11");

        //0,385,770 là số chia dc cho cả 5,7,11
    }
}
