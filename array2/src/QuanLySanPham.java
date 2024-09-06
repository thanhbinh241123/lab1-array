import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

class SanPham {
    String ten;
    Double donGia;

    public SanPham(String ten, Double donGia) {
        this.ten = ten;
        this.donGia = donGia;
    }

    @Override
    public String toString() {
        return "Tên sản phẩm: " + ten + ", Giá: " + donGia;
    }
}

public class QuanLySanPham {

    public static void main(String[] args) {
        ArrayList<SanPham> danhSachSanPham = new ArrayList<>();

        // Thêm sẵn một số sản phẩm ví dụ
        danhSachSanPham.add(new SanPham("Điện thoại", 15000.0));
        danhSachSanPham.add(new SanPham("Máy tính xách tay", 25000.0));
        danhSachSanPham.add(new SanPham("Máy tính bảng", 10000.0));
        danhSachSanPham.add(new SanPham("Tai nghe", 5000.0));
        danhSachSanPham.add(new SanPham("Bàn phím", 3000.0));

        Scanner sc = new Scanner(System.in);

        while (true) {
            menu();
            int luaChon = sc.nextInt();
            sc.nextLine(); // Đọc bỏ dòng trống

            switch (luaChon) {
                case 1:
                    nhap(danhSachSanPham, sc); // Nhập danh sách sản phẩm
                    break;
                case 2:
                    sapxep(danhSachSanPham); // Sắp xếp giảm dần theo giá và xuất danh sách
                    break;
                case 3:
                    xoa(danhSachSanPham, sc); // Tìm và xóa sản phẩm theo tên
                    break;
                case 4:
                    xuatGiaTrungBinh(danhSachSanPham); // Xuất giá trung bình của các sản phẩm
                    break;
                case 5:
                    System.out.println("Kết thúc chương trình.");
                    sc.close();
                    return;
                default:
                    System.out.println("Lựa chọn không hợp lệ.");
            }
        }
    }

    public static void menu() {
        System.out.println("\n====== MENU ======");
        System.out.println("1. Nhập danh sách sản phẩm");
        System.out.println("2. Sắp xếp giảm dần theo giá và xuất ra màn hình");
        System.out.println("3. Tìm và xóa sản phẩm theo tên");
        System.out.println("4. Xuất giá trung bình của các sản phẩm");
        System.out.println("5. Kết thúc");
        System.out.print("Chọn một tùy chọn: ");
    }

    public static void nhap(ArrayList<SanPham> danhSachSanPham, Scanner sc) {
        System.out.println("Nhập danh sách sản phẩm (nhập 'exit' để dừng): ");
        while (true) {
            System.out.print("Tên sản phẩm: ");
            String ten = sc.nextLine();
            if (ten.equalsIgnoreCase("exit")) {
                break;
            }
            System.out.print("Giá sản phẩm: ");
            Double gia = sc.nextDouble();
            sc.nextLine(); // Đọc bỏ dòng trống
            danhSachSanPham.add(new SanPham(ten, gia));
        }
    }

    public static void sapxep(ArrayList<SanPham> danhSachSanPham) {
        Comparator<SanPham> comp = new Comparator<SanPham>() {
            @Override
            public int compare(SanPham o1, SanPham o2) {
                return o2.donGia.compareTo(o1.donGia); // Sắp xếp giảm dần
            }
        };
        Collections.sort(danhSachSanPham, comp);

        System.out.println("Danh sách sản phẩm sau khi sắp xếp giảm dần theo giá:");
        for (SanPham sp : danhSachSanPham) {
            System.out.println(sp);
        }
    }

    public static void xoa(ArrayList<SanPham> danhSachSanPham, Scanner sc) {
        System.out.print("Nhập tên sản phẩm cần xóa: ");
        String tenCanXoa = sc.nextLine();

        boolean daXoa = false;
        for (int i = 0; i < danhSachSanPham.size(); i++) {
            if (danhSachSanPham.get(i).ten.equalsIgnoreCase(tenCanXoa)) {
                danhSachSanPham.remove(i);
                daXoa = true;
                System.out.println("Đã xóa sản phẩm: " + tenCanXoa);
                break;
            }
        }

        if (!daXoa) {
            System.out.println("Không tìm thấy sản phẩm có tên: " + tenCanXoa);
        }
    }

    public static void xuatGiaTrungBinh(ArrayList<SanPham> danhSachSanPham) {
        if (danhSachSanPham.isEmpty()) {
            System.out.println("Danh sách sản phẩm rỗng.");
            return;
        }

        double tongGia = 0;
        for (SanPham sp : danhSachSanPham) {
            tongGia += sp.donGia;
        }
        double giaTrungBinh = tongGia / danhSachSanPham.size();
        System.out.println("Giá trung bình của các sản phẩm: " + giaTrungBinh);
    }
}
