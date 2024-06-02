import java.util.Scanner;

public class B2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number: ");
        int number = sc.nextInt();
        if (number % 3 == 0 && number % 5 == 0) {
            System.out.println("Số có thể chia hết cho cả 3 và 5");
        }
        else{
            System.out.println("Số không chia hết cho cả 3 và 5");
        }

    }
}
