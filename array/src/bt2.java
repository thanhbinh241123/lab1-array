import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class bt2 {
    public static void main(String[] args) {
        ArrayList<String> nameList = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        boolean running = true;

        while (running) {
            System.out.println("\n--- Menu ---");
            System.out.println("1. Nhập danh sách họ và tên");
            System.out.println("2. Xuất danh sách vừa nhập");
            System.out.println("3. Xuất danh sách ngẫu nhiên");
            System.out.println("4. Sắp xếp giảm dần và xuất danh sách");
            System.out.println("5. Tìm và xóa họ tên nhập từ bàn phím");
            System.out.println("6. Kết thúc");
            System.out.print("Chọn một chức năng: ");
            int choice = Integer.parseInt(scanner.nextLine());

            switch (choice) {
                case 1:
                    // Nhập danh sách họ và tên
                    System.out.print("Nhập họ và tên (hoặc nhập 'exit' để dừng): ");
                    String name;
                    while (!(name = scanner.nextLine()).equalsIgnoreCase("exit")) {
                        nameList.add(name);
                        System.out.print("Nhập họ và tên (hoặc nhập 'exit' để dừng): ");
                    }
                    break;
                case 2:
                    // Xuất danh sách vừa nhập
                    System.out.println("\nDanh sách họ và tên đã nhập:");
                    for (String n : nameList) {
                        System.out.println(n);
                    }
                    break;
                case 3:
                    // Xuất danh sách ngẫu nhiên
                    ArrayList<String> randomList = new ArrayList<>(nameList);
                    Collections.shuffle(randomList);
                    System.out.println("\nDanh sách họ và tên ngẫu nhiên:");
                    for (String n : randomList) {
                        System.out.println(n);
                    }
                    break;
                case 4:
                    // Sắp xếp giảm dần và xuất danh sách
                    Collections.sort(nameList);
                    Collections.reverse(nameList);
                    System.out.println("\nDanh sách họ và tên sắp xếp giảm dần:");
                    for (String n : nameList) {
                        System.out.println(n);
                    }
                    break;
                case 5:
                    // Tìm và xóa họ tên nhập từ bàn phím
                    System.out.print("Nhập họ và tên cần xóa: ");
                    String deleteName = scanner.nextLine();
                    boolean found = false;
                    for (String n : nameList) {
                        if (n.equalsIgnoreCase(deleteName)) {
                            nameList.remove(n);
                            System.out.println("Đã xóa họ và tên: " + deleteName);
                            found = true;
                            break; // Ngắt vòng lặp sau khi xóa
                        }
                    }
                    if (!found) {
                        System.out.println("Không tìm thấy họ và tên: " + deleteName);
                    }
                    break;
                case 6:
                    // Kết thúc chương trình
                    running = false;
                    System.out.println("Kết thúc chương trình.");
                    break;
                default:
                    System.out.println("Chức năng không hợp lệ, vui lòng chọn lại.");
                    break;
            }
        }

        scanner.close();
    }
}

