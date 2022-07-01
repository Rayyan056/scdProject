package classesAndInterfaces;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Hp 820
 */
public class Student {
    private String firstName;
    private String lastName;
    private String regNumber;
    private int age;
    private int semesterNumber;

    public Student() {
        this.firstName = "";
        this.lastName = "";
        this.regNumber = "";
        this.age = 0;
        this.semesterNumber = 0;
    }

    public Student(String firstName, String lastName, String regNumber, int age, int semesterNumber) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.regNumber = regNumber;
        this.age = age;
        this.semesterNumber = semesterNumber;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getRegNumber() {
        return regNumber;
    }

    public void setRegNumber(String regNumber) {
        this.regNumber = regNumber;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getSemesterNumber() {
        return semesterNumber;
    }

    public void setSemesterNumber(int semesterNumber) {
        this.semesterNumber = semesterNumber;
    }

}
