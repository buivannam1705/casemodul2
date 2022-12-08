package Main;

import Maneger.ManageStudent;
import Maneger.ManageSubjects;

import java.util.Scanner;

public class MainStudnet {
    static Scanner scanner = new Scanner(System.in);
    static ManageStudent manageStudent2 = new ManageStudent();
    static ManageSubjects manageSubjects1= new ManageSubjects();

    public void mainStudent() {

            while (true) {
                System.out.println("1. Đổi Mật Khẩu ");
                System.out.println("2.Đăng Ký Môn Học ");
                System.out.println("3.Xem Thời Khóa Biểu ");
                System.out.println("4. Đăng Xuất ");
               try {
                   int choie = Integer.parseInt(scanner.nextLine());
                   switch (choie) {
                       case 1:
                           manageStudent2.fixpass();
                           break;
                       case 2:
                           manageSubjects1.RegisterSubjects();
                           break;
                       case 3:
                           manageSubjects1.showsave();
                           break;
                       case 4:
                           return;

                   }

               }catch (Exception e){

               }
            }

    }
}
