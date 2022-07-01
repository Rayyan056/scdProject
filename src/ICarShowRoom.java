/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */

/**
 *
 * @author Hp 820
 */

import java.rmi.*;

public interface ICarShowRoom extends Remote {
    public void addCar(Car obj) throws RemoteException;
    public void deleteCar(int id);
    public void updateCar(Car obj);
    public Car getCars();
}
