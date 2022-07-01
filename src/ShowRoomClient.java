/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Hp 820
 */

import java.rmi.*;
import java.rmi.registry.*;
public class ShowRoomClient {
    public ICarShowRoom getStub(){
        try {
            Registry registry = LocateRegistry.getRegistry("localhost",5000);
            ICarShowRoom stub = (ICarShowRoom)registry.lookup("rmi://localhost:5000/ShowRoom");
            System.out.println("Show Room Client is running...");
            return stub;
        } catch (Exception e) {
            System.err.println(e.getMessage());
            return null;
        }
    }
}
