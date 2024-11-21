package ru.vsu.cs.oop24.g12.karasev_a_e.car_service;


import java.awt.*;
import java.util.Date;

public class Repair_request {
    private Date filing_date;
    private Client client;
    private Vehicle vehicle;
    private String complaint;
    private boolean execution;

    public Repair_request() {
    }

    public Repair_request(Date filing_date, Client client, Vehicle vehicle, String complaint, boolean execution) {
        this.filing_date = filing_date;
        this.client = client;
        this.vehicle = vehicle;
        this.complaint = complaint;
    }

    public Vehicle getVehicle() {
        return vehicle;
    }

    public void setVehicle(Vehicle vehicle) {
        this.vehicle = vehicle;
    }

    public Date getFiling_date() {
        return filing_date;
    }

    public void setFiling_date(Date filing_date) {
        this.filing_date = filing_date;
    }

    public Client getClient() {
        return client;
    }

    public void setClient(Client client) {
        this.client = client;
    }

    public String getComplaint() {
        return complaint;
    }

    public void setComplaint(String complaint) {
        this.complaint = complaint;
    }

    public boolean isExecution() {
        return execution;
    }

    public void setExecution(boolean execution) {
        this.execution = execution;
    }

    

    public void updateRequestStatus(boolean status){
        setExecution(status);
    };
    public static Repair_request createRepairRequest(String person, String informationVehicle, Color color, int vinNumber, int vehicleType, String complaint){
        String[] vehicleInformation = informationVehicle.split(" ");
        Client client = Client.createClient(person);

        VehicleFactory factory;
        if (vehicleType == 1){
            factory = new CarFactory();
        }else if (vehicleType == 2){
            factory = new TruckFactory();
        }else{
            factory = new MotorbikeFactory();
        }
        Vehicle vehicle = factory.createVehicle(vehicleInformation[0],vehicleInformation[1],vehicleInformation[2],vinNumber,color );

        Date today = new Date();

        return new Repair_request(today,client,vehicle,complaint,false);
    }



}
