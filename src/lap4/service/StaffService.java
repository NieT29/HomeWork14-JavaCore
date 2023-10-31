package lap4.service;

import lap4.entities.Staff;
import lap4.utils.Utils;

import java.util.ArrayList;
import java.util.Scanner;

public class StaffService {
    Utils utils = new Utils();
    public void inputStaff(Scanner scanner, ArrayList<Staff> staffs) {
        System.out.println("Nhập số nhân viên hành chính muốn thêm: ");
        int n = utils.inputInt(scanner);
        for (int i = 0; i < n; i++) {
            System.out.println("Nhập họ tên: ");
            String name = scanner.nextLine();
            System.out.println("Nhập lương: ");
            double salary = utils.inputDouble(scanner);
            staffs.add(new Staff(name, salary));
        }
    }

    public void delStaff(Scanner scanner, ArrayList<Staff> staffs) {
        System.out.println("Nhập id nhân viên muốn xóa: ");
        int id = utils.inputInt(scanner);
        for (Staff staff : staffs)
            if (id == staff.getId()) {
                staffs.remove(staff);
            }
    }

    public void findBySalary(Scanner scanner, ArrayList<Staff> staffs) {
        System.out.println("Nhập mức lương nhân viên bạn muốn tìm: ");
        double salary = utils.inputDouble(scanner);
        for (Staff staff : staffs) {
            if (salary == staff.getSalary()) {
                System.out.println("nhân viên có mức lương bạn tìm: "+staff);
            }
        }
    }

    public  void calTax(ArrayList<Staff> staffs) {
        for (Staff staff : staffs) {
            if (staff.getSalary() >= 11) {
                System.out.println("Tiền thuế nhân viên có id: "+ staff.getId() +" phải đóng là "+(staff.getSalary()*0.1));
            } else {
                System.out.println("Nhân viên có id là "+ staff.getId() +" không phải đóng thuế");
            }
        }
    }
}
