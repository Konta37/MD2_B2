import java.util.Scanner;

public class B7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number;
        number = Integer.parseInt(sc.nextLine());
        int count=0;
        if( number<2){
            System.out.println("Số " + number + " không là số nguyên tố");
        }else{
            for (int i = 3; i <= number; i++) {
                if (number % i == 0) {
                    count++;
                }
            }
            if(count>2){
                System.out.println("Số " + number + " không là số nguyên tố");
            }else {
                System.out.println("Số "+number+ " là số nguyên tố");
            }
        }

    }
}
