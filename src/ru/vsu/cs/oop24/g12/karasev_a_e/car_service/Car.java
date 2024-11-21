package ru.vsu.cs.oop24.g12.karasev_a_e.car_service;

import java.awt.*;

import static ru.vsu.cs.oop24.g12.karasev_a_e.car_service.Test.nextN;

public class Car extends Vehicle {
    private int bodyType;
    private final int test3 = nextN();
    private final int test4;
    private static final int test7 = nextN();
    private static final int test8;
    public Car(){
        this.test4 = nextN();
    }
    static {
        test8 = nextN();
    }
    public Car(String brand, String model, String carNumber, int vinNumber, Color color) {
        super(brand, model, carNumber, vinNumber, color);
        this.test4 = nextN();
    }

    public static int getTest7() {
        return test7;
    }

    public static int getTest8() {
        return test8;
    }

    public int getTest3() {
        return test3;
    }


    public int getTest4() {
        return test4;
    }


    public int getBodyType() {
        return bodyType;
    }

    public void setBodyType(int bodyType) {
        this.bodyType = bodyType;
    }

    @Override
    public void diagnose(){
        System.out.println("Диагностика машины");
    }
    @Override
    public void changeOil(){
        System.out.println("Замена масла в машине");
    }
    @Override
    public void repaint(Color newColor){
        System.out.println("Покраска машины");
        setColor(newColor);
    }
    @Override
    public void changeTires(){
        System.out.println("Замена шин на машине");
    }
    @Override
    public int checkKilometer(){
        System.out.println("Проверка пробега машины");
        return 1000;
    }


}

