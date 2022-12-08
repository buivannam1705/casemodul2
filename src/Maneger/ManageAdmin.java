package Maneger;

import Main.MainAdmin;
import Model.Admin;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ManageAdmin {
    static Scanner scanner = new Scanner(System.in);
    static List<Admin> SaveAdmin = new ArrayList<>();
    static MainAdmin mainAdmin= new MainAdmin();


    public void carateAdmin() {
        Admin admin = new Admin("admin", "admin");
        SaveAdmin.add(admin);
    }

    public void loginAdmin() {
        System.out.println("Nhập Tài Khoản ");
        String Account = scanner.nextLine();
        if (CheckAccount(Account)) {
            System.out.println("Nhập Mật Khẩu ");
            String Pass = scanner.nextLine();
            if (CheckPass(Pass)){
                System.out.println("Đăng Nhập Thành Công ");
                mainAdmin.CreateMainAdmin();
            }else {
                System.out.println("Đăng Nhập Thất Bại ");
            }

        } else {
            System.out.println("Tài Khoản Không Đúng ");
        }

    }

    public boolean CheckAccount(String Account) {
        for (int i = 0; i < SaveAdmin.size(); i++) {
            if (Account.equals(SaveAdmin.get(i).getAccount())) {
                return true;

            }

        }
        return false;

    }

    public boolean CheckPass(String Pass) {
        for (int i = 0; i < SaveAdmin.size(); i++) {
            if (SaveAdmin.get(i).getPassword().equals(Pass)) {
                return true;
            }

        }
        return false;
    }

}
