/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package classesAndInterfaces;

/**
 *
 * @author Hp 820
 */
import java.rmi.*;
import java.util.ArrayList;

public interface ICollege extends Remote {
    public void addStudent(Student obj) throws RemoteException;
    public void deleteStudent(String regNumber) throws RemoteException;
    public void updateStudent(Student obj) throws RemoteException;
    public ArrayList<Student> getStudents() throws RemoteException;
}
