/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Hp 820
 */
public class Car {
    private String name;
    private String model;
    private String color;
    private String plateNumber;

    public Car() {
        this.name = "";
        this.model = "";
        this.color = "";
        this.plateNumber = "";
    }

    public Car(String name, String model, String color, String plateNumber) {
        this.name = name;
        this.model = model;
        this.color = color;
        this.plateNumber = plateNumber;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getPlateNumber() {
        return plateNumber;
    }

    public void setPlateNumber(String plateNumber) {
        this.plateNumber = plateNumber;
    }
}
