package classesAndInterfaces;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
/**
 *
 * @author Hp 820
 */
import java.rmi.*;
import java.rmi.server.*;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

public class ShowRoom extends UnicastRemoteObject implements ICarShowRoom {

    DBConnection connection;

    public ShowRoom() throws RemoteException {

    }

    public ShowRoom(DBConnection connection) throws RemoteException {
        super();
        this.connection = connection;
    }

    @Override
    public void addCar(Car obj) {
        String status = connection.insertData("INSERT INTO CAR(name, model, color, plateNumber) VALUES " + "('" + obj.getName() + "','" + obj.getModel() + "','" + obj.getColor() + "','" + obj.getPlateNumber() + "')");
        System.out.println(status);
    }

    @Override
    public void deleteCar(int id) {
        connection.deleteData("DELETE FROM Car WHERE id=" + id);
    }

    @Override
    public void updateCar(Car obj) {
        String query = "UPDATE CAR SET name =" + String.valueOf(obj.getName()) + ", model=" + String.valueOf(obj.getModel()) + ", color=" + obj.getColor() + ", plateNumber=" + obj.getPlateNumber();
        connection.updateData(query);
    }

    @Override
    public ArrayList<Car> getCars() {
        ResultSet result = connection.getData("SELECT * FROM CAR");

        try {
            ArrayList<Car> cars = new ArrayList<Car>();
            while (result.next()) {
                Car obj = new Car();
                obj.setId(result.getInt("id"));
                obj.setName(result.getString("name"));
                obj.setModel(result.getString("model"));
                obj.setColor(result.getString("color"));
                obj.setPlateNumber(result.getString("plateNumber"));
                cars.add(obj);
            }
            
//            for (Car car : cars) {
//                car.display();
//            }
            return (cars);
        } catch (Exception e) {
            System.err.println(e.getMessage());
            return null;
        }
    }
}
