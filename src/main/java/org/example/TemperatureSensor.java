package org.example;


import java.util.Random;

public class TemperatureSensor implements Sensor {
    private boolean isOn;

    public TemperatureSensor() {
        this.isOn = false;
    }

    @Override
    public boolean isOn() {
        return this.isOn;
    }

    @Override
    public void setOn() {
        this.isOn = true;
    }

    @Override
    public void setOff() {
        this.isOn = false;
    }

    @Override
    public int read() {
        if (!this.isOn) {
            throw new IllegalStateException("Temperature sensor is off.");
        }
        return new Random().nextInt(61) - 30;
    }
}
//src/main/java/application/TemperatureSensor.java
//package application;
//
//import java.util.Random;
//
//public class TemperatureSensor implements Sensor {
//
//
//    private boolean on;
//
//    @Override
//    public boolean isOn() {
//        return on;
//    }
//
//    @Override
//    public void setOn() {
//        on = true;
//    }
//
//    @Override
//    public void setOff() {
//        on = false;
//    }
//
//    @Override
//    public int read() {
//        if (!isOn()) {
//            throw new IllegalStateException();
//        }
//
//        Random rnd = new Random();
//        return rnd.nextInt(61) - 30;
//    }
//}