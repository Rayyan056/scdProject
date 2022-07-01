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

public class MyServer {

    public static void main(String[] args) {
        DBConnection connection = new DBConnection();
        connection.init();
        try {
            Registry registry = LocateRegistry.createRegistry(5000);
            ICarShowRoom stub = new ShowRoom(connection);
            try {
                registry.rebind("rmi://localhost:5000/ShowRoom", stub);
                System.out.println("ShowRoom Server is running....");
            } catch (Exception err) {
                System.err.println(err.getMessage());
            }
        } catch (RemoteException e) {
            System.err.println(e.getMessage());
        }
    }
}
