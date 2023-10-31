package lap4.service;

import lap4.entities.HeadStaff;
import lap4.entities.Staff;
import lap4.utils.Utils;

import java.util.ArrayList;
import java.util.Scanner;

public class HeadStaffService {
    Utils utils = new Utils();
    public void inputHead(Scanner scanner, ArrayList<Staff> staffs) {
        System.out.println("Nhập số trưởng phòng muốn thêm: ");
        int n = utils.inputInt(scanner);
        for (int i = 0; i <n ; i++) {
            System.out.println("Nhập họ tên: ");
            String name = scanner.nextLine();
            System.out.println("Nhập lương: ");
            double salary = utils.inputDouble(scanner);
            System.out.println("Nhập lương trách nhiệm: ");
            double resSalary = utils.inputDouble(scanner);
            salary += resSalary;
            staffs.add(new HeadStaff(name,salary,resSalary));
        }
    }
}
