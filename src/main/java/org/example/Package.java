package org.example;

import java.time.LocalDate;

public class Package{
   private String location;
   private int distance;
    private LocalDate date;
    private int value;

    public Package(String location, int distance, LocalDate date, int value){
        this.location = location;
        this.distance = distance;
        this.date = date;
        this.value = value;
    }
    public String getLocation(){
        return location;
    }
    public int getDistance(){
        return distance;
    }
    public LocalDate getDate(){
        return date;
    }
    public int getValue(){
        return value;
    }
}
