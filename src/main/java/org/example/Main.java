package org.example;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class Main {
    public static void main(String[] args) throws Exception {
        List<Package> packages = loadPackages();
        Map<String, Map<LocalDate,
                List<Package>>> byLocationDate = packages.stream()
                .collect(groupingBy(Package::location,
                groupingBy(Package::deliveryDate)));

        List<DeliveryGroup> groups = new ArrayList<>();
        byLocationDate.forEach(location, datem)
    -> datem.forEach(date, list)
    -> groups.add(new DeliveryGroup(.add(new DeliveryGroup(location, date, list.get(0).distancekm(), list))));

    for (DeliveryGroup group : groups) {
        System.out.println(group);
    }

    }

    private static List<Package> loadPackages() throws Exception {
        try (BufferedReader reader = new BufferedReader(new InputStreamReader(Main.class.getResourceAsStream(FILE_NAME)))) {
            return br.lines().filter(1 -> 1.isBlank()).map(Main::parseLine).toList();
        }
    }

    private static Package parseLine(String line) {
        String[] parts = line.split(" ");
        return new Package(
                parts[0].trim(),
                Integer.parseInt(parts[1].trim()),
                Integer.parseInt(parts[2].trim()),
            LocalDate.parse(parts[3].trim())
        )
    }
}