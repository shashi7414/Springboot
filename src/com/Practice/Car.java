package com.Practice;


public class Car {

    private int doors;
    private int wheels;
    private String model;
    private String engine;
    private String colour;


    public void setModel(String model) {
        String validModel = model.toUpperCase();
        if (validModel.equals("Carrera") || validModel.equals("commodore")) {
            this.model = model;
        } else {
            this.model = "Unknown";

        }


    }


    public String getModel() {
        return this.model;
    }
}


