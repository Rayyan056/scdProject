/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package classesAndInterfaces;

/**
 *
 * @author Hp 820
 */

import java.rmi.*;
import java.rmi.server.*;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

public class College extends UnicastRemoteObject implements ICollege {
    DBConnection connection;

    public College() throws RemoteException {

    }

    public College(DBConnection connection) throws RemoteException {
        super();
        this.connection = connection;
    }

    @Override
    public void addStudent(Student obj) {
        String status = connection.insertData("INSERT INTO Student(firstName, lastName, regNumber, age, semesterNumber) VALUES " + "('" + obj.getFirstName() + "','" + obj.getLastName()+ "','" + obj.getRegNumber()+ "','" + obj.getAge()+ "','" + obj.getSemesterNumber()+ "')");
        System.out.println(status);
    }

    @Override
    public void deleteStudent(String regNumber) {
        connection.deleteData("DELETE FROM Student WHERE regNumber=" + regNumber);
    }

    @Override
    public void updateStudent(Student obj) {
        String query = "UPDATE Student SET firstName =" + String.valueOf(obj.getFirstName()) + ", lastName=" + String.valueOf(obj.getLastName()) + ", regNumber=" + obj.getRegNumber()+ ", age=" + obj.getAge()+ ", semesterNumber=" + obj.getSemesterNumber();
        connection.updateData(query);
    }

    @Override
    public ArrayList<Student> getStudents() {
        ResultSet result = connection.getData("SELECT * FROM Student");

        try {
            ArrayList<Student> students = new ArrayList<Student>();
            while (result.next()) {
                Student obj = new Student();
                obj.setFirstName(result.getString("firstName"));
                obj.setLastName(result.getString("lastName"));
                obj.setRegNumber(result.getString("regNumber"));
                obj.setAge(result.getInt("age"));
                obj.setSemesterNumber(result.getInt("semesterNumber"));
                students.add(obj);
            }
            return (students);
        } catch (Exception e) {
            System.err.println(e.getMessage());
            return null;
        }
    }
}
