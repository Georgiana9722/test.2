package org.example;

import java.time.LocalDate;
import java.util.List;

public class DeliveryGroup(
        String location,
        int distancekm,
        LocalDate date,
        List<Package> packages ){

public int group(){
    return package.stream().mapToInt(Package::value).sum();
}
public int distance(){
    return distancekm;
}
}
