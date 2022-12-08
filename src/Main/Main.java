package Main;

import Maneger.ManageAdmin;
import Maneger.ManageStudent;

import java.util.Scanner;

public class Main {
    static Scanner scanner= new Scanner(System.in);
    static ManageAdmin manageAdmin= new ManageAdmin();
    static ManageStudent manageStudent = new ManageStudent();



    public static void main(String[] args) {
        while (true){
            System.out.println("------MENU------");
            System.out.println("1.Đăng Nhập Admin ");
            System.out.println("2.Đăng Nhập Student ");
            System.out.println("3.Thoát ");
            int choie= Integer.parseInt(scanner.nextLine());
            switch (choie){
                case 1:
                    manageAdmin.carateAdmin();
                    manageAdmin.loginAdmin();
                    break;
                case 2:
                    manageStudent.loginStudent();
                    break;
                case 3:
                    System.exit(3);
                    break;
            }
        }
    }
}
