import java.util.Scanner;

public class B8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String choice;
        int number;
        do {
            System.out.println("Enter your choice (a, b, c, e to exit): ");
            choice = sc.nextLine();

            switch (choice) {
                case "a":
                    System.out.println("Enter a number: ");
                    number = Integer.parseInt(sc.nextLine());
                    System.out.println(checkA(number));
                    break;
                case "b":
                    System.out.println("Enter a number: ");
                    number = Integer.parseInt(sc.nextLine());
                    System.out.println(checkB(number));
                    break;
                case "c":
                    System.out.println("Enter a number: ");
                    number = Integer.parseInt(sc.nextLine());
                    System.out.println(checkC(number));
                    break;
                case "e":
                    System.out.println("Exit");
                    break;
                default:
                    System.out.println("Invalid choice, please enter a valid option.");
                    break;
            }
        } while (!choice.equals("e"));
        sc.close();
    }

    public static String checkA(int realNumber) {
        if (realNumber % 2 == 0) {
            return realNumber + " là số chẵn";
        } else {
            return realNumber + " là số lẻ";
        }
    }

    public static String checkB(int realNumber) {
        int count = 0;
        if (realNumber < 2) {
            return "Số " + realNumber + " không là số nguyên tố";
        } else {
            for (int i = 3; i <= realNumber; i++) {
                if (realNumber % i == 0) {
                    count++;
                }
            }
            if (count > 2) {
                return "Số " + realNumber + " không là số nguyên tố";
            } else {
                return "Số " + realNumber + " là số nguyên tố";
            }
        }
    }

    public static String checkC(int realNumber) {
        if (realNumber % 3 == 0) {
            return realNumber + " là số chia hết cho 3";
        } else {
            return realNumber + " là số không chia hết cho 3";
        }
    }
}

