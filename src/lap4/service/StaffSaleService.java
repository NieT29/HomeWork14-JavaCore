package lap4.service;

import lap4.entities.Staff;
import lap4.entities.StaffSale;
import lap4.utils.Utils;

import java.util.ArrayList;
import java.util.Scanner;

public class StaffSaleService {
    Utils utils = new Utils();
    public void inputStaffSale(Scanner scanner, ArrayList<Staff> staffs) {
        System.out.println("Nhập số nhiên viên tiếp thị muốn thêm: ");
        int n = utils.inputInt(scanner);
        for (int i = 0; i < n; i++) {
            System.out.println("Nhập họ tên: ");
            String name = scanner.nextLine();
            System.out.println("Nhập lương: ");
            double salary = utils.inputDouble(scanner);
            System.out.println("Nhập doanh số bán hàng: ");
            double sales = utils.inputDouble(scanner);
            System.out.println("Nhập tỉ lệ hoa hồng: ");
            double commissionRate = utils.inputDouble(scanner);
            salary = salary + (sales*commissionRate);
            staffs.add(new StaffSale(name, salary, sales, commissionRate));
        }
    }
}
