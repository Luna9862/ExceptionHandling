package org.example;

import java.util.ArrayList;
import java.util.List;

public class AverageSensor implements Sensor {
    private final List<Sensor> sensors;
    private final List<Integer> readings;

    public AverageSensor() {
        this.sensors = new ArrayList<>();
        this.readings = new ArrayList<>();
    }

    public void addSensor(Sensor toAdd) {
        this.sensors.add(toAdd);
    }

    @Override
    public boolean isOn() {
        for (Sensor sensor : this.sensors) {
            if (!sensor.isOn()) {
                return false;
            }
        }
        return true;
    }

    @Override
    public void setOn() {
        for (Sensor sensor : this.sensors) {
            sensor.setOn();
        }
    }

    @Override
    public void setOff() {
        for (Sensor sensor : this.sensors) {
            sensor.setOff();
        }
    }

    @Override
    public int read() {
        if (this.sensors.isEmpty() || !this.isOn()) {
            throw new IllegalStateException("Average sensor is off or no sensors are added.");
        }

        int sum = 0;
        for (Sensor sensor : this.sensors) {
            sum += sensor.read();
        }

        int average = sum / this.sensors.size();
        this.readings.add(average);
        return average;
    }

    public List<Integer> readings() {
        return new ArrayList<>(this.readings);
    }
}
//src/main/java/application/AverageSensor.java
//package application;
//
//import java.util.ArrayList;
//import java.util.List;
//
//public class AverageSensor implements Sensor {
//
//    private List<Sensor> sensors;
//    private List<Integer> readings;
//
//    public AverageSensor() {
//        sensors = new ArrayList<>();
//        readings = new ArrayList<>();
//    }
//
//    public void addSensor(Sensor toAdd) {
//        sensors.add(toAdd);
//    }
//
//    public List<Integer> readings() {
//        return readings;
//    }
//
//    @Override
//    public boolean isOn() {
//        for (Sensor sensori : sensors) {
//            if (sensori.isOn()) {
//                return true;
//            }
//        }
//
//        return false;
//    }
//
//    @Override
//    public void setOn() {
//        for (Sensor sensori : sensors) {
//            sensori.setOn();
//        }
//    }
//
//    @Override
//    public void setOff() {
//        for (Sensor sensori : sensors) {
//            sensori.setOff();
//        }
//    }
//
//    @Override
//    public int read() {
//        if (!isOn()) {
//            throw new IllegalStateException();
//        }
//
//        int sum = 0;
//        for (Sensor sensori : sensors) {
//            sum += sensori.read();
//        }
//        int reading = sum / sensors.size();
//
//        readings.add(reading);
//
//        return reading;
//    }
//}
//