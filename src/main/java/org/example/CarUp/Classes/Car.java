package org.example.CarUp.Classes;

import org.example.CarUp.Enumerators.TypeCar;
import org.example.CarUp.Enumerators.TypeFuel;
import org.example.CarUp.Enumerators.TypeGearBox;

import java.awt.*;

public abstract class Car {

    private String make;
    private String model;
    private TypeCar bodyType;
    private int numberWheels;
    private TypeFuel fuelType;
    private TypeGearBox gearBoxType;
    private Color bodyColor;
    private int engineCap;

    public Car(String make, String model, TypeCar bodyType,
               int numberWheels, TypeFuel fuelType,
               TypeGearBox gearBoxType, Color bodyColor, int engineCap) {
        this.make = make;
        this.model = model;
        this.bodyType = bodyType;
        this.numberWheels = numberWheels;
        this.fuelType = fuelType;
        this.gearBoxType = gearBoxType;
        this.bodyColor = bodyColor;
        this.engineCap = engineCap;
    }

    public void movement() {

    }

    public void maintenance() {

    }

    public boolean turnLights() {
        return true;
    }

    public boolean turnWrappers() {
        return true;
    }

    public String getMake() {
        return make;
    }

    public void setMake(String make) {
        this.make = make;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public TypeCar getBodyType() {
        return bodyType;
    }

    public void setBodyType(TypeCar bodyType) {
        this.bodyType = bodyType;
    }

    public int getNumberWheels() {
        return numberWheels;
    }

    public void setNumberWheels(int numberWheels) {
        this.numberWheels = numberWheels;
    }

    public TypeFuel getFuelType() {
        return fuelType;
    }

    public void setFuelType(TypeFuel fuelType) {
        this.fuelType = fuelType;
    }

    public TypeGearBox getGearBoxType() {
        return gearBoxType;
    }

    public void setGearBoxType(TypeGearBox gearBoxType) {
        this.gearBoxType = gearBoxType;
    }

    public Color getBodyColor() {
        return bodyColor;
    }

    public void setBodyColor(Color bodyColor) {
        this.bodyColor = bodyColor;
    }

    public int getEngineCap() {
        return engineCap;
    }

    public void setEngineCap(int engineCap) {
        this.engineCap = engineCap;
    }
}
