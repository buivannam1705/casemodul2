package Model;

import Model.Admin;
import Model.Subject;

import java.util.List;

public class Student extends Admin {
    private  String name;
    private int age;
    private String gender;
    public List<Subject>SaveSubjects;


    public Student(String taikhoan, String matkhau, String name, int age, String gender, List<Subject> saveSubjects) {
        super(taikhoan, matkhau);
        this.name = name;
        this.age = age;
        this.gender = gender;
        SaveSubjects = saveSubjects;
    }

    public Student() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public List<Subject> getSaveSubjects() {
        return SaveSubjects;
    }

    public void setSaveSubjects(List<Subject> saveSubjects) {
        SaveSubjects = saveSubjects;
    }

    @Override
    public String toString() {
        return "Student{" + super.toString()+
                "name='" + name + '\'' +
                ", age=" + age +
                ", gender='" + gender + '\'' +
                ", SaveSubjects=" + SaveSubjects +
                '}';
    }
}
