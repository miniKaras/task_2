package ru.vsu.cs.oop24.g12.karasev_a_e.car_service;

import java.awt.*;

import static ru.vsu.cs.oop24.g12.karasev_a_e.car_service.Test.nextN;

public abstract class Vehicle {
    private String brand;
    private String model;
    private String carNumber;
    private int vinNumber;
    private final int test1 = nextN();
    private final int test2;
    private static final int test5 = nextN();
    private static final int test6;
    private Color color;
    public Vehicle(){
        this.test2 = nextN();
    }
    static {
        test6 = nextN();
    }

    public Vehicle(String brand, String model, String carNumber, int vinNumber, Color color) {
        this.brand = brand;
        this.model = model;
        this.carNumber = carNumber;
        this.vinNumber = vinNumber;
        this.color = color;
        this.test2 = nextN();
    }

    public static int getTest5() {
        return test5;
    }

    public static int getTest6() {
        return test6;
    }

    public int getTest1() {
        return test1;
    }

    public int getTest2() {
        return test2;
    }
    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getCarNumber() {
        return carNumber;
    }

    public void setCarNumber(String carNumber) {
        this.carNumber = carNumber;
    }

    public int getVinNumber() {
        return vinNumber;
    }

    public void setVinNumber(int vinNumber) {
        this.vinNumber = vinNumber;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    public abstract void diagnose();

    public abstract void changeOil();

    public abstract void repaint(Color newColor);

    public abstract  void changeTires();

    public abstract int checkKilometer();
}
