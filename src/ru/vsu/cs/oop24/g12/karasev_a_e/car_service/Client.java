package ru.vsu.cs.oop24.g12.karasev_a_e.car_service;

import java.util.List;

public class Client {
    private String name;
    private String secondName;
    private String phoneNumber;

    public Client() {
    }

    public Client(String name, String secondName, String phoneNumber) {
        this.name = name;
        this.phoneNumber = phoneNumber;
        this.secondName = secondName;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSecondName() {
        return secondName;
    }

    public void setSecondName(String secondName) {
        this.secondName = secondName;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        if (numberСheck(phoneNumber))
            this.phoneNumber = phoneNumber;
    }

    private boolean numberСheck(String phoneNumber) {
        return true;
    }
    public void call(){
        System.out.println("Вы позвонили клиенту");
    }
    public static Client createClient(String person){
        String[] personInformation = person.split(" ");
        return new Client(personInformation[0],personInformation[1],personInformation[2]);
    }
}
