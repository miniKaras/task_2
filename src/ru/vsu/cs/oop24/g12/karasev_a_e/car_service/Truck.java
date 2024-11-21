package ru.vsu.cs.oop24.g12.karasev_a_e.car_service;

import java.awt.*;

public class Truck extends Vehicle{
    private int tonnage;

    public Truck(String brand, String model, String carNumber, int vinNumber, Color color) {
        super(brand, model, carNumber, vinNumber, color);
    }

    public int getTonnage() {
        return tonnage;
    }

    public void setTonnage(int tonnage) {
        this.tonnage = tonnage;
    }
    @Override
    public void diagnose(){
        System.out.println("Диагностика грузовика");
    };
    @Override
    public void changeOil(){
        System.out.println("Замена масла в грузовике");
    };
    @Override
    public void repaint(Color newColor){
        System.out.println("Покраска грузовика");
        setColor(newColor);
    };
    @Override
    public void changeTires(){
        System.out.println("Замена шин на грузовике");
    };
    @Override
    public int checkKilometer(){
        System.out.println("Проверка пробега грузовика");
        return 1000;
    };
}
