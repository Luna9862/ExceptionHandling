package org.example;

public class StandardSensor implements Sensor {
    private final int value;

    public StandardSensor(int value) {
        this.value = value;
    }

    @Override
    public boolean isOn() {
        return true;
    }

    @Override
    public void setOn() {
        // Always on
    }

    @Override
    public void setOff() {
        // Always on
    }

    @Override
    public int read() {
        return this.value;
    }
}
//
//src/main/java/application/StandardSensor.java
//package application;
//
//public class StandardSensor implements Sensor {
//
//    private int value;
//
//    public StandardSensor(int value) {
//        this.value = value;
//    }
//
//    @Override
//    public boolean isOn() {
//        return true;
//    }
//
//    @Override
//    public void setOn() {
//    }
//
//    @Override
//    public void setOff() {
//    }
//
//    @Override
//    public int read() {
//        return value;
//    }
//}
