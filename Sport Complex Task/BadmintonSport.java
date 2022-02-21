package com.company;

import java.util.*;

public class BadmintonSport {
    static Scanner scanner = new Scanner(System.in);
    LinkedHashMap<Integer, String> badmintonSlots;
    List<Integer> x;


    public void createBadmintonSlot() {
        this.badmintonSlots = new LinkedHashMap<>();
        this.x = new LinkedList<>();
        badmintonSlots.put(1, "07:00-08:00");
        badmintonSlots.put(2, "09:00-10:00");
        badmintonSlots.put(3, "10:30-11:30");
        badmintonSlots.put(4, "13:00-14:00");
        badmintonSlots.put(5, "16:00-17:00");
        badmintonSlots.put(6, "17:00-18:00");
        badmintonSlots.put(7, "18:00-19:00");
        badmintonSlots.put(8, "21:00-22:00");
        badmintonSlots.put(9, "22:00-23:00");
        badmintonSlots.put(10, "23:00-24:00");
    }

    public void displayBadmintonSlot() {
        for(Map.Entry bs : badmintonSlots.entrySet()){
            System.out.println(bs.getKey()+" "+bs.getValue());
        }
//        System.out.println(badmintonSlots);
    }

    public void bookBadmintonSlot() {
        LinkedHashMap<Integer, String> bookSlots = new LinkedHashMap<>();
        System.out.println("Enter the value:");
        int slotNumber = scanner.nextInt();
        boolean hasSlot = x.contains(slotNumber);
        if (!hasSlot) {
            String slotValue = badmintonSlots.remove(slotNumber);
            x.add(slotNumber);
            bookSlots.put(slotNumber, slotValue);
            System.out.println("Successfully booked sport ticket.\n"
                    + "name: " + SportComplex.name + "\n"
                    + "sport: badminton\n"
                    + "slot timings: " + slotValue);
        } else {
            System.out.println("Slot is already booked");
        }
    }
}
