
public class Sanpham {
    // Thuộc tính
    private String ten;
    private double gia;
    private double giamGia;

    // Constructor
    public Sanpham(String ten, double gia, double giamGia) {
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

    // Main method để chạy thử lớp SanPham
    public static void main(String[] args) {
        // Tạo một đối tượng Sanpham
        Sanpham sp = new Sanpham("Laptop", 1500, 200);

        // Xuất thông tin sản phẩm ra màn hình
        sp.xuatThongTin();
    }
}
