package com.company;

import java.util.*;

public class FootBallSport {
    static Scanner scanner = new Scanner(System.in);
    LinkedHashMap<Integer, String> footBallSlots;
    List<Integer> x;


    public void createFootBallSlot() {
        this.footBallSlots = new LinkedHashMap<>();
        this.x = new LinkedList<>();
        footBallSlots.put(1, "07:00-07:30");
        footBallSlots.put(2, "08:30-09:00");
        footBallSlots.put(3, "09:30-10:00");
        footBallSlots.put(4, "10:00-10:30");
        footBallSlots.put(5, "10:30-11:00");
        footBallSlots.put(6, "11:00-11:30");
        footBallSlots.put(7, "13:00-13:30");
        footBallSlots.put(8, "13:30-14:00");
        footBallSlots.put(9, "14:00-14:30");
        footBallSlots.put(10, "15:00-15:30");
        footBallSlots.put(11, "15:30-16:00");
        footBallSlots.put(12, "16:30-17:00");
        footBallSlots.put(13, "17:00-17:30");
        footBallSlots.put(14, "18:00-18:30");
        footBallSlots.put(15, "19:00-19:30");
        footBallSlots.put(16, "20:00-20:30");
        footBallSlots.put(17, "21:00-21:30");
        footBallSlots.put(18, "21:30-22:00");
        footBallSlots.put(19, "22:00-22:30");
        footBallSlots.put(20, "22:30-23:00");
    }

    public void displayFootBallSlot() {
        for(Map.Entry fbs : footBallSlots.entrySet()){
            System.out.println(fbs.getKey() + " " + fbs.getValue());
        }
//        System.out.println(footBallSlots);
    }

    public void bookFootBallSlot() {
        LinkedHashMap<Integer, String> bookSlots = new LinkedHashMap<>();
        System.out.println("Enter the value:");
        int slotNumber = scanner.nextInt();
        boolean hasSlot = x.contains(slotNumber);
        if (!hasSlot) {
            String slotValue = footBallSlots.remove(slotNumber);
            x.add(slotNumber);
            bookSlots.put(slotNumber, slotValue);
            System.out.println("Successfully booked sport ticket.\n"
                    + "name: " + SportComplex.name + "\n"
                    + "sport: FootBall\n"
                    + "slot timings: " + slotValue);
        } else {
            System.out.println("Slot is already booked");
        }
    }
}

