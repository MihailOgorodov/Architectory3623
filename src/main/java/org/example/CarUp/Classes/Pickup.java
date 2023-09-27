package org.example.CarUp.Classes;

import org.example.CarUp.Enumerators.TypeCar;
import org.example.CarUp.Enumerators.TypeFuel;
import org.example.CarUp.Enumerators.TypeGearBox;
import org.example.CarUp.Interfaces.ICarWashStation;
import org.example.CarUp.Interfaces.IFuelStation;

import java.awt.*;

public class Pickup extends Car implements IFuelStation, ICarWashStation {

    private int loadCap;

    public Pickup(String make, String model,
                  int numberWheels, TypeFuel fuelType, TypeGearBox gearBoxType,
                  Color bodyColor, int engineCap, int loadCap) {
        super(make, model, TypeCar.PICKUP, numberWheels, fuelType, gearBoxType, bodyColor, engineCap);
        this.loadCap = loadCap;

    }

    @Override
    public void fuel() {

    }

    @Override
    public void wipWindshield() {

    }

    @Override
    public void wipHeadlights() {

    }

    @Override
    public void wipMirrors() {

    }
}
