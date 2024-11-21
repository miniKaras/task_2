package ru.vsu.cs.oop24.g12.karasev_a_e.car_service;


import java.awt.*;

public class Main {
    public static void main(String[] args) {
        //Едет едет такой водила ХОБА смотрит 10к киломметров проехал, а масло не менял думает заскочука в самый лучший сервис
        //приходит к нам и говорит малице мне поменяйте
        //спрашиваем чё он кто он контактики берём
        String person = "Руслан Пикалов 89897646808";

        //смотрим и спрашиваем на каком монстре он приехал
        String car = "daewoo matiz о777оо193";

        //давай Repair_request делать
        Repair_request repairRequest = Repair_request.createRepairRequest(person,car, Color.BLACK,
                321323,1,"Маслице поменяйте");

        //меняем масло
        repairRequest.getVehicle().changeOil();

        //маслице поменяли теперь можно и статус обновить
        repairRequest.setExecution(true);

        //ну а теперь звоним говорим дело сделано
        repairRequest.getClient().call();



        Car testCar = new Car();
        Vehicle vehicle = new Car();
        System.out.println("В коде у родителя " + testCar.getTest1());
        System.out.println("В конструкотре у родителя " + testCar.getTest2());
        System.out.println("В коде у ребёнка " + testCar.getTest3());
        System.out.println("В кострукторе у ребёнка " + testCar.getTest4());
        System.out.println("В статик коде у родителя " + Vehicle.getTest5());
        System.out.println("В статик конструкотре у родителя " + Vehicle.getTest6());
        System.out.println("В статик коде у ребёнка " + Car.getTest7());
        System.out.println("В статик кострукторе у ребёнка " + Car.getTest8());
    }
}
