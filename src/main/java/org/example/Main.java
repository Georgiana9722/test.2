package org.example;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.stream.Collectors;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        List<Package> packages = lPackages("packages.txt");

        Map<String, Map<LocalDate, List<Package>>> grouped = packages.stream()
                .collect(Collectors.groupingBy(Package::getLocation,
                Collectors.groupingBy(Package::getDate)));

        List<Thread> threads = new ArrayList<>();


    private static List<Package> lPackages(String fileName) throws Exception {
        List<String> lines = Files.readAllLines(Paths.get(fileName));
        List<Package> packages = new ArrayList<>();
        for (String line : lines) {
            String[] parts = line.split(",");
            packages.add(new Package(
                    parts[0].trim(),
                    Integer Integer.parseInt(parts[1].trim()),
                    Integer.parseInt(parts[2].trim()),
                    LocalDate.parse(parts[3].trim())
            ));
        }
        return packages;
    }
}