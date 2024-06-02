import java.util.Scanner;

public class B4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập điểm toán");
        float mathScore = Float.parseFloat(sc.nextLine());
        System.out.println("Nhập điểm văn");
        float geoScore = Float.parseFloat(sc.nextLine());
        System.out.println("Nhập điểm anh");
        float engScore = Float.parseFloat(sc.nextLine());
        System.out.println("Nhập điểm lý");
        float phyScore = Float.parseFloat(sc.nextLine());
        System.out.println("Nhập điểm hoá");
        float chemScore = Float.parseFloat(sc.nextLine());
        float score = (mathScore + geoScore + engScore + phyScore + chemScore) / 5;
        if (score < 5) {
            System.out.println("Xếp loại yếu với số điểm trung bình là: " + score);
        } else if (score < 6.5 && score >= 5) {
            System.out.println("Xếp loại trung bình với số điểm trung bình là: " + score);
        } else if (score < 8 && score >= 6.5) {
            System.out.println("Xếp loại khá với số điểm trung bình là: " + score);
        } else if (score < 9 && score >= 8) {
            System.out.println("Xếp loại giỏi với số điểm trung bình là: " + score);
        } else if (score <= 10 && score >= 9) {
            System.out.println("Xếp loại xuất sắc với số điểm trung bình là: " + score);
        }
    }
}
