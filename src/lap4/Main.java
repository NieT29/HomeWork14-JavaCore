package lap4;

import lap4.entities.Staff;
import lap4.service.HeadStaffService;
import lap4.service.StaffSaleService;
import lap4.service.StaffService;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Staff> staffs = new ArrayList<>();
        StaffService staffService = new StaffService();
        HeadStaffService headStaffService = new HeadStaffService();
        StaffSaleService staffSaleService = new StaffSaleService();

        staffService.inputStaff(scanner, staffs);
        headStaffService.inputHead(scanner, staffs);
        staffSaleService.inputStaffSale(scanner, staffs);
        staffService.delStaff(scanner, staffs);
        staffService.findBySalary(scanner,staffs);
        staffService.calTax(staffs);
        System.out.println(staffs);
    }
}
