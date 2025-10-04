package com.student1;

public class Student {
    private int student_Id;
    private String student_Name;
    private String student_City;
    private String student_Phone;

    public Student(int student_Id, String student_Name, String student_City, String student_Phone) {
        this.student_Id = student_Id;
        this.student_Name = student_Name;
        this.student_City = student_City;
        this.student_Phone = student_Phone;
    }

    public Student(String student_Name, String student_Phone, String student_City) {
        this.student_Name = student_Name;
        this.student_City = student_City;
        this.student_Phone = student_Phone;
    }

    public Student() {
        super();
    }

    @Override
    public String toString() {
        return "Student{" +
                "student_Id=" + student_Id +
                ", student_Name='" + student_Name + '\'' +
                ", student_City='" + student_City + '\'' +
                ", student_Phone=" + student_Phone +
                '}';
    }

    public int getStudent_Id() {
        return student_Id;
    }

    public void setStudent_Id(int student_Id) {
        this.student_Id = student_Id;
    }

    public String getStudent_Name() {
        return student_Name;
    }

    public void setStudent_Name(String student_Name) {
        this.student_Name = student_Name;
    }

    public String getStudent_City() {
        return student_City;
    }

    public void setStudent_City(String student_City) {
        this.student_City = student_City;
    }

    public String getStudent_Phone() {
        return student_Phone;
    }

    public void setStudent_Phone(String student_Phone) {
        this.student_Phone = student_Phone;
    }


}
