package ru.vsu.cs.oop24.g12.karasev_a_e.people;


public class Human {
    private String name;
    private int height;
    public Human(){
    }
    public Human(String name, int height){
        this.height = height;
        this.name = name;
    }
    public String getName(){
        return name;
    }
    public int getHeight() {
        return height;
    }
    public void setHeight(int value){
        if (value < 30 || value > 215)
            throw new RuntimeException("FFFFFFFFFFF");
        height = value;
    }

}
