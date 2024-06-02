import java.util.Scanner;

public class B5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int total = 0;
        System.out.println("Nhập số đầu: ");
        int startNumber = Integer.parseInt(sc.nextLine());
        System.out.println("Nhập số cuối: ");
        int endNumber = Integer.parseInt(sc.nextLine());
        for (int i = startNumber; i <= endNumber; i++) {
            if(i%2==0){
                total += i;
            }
        }
        System.out.println(total);
    }
}
