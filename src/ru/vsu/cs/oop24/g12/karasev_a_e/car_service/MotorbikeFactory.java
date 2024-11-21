package ru.vsu.cs.oop24.g12.karasev_a_e.car_service;

import java.awt.*;

public class MotorbikeFactory implements VehicleFactory {
    @Override
    public Vehicle createVehicle(String brand, String model, String carNumber, int vinNumber, Color color) {
        return new Motorbike(brand, model, carNumber, vinNumber, color);
    }
}
