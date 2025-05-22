package org.example;

import java.time.LocalDate;
import java.util.List;

public class DeliveryGroup implements Runnable {
    private String location;
    private int distancekm;
    private LocalDate date;
    private List<Package> packages;

    public DeliveryGroup(String location, int distancekm, LocalDate date, List<Package> packages) {
        this.location = location;
        this.distancekm = distancekm;
        this.date = date;
        this.packages = packages;
    }

    public int groupValue() {
        return packages.stream().mapToInt(Package::getValue).sum();
    }

    public int revenue() {
        return distancekm;
    }

    @Override
    public void run() {
        System.out.println(location + "\t" + distancekm + "\t" + date);
        try {
            Thread.sleep(distancekm * 1000L);
        } catch (InterruptedException e ;){
            Thread.currentThread().interrupt();
        }
    }
}


