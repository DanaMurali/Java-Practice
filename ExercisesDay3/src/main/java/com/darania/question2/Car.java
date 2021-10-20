package com.darania.question2;

public class Car {

    private String carMake;
    private String carColor;
    private String numPlate;

    public Car(String carMake, String carColor, String numPlate) {
        this.carMake = carMake;
        this.carColor = carColor;
        this.numPlate = numPlate;
    }

    public String getCarMake() {
        return carMake;
    }

    public void setCarMake(String carMake) {
        this.carMake = carMake;
    }

    public String getCarColor() {
        return carColor;
    }

    public void setCarColor(String carColor) {
        this.carColor = carColor;
    }

    public String getNumPlate() {
        return numPlate;
    }

    public void setNumPlate(String numPlate) {
        this.numPlate = numPlate;
    }
}
