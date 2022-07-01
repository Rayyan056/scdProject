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
import java.rmi.registry.*;
public class CollegeClient {
    public ICollege getStub(){
        try {
            Registry registry = LocateRegistry.getRegistry("localhost",5000);
            ICollege stub = (ICollege)registry.lookup("rmi://localhost:5000/College");
            System.out.println("College Client is running...");
            return stub;
        } catch (Exception e) {
            System.err.println(e.getMessage());
            return null;
        }
    }
}