package Maneger;

import Main.MainStudnet;
import Model.Student;
import Model.Subject;
import ReadWrite.WriteAndRead;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ManageStudent {
    static Scanner scanner = new Scanner(System.in);
    static ArrayList<Student> SaveStudent = (ArrayList<Student>) WriteAndRead.read();
    static int IDStudent = -1;
    static MainStudnet mainStudent = new MainStudnet();
    WriteAndRead writeAndRead = new WriteAndRead();

    public void crateSutdent() {
        System.out.println(" Nhập tên tài khoản");
        String accout = scanner.nextLine();
        do {
            System.out.println(" Nhập mật khẩu");
            String pass = scanner.nextLine();
            if (pass.length() > 6 && pass.length() < 12) {
                System.out.println("Nhập tên");
                String name = scanner.nextLine();
                System.out.println(" Nhập tuổi");
                int age = Integer.parseInt(scanner.nextLine());
                System.out.println(" Nhập giới tính");
                String gender = scanner.nextLine();
                System.out.println("Đăng Ký Thành Công ");
                List<Subject> SaveSubjects = new ArrayList<>();
                Student student = new Student(accout, pass, name, age, gender, SaveSubjects);
                SaveStudent.add(student);
                WriteAndRead.write(SaveStudent);
                break;
            } else {
                System.out.println("Mật khẩu phải lớn hơn 6 và ít hơn 12");
            }
        } while (true);
    }

    public void loginStudent() {
        System.out.println("Nhập Tài Khoản ");
        String acount = scanner.nextLine();
        if (checkAcont(acount)) {
            System.out.println("Nhâp Mật Khẩu");
            String pass = scanner.nextLine();
            if (checkpass(pass)) {
                System.out.println("Đăng Nhập Thành Công ");
                mainStudent.mainStudent();
            } else {
                System.out.println("Đăng Nhập Thất Bại");
            }
        } else {
            System.out.println("Tài Khoản Không Tồn Tại");
        }

    }

    public boolean checkAcont(String acount) {
        for (int i = 0; i < SaveStudent.size(); i++) {
            if (SaveStudent.get(i).getAccount().equals(acount)) {
                IDStudent = i;
                return true;
            }

        }
        return false;
    }

    public boolean checkpass(String pass) {
        for (int i = 0; i < SaveStudent.size(); i++) {
            if (SaveStudent.get(i).getPassword().equals(pass)) {

                return true;
            }

        }
        return false;
    }

    public int checkibyacount(String acount) {
        for (int i = 0; i < SaveStudent.size(); i++) {
            if (SaveStudent.get(i).getAccount().equals(acount)) {
                return i;
            }

        }
        return -1;
    }


    public void fixpass() {
        System.out.println("Nhập Tài Khoản ");
        String acount = scanner.nextLine();

        if (checkibyacount(acount) == -1) {
            System.out.println("Không Tìm Ra Tài Khoản ");
        } else {
            int index = checkibyacount(acount);
            System.out.println("Nhập Mật Khẩu Cũ ");
            String pass = scanner.nextLine();
            if (checkpass(pass)) {
                System.out.println("Nhập Pass Mới ");
                String newPass = scanner.nextLine();
                SaveStudent.get(index).setPassword(newPass);
                System.out.println("Đổi Mật Khẩu Thành Công ");
                WriteAndRead.write(SaveStudent);

            } else {
                System.out.println("Sai Mật Khẩu Cũ");
            }
        }

    }

    public void deleteStudent() {
        System.out.println("Nhập Tài Khoản Muốn Xóa ");
        String acount = scanner.nextLine();
        if (checkibyacount(acount) == -1) {
            System.out.println("Không Tìm Ra Tài Khoản ");
        } else {
            int index = checkibyacount(acount);
            SaveStudent.remove(index);
            System.out.println("Xóa Thành Công ");
            WriteAndRead.write(SaveStudent);
        }
    }

    public void show() {
        for (int i = 0; i < SaveStudent.size(); i++) {
            System.out.println(SaveStudent.get(i).toString());
        }
    }

    public void findbyacount() {
        System.out.println("Nhập Tài Khoản Muốn Tìm ");
        String acount = scanner.nextLine();
        if (checkibyacount(acount) == -1) {
            System.out.println("Tài Khoản Không Tồn Tại ");
        } else {
            int index = checkibyacount(acount);
            System.out.println("Tài Khoản Bạn Muốn Có Thông Tin Là : ");
            System.out.println(SaveStudent.get(index).toString());
        }
    }

    public void edit() {
        System.out.println("Nhập Account Muốn Sửa ");
        String accout = scanner.nextLine();
        if (checkibyacount(accout) == -1) {
            System.out.println("Tài Khoản Không Tồn Tại ");
        } else {
            int index = checkibyacount(accout);
            System.out.println("Bạn Muốn Sửa Gì");
            System.out.println("1. Sửa Tên");
            System.out.println("2. Sửa Tuổi");
            System.out.println("3.Sửa giới Tính ");
            System.out.println("4. Thoát ");
            int choie = Integer.parseInt(scanner.nextLine());
            switch (choie) {
                case 1:
                    System.out.println("Nhập Tên Muốn Thay Đổi ");
                    String newName = scanner.nextLine();
                    SaveStudent.get(index).setName(newName);
                    System.out.println("Thành Công ");
                    WriteAndRead.write(SaveStudent);
                    break;
                case 2:
                    System.out.println("Nhập Tuổi Muốn Thay Đổi ");
                    int newage = Integer.parseInt(scanner.nextLine());
                    SaveStudent.get(index).setAge(newage);
                    System.out.println("Thành Công ");
                    WriteAndRead.write(SaveStudent);
                    break;
                case 3:
                    System.out.println("Nhập giới Tính Muốn Thay Đổi ");
                    String newgender = scanner.nextLine();
                    SaveStudent.get(index).setGender(newgender);
                    System.out.println("Thành Công ");
                    WriteAndRead.write(SaveStudent);
                    break;
                case 4:
                    return;
            }

        }

    }


}
