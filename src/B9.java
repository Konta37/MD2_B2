import java.util.Scanner;

public class B9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String choice;
        double lengthDimension, widthDimension, a, b, c, radiusDimension;
        do {
            System.out.println("Enter your choice (a, b, c, e to exit): ");
            choice = sc.nextLine();

            switch (choice) {
                case "a":
                    System.out.println("Nhập chiều dài hình CN: ");
                    lengthDimension = Double.parseDouble(sc.nextLine());
                    System.out.println("Nhập chiều rộng hình CN: ");
                    widthDimension = Double.parseDouble(sc.nextLine());
                    System.out.println(checkA(lengthDimension, widthDimension));
                    break;
                case "b":
                    System.out.println("Nhập cạnh đầu tiên hình tam giác: ");
                    a = Double.parseDouble(sc.nextLine());
                    System.out.println("Nhập cạnh thứ hai hình tam giác: ");
                    b = Double.parseDouble(sc.nextLine());
                    System.out.println("Nhập cạnh thứ ba hình tam giác: ");
                    c = Double.parseDouble(sc.nextLine());
                    System.out.println(checkB(a, b, c));
                    break;
                case "c":
                    System.out.println("Enter a radius: ");
                    radiusDimension = Double.parseDouble(sc.nextLine());
                    System.out.println(checkC(radiusDimension));
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

    public static String checkA(double lengthD, double widthD) {
        double perimeter = (lengthD + widthD) * 2;
        double area = lengthD * widthD;
        return "Chu vi hình chữ nhật là: " + perimeter + "và diện tích hình chữ nhật là: " + area;
    }

    public static String checkB(double firstLine, double secondLine, double thirdLine) {
        boolean flag,flag2 = true;
        flag = firstLine + secondLine > thirdLine && firstLine + thirdLine > secondLine
                && secondLine + thirdLine > firstLine;
        flag2 = firstLine > 0 && secondLine > 0 && thirdLine > 0;
        if (flag && flag2){
            double perimeter = firstLine + secondLine + thirdLine;
            double p = perimeter / 2;
            double area = Math.sqrt(p * (p - firstLine) * (p - secondLine) * (p - thirdLine));
            return "Chu vi hình tam giác là: " + perimeter + "và diện tích hình tam giác là: " + area;
        }else {
            return "3 cạnh vừa nhập chưa thoả mãn điều kiện trở thành 1 tam giác.";
        }

    }

    public static String checkC(double radiusD) {
        double perimeter = radiusD * 2 * Math.PI;
        double area = Math.PI * radiusD * radiusD;
        return "Chu vi hình tròn là: " + perimeter + " và diện tích hình tròn là: " + area;
    }
}
