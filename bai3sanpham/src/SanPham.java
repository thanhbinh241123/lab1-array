public class SanPham {
    // Thuộc tính
    private String ten;
    private double gia;
    private double giamGia;

    // Constructor có 3 tham số: tên, giá, giảm giá
    public SanPham(String ten, double gia, double giamGia) {
        this.ten = ten;
        this.gia = gia;
        this.giamGia = giamGia;
    }

    // Constructor có 2 tham số: tên và giá, mặc định giảm giá là 0
    public SanPham(String ten, double gia) {
        this(ten, gia, 0); // Gọi hàm tạo thứ nhất và đặt giảm giá bằng 0
    }

    // Phương thức tính thuế nhập khẩu (private)
    private double getThueNhapKhau() {
        return this.gia * 0.1; // 10% giá sản phẩm
    }

    // Phương thức xuất thông tin ra màn hình (public)
    public void xuat() {
        System.out.println("Tên sản phẩm: " + this.ten);
        System.out.println("Đơn giá: " + this.gia);
        System.out.println("Giảm giá: " + this.giamGia);
        System.out.println("Thuế nhập khẩu: " + this.getThueNhapKhau());
    }

    // Main method để chạy thử lớp SanPham
    public static void main(String[] args) {
        // Tạo sản phẩm có giảm giá
        SanPham sp1 = new SanPham("Laptop", 1500, 200);

        // Tạo sản phẩm không có giảm giá
        SanPham sp2 = new SanPham("Điện thoại", 800);

        // Xuất thông tin sản phẩm có giảm giá
        System.out.println("Thông tin sản phẩm 1:");
        sp1.xuat();

        // Xuất thông tin sản phẩm không có giảm giá
        System.out.println("\nThông tin sản phẩm 2:");
        sp2.xuat();
    }
}
