package Maneger;

import Model.Subject;
import ReadWrite.WriteAndReadSubject;

import java.util.ArrayList;
import java.util.Scanner;

public class ManageSubjects {
    static Scanner scanner = new Scanner(System.in);
    static ArrayList<Subject> SaveSubjects = (ArrayList<Subject>) WriteAndReadSubject.read();


    public void creteSubjects() {
        System.out.println("Nhập Tên Môn Học ");
        String namesubjects = scanner.nextLine();
        System.out.println("Nhập Số Tín Chỉ ");
        int Number = Integer.parseInt(scanner.nextLine());
        System.out.println("Thêm Môn học thành công");
        int tuition = Number * 1000;
        Subject subject = new Subject(namesubjects, Number, tuition);
        SaveSubjects.add(subject);
        WriteAndReadSubject.write(SaveSubjects);
    }


    public int checkNameSubjects(String namesubjects) {
        for (int i = 0; i < SaveSubjects.size(); i++) {
            if (namesubjects.equals(SaveSubjects.get(i).getNamesubjects())) {
                return i;
            }

        }
        return -1;

    }


    public void deleteSubjects() {
        System.out.println("Nhập Tên Môn Học Muốn Xóa");
        String namesubjects = scanner.nextLine();
        if (checkNameSubjects(namesubjects) == -1) {
            System.out.println("Môn Học Muốn Xóa Không Tồn Tại");
        } else {
            int index = checkNameSubjects(namesubjects);
            SaveSubjects.remove(index);
            System.out.println("Thành Công");
            WriteAndReadSubject.write(SaveSubjects);
        }
    }

    public void showSubjects() {
        for (int i = 0; i < SaveSubjects.size(); i++) {
            System.out.println(SaveSubjects.get(i).toString());

        }

    }

    public void editSubjects(){
        System.out.println("Nhập Môn Học Muốn Sửa");
        String NameSubjects= scanner.nextLine();
        if (checkNameSubjects(NameSubjects)==-1){
            System.out.println("Môn Học Muốn Sửa Không Tồn Tại");
        }else {
            int index=checkNameSubjects(NameSubjects);
            System.out.println("1. Sửa Tên Môn Học ");
            System.out.println("2. Sửa Số Tín Chỉ");
            System.out.println("3. Thoát");
            int choie= Integer.parseInt(scanner.nextLine());
            switch (choie){
                case 1:
                    System.out.println("Nhập Tên Muốn Thay Đổi ");
                    String newName= scanner.nextLine();
                    SaveSubjects.get(index).setNamesubjects(newName);
                    System.out.println("Thành Công ");
                    WriteAndReadSubject.write(SaveSubjects);
                    break;
                case 2:
                    System.out.println("Nhập Số Tín Muốn Thay Đổi");
                    int newNumberof= Integer.parseInt(scanner.nextLine());
                    SaveSubjects.get(index).setNumberofsubjects(newNumberof);
                    System.out.println("Thành Công");
                    WriteAndReadSubject.write(SaveSubjects);
                    break;
                case 3:
                    return;
            }
        }
    }


    public int checkindex(int index){
        for (int i = 0; i < SaveSubjects.size(); i++) {
            if ((index-1)==i){
                return i;
            }

        }
        return -1;
    }

    public void RegisterSubjects(){
        showSubjects();
        System.out.println("Chọn Môn Học Muốn Đăng Kí( Nhập số để chọn ) ");
        int index= Integer.parseInt(scanner.nextLine());
        if (checkindex(index)==-1){
            System.out.println("Môn Học Muốn Đăng Kí không Tồn Tại ");
        }else {
            int index1=checkindex(index);
            ManageStudent.SaveStudent.get(ManageStudent.IDStudent).SaveSubjects.add(SaveSubjects.get(index1));
            System.out.println("Thành Công ");
            WriteAndReadSubject.write(SaveSubjects);
        }

    }
    public void showsave(){
        for (int i = 0; i < ManageStudent.SaveStudent.get(ManageStudent.IDStudent).SaveSubjects.size(); i++) {
            System.out.println(ManageStudent.SaveStudent.get(ManageStudent.IDStudent).SaveSubjects.get(i).toString());
        }
    }





































}
