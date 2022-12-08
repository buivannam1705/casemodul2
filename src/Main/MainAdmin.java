package Main;

import Maneger.ManageStudent;
import Maneger.ManageSubjects;

import java.util.Scanner;

public class MainAdmin {
    static Scanner scanner = new Scanner(System.in);
    static ManageStudent manageStudent = new ManageStudent();
    static ManageSubjects manageSubjects = new ManageSubjects();

    public void CreateMainAdmin() {
        try {
            while (true) {
                System.out.println("1. Đăng Kí Sinh Viên ");
                System.out.println("2. Xoá Sinh Viên ");
                System.out.println("3. Sửa sinh Viên ");
                System.out.println("4. Hiển Thị Sinh Viên ");
                System.out.println("5. Tìm Sinh Viên ");
                System.out.println("6. Thêm Môn Học ");
                System.out.println("7. Sửa Môn Học ");
                System.out.println("8. Xóa Môn Học ");
                System.out.println("9. Hiển Thị Môn Học ");
                System.out.println("10. Đăng Xuất");
                int choie = Integer.parseInt(scanner.nextLine());
                switch (choie) {
                    case 1:
                        manageStudent.crateSutdent();
                        break;
                    case 2:
                        manageStudent.deleteStudent();
                        break;
                    case 3:
                        manageStudent.edit();
                        break;
                    case 4:
                        manageStudent.show();
                        break;
                    case 5:
                        manageStudent.findbyacount();
                        break;
                    case 6:
                        manageSubjects.creteSubjects();
                        break;
                    case 7:
                        manageSubjects.editSubjects();
                        break;
                    case 8:
                        manageSubjects.deleteSubjects();
                        break;
                    case 9:
                        manageSubjects.showSubjects();
                        break;
                    case 10:
                        return;

                }
            }
        } catch (NumberFormatException e) {

        }

    }

}
