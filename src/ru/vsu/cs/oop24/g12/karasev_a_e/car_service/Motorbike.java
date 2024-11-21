package ru.vsu.cs.oop24.g12.karasev_a_e.car_service;

import java.awt.*;

public class Motorbike extends Vehicle {
    private int type;
    private boolean stroller;

    public Motorbike(String brand, String model, String carNumber, int vinNumber, Color color) {
        super(brand, model, carNumber, vinNumber, color);
    }


    public int getType() {
        return type;
    }

    public void setType(int type) {
        this.type = type;
    }

    public boolean isStroller() {
        return stroller;
    }

    public void setStroller(boolean stroller) {
        this.stroller = stroller;
    }

    @Override
    public void diagnose() {
        System.out.println("Диагностика мотоцикла");
    }

    @Override
    public void changeOil() {
        System.out.println("Замена масла в мотоцикле");
    }

    @Override
    public void repaint(Color newColor) {
        System.out.println("Покраска мотоцикла");
        super.setColor(newColor);
    }

    @Override
    public void changeTires() {
        System.out.println("Замена шин на мотоцикле");
    }

    @Override
    public int checkKilometer() {
        System.out.println("Проверка пробега мотоцикла");
        return 10000;
    }

    public void checkStroller() {
        if (stroller) {
            System.out.println("Мотоцикл c коляской");
        } else {
            System.out.println("Мотоцикл без коляски");
        }
    }
}
