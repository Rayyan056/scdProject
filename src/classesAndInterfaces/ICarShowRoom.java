package classesAndInterfaces;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */

/**
 *
 * @author Hp 820
 */

import java.rmi.*;
import java.util.ArrayList;

public interface ICarShowRoom extends Remote {
    public void addCar(Car obj) throws RemoteException;
    public void deleteCar(int id) throws RemoteException;
    public void updateCar(Car obj) throws RemoteException;
    public ArrayList<Car> getCars() throws RemoteException;
}
