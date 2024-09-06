import java.util.ArrayList;
import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        // Khởi tạo ArrayList để lưu trữ các số thực
        ArrayList<Double> list = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        // Sử dụng vòng lặp while để nhập các số thực từ bàn phím
        while (true) {
            System.out.print("Nhập một số thực: ");
            Double x = scanner.nextDouble();
            list.add(x);

            // Yêu cầu người dùng nhập thêm hoặc dừng lại
            System.out.print("Nhập thêm (Y/N)? ");
            scanner.nextLine(); // Đọc bỏ dòng mới còn lại
            String choice = scanner.nextLine();
            if (choice.equalsIgnoreCase("N")) {
                break;
            }
        }

        // Sử dụng vòng lặp for-each để duyệt và xuất các phần tử của list
        System.out.println("Danh sách các số thực đã nhập:");
        for (Double num : list) {
            System.out.println(num);
        }

        // Tính tổng các số thực trong list
        double total = 0;
        for (Double num : list) {
            total += num;
        }

        // Xuất tổng của danh sách
        System.out.println("Tổng của các số thực là: " + total);

        scanner.close();
    }
}