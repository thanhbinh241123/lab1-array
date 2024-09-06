
import java.util.Scanner;

public class Quanlysanpham {
    public static void main(String[] args) {
        // Tạo đối tượng Scanner để nhập dữ liệu từ bàn phím
        Scanner scanner = new Scanner(System.in);

        // Nhập thông tin cho sản phẩm 1
        System.out.println("Nhập thông tin sản phẩm 1:");
        System.out.print("Tên sản phẩm: ");
        String ten1 = scanner.nextLine();
        System.out.print("Giá sản phẩm: ");
        double gia1 = scanner.nextDouble();
        System.out.print("Giảm giá: ");
        double giamGia1 = scanner.nextDouble();

        // Tạo đối tượng Quanlysanpham.SanPham 1
        SanPham sp1 = new SanPham(ten1, gia1, giamGia1);

        // Nhập thông tin cho sản phẩm 2
        scanner.nextLine(); // Để đọc dòng trống sau khi nhập số
        System.out.println("Nhập thông tin sản phẩm 2:");
        System.out.print("Tên sản phẩm: ");
        String ten2 = scanner.nextLine();
        System.out.print("Giá sản phẩm: ");
        double gia2 = scanner.nextDouble();
        System.out.print("Giảm giá: ");
        double giamGia2 = scanner.nextDouble();

        // Tạo đối tượng Quanlysanpham.SanPham 2
        SanPham sp2 = new SanPham(ten2, gia2, giamGia2);

        // Xuất thông tin sản phẩm 1
        System.out.println("\nThông tin sản phẩm 1:");
        sp1.xuatThongTin();

        // Xuất thông tin sản phẩm 2
        System.out.println("\nThông tin sản phẩm 2:");
        sp2.xuatThongTin();

        // Đóng đối tượng Scanner
        scanner.close();
    }

    static class SanPham {
        // Thuộc tính
        private String ten;
        private double gia;
        private double giamGia;

        // Constructor
        public SanPham(String ten, double gia, double giamGia) {
            this.ten = ten;
            this.gia = gia;
            this.giamGia = giamGia;
        }

        // Phương thức tính thuế nhập khẩu
        public double tinhThueNhapKhau() {
            return this.gia * 0.1; // 10% giá sản phẩm
        }

        // Phương thức xuất thông tin ra màn hình
        public void xuatThongTin() {
            System.out.println("Tên sản phẩm: " + this.ten);
            System.out.println("Đơn giá: " + this.gia);
            System.out.println("Giảm giá: " + this.giamGia);
            System.out.println("Thuế nhập khẩu: " + this.tinhThueNhapKhau());
        }
    }
}

