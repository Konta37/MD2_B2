import java.util.Scanner;

public class B10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double a,b,c;
        do{
            System.out.println("Nhập cạnh đầu tiên hình tam giác: ");
            a = Double.parseDouble(sc.nextLine());
            System.out.println("Nhập cạnh thứ hai hình tam giác: ");
            b = Double.parseDouble(sc.nextLine());
            System.out.println("Nhập cạnh thứ ba hình tam giác: ");
            c = Double.parseDouble(sc.nextLine());
            if(!checkTriagle(a,b,c)){
                System.out.println("Bạn đã nhập sai. Mời nhập lại 3 cạnh.");
            }else {
                System.out.println("3 cạnh bạn nhập thoả mãn điều kiện.");
            }
        }while (!checkTriagle(a, b, c));
        double perimeter = a + b + c;
        double p = perimeter / 2;
        double area = Math.sqrt(p * (p - a) * (p - b) * (p - c));
        System.out.println("Chu vi hình tam giác là: " + perimeter + "và diện tích hình tam giác là: " + area);
    }
    public static boolean checkTriagle(double firstLine, double secondLine, double thirdLine) {
        boolean flag,flag2 = true;
        flag = firstLine + secondLine > thirdLine && firstLine + thirdLine > secondLine
                && secondLine + thirdLine > firstLine;
        flag2 = firstLine > 0 && secondLine > 0 && thirdLine > 0;
        return flag && flag2;

    }
}
