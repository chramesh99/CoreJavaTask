package com.company;

import java.util.*;

public class BoxCricketSport {
    static Scanner scanner = new Scanner(System.in);
    LinkedHashMap<Integer, String> boxCricketSlots;
    List<Integer> x;


    public void createBoxCricketSlot() {
        this.boxCricketSlots = new LinkedHashMap<>();
        this.x = new LinkedList<>();
        boxCricketSlots.put(1, "07:00-09:00");
        boxCricketSlots.put(2, "11:00-13:00");
        boxCricketSlots.put(3, "15:00-17:00");
        boxCricketSlots.put(4, "17:00-19:00");
        boxCricketSlots.put(5, "20:00-22:00");
    }

    public void displayBoxCricketSlot() {
        for(Map.Entry bcs : boxCricketSlots.entrySet()){
            System.out.println(bcs.getKey() + " " + bcs.getValue());
        }
//        System.out.println(boxCricketSlots);
    }

    public void bookBoxCricketSlot() {
        LinkedHashMap<Integer, String> bookSlots = new LinkedHashMap<>();
        System.out.println("Enter the value:");
        int slotNumber = scanner.nextInt();
        boolean hasSlot = x.contains(slotNumber);
        if (!hasSlot) {
            String slotValue = boxCricketSlots.remove(slotNumber);
            x.add(slotNumber);
            bookSlots.put(slotNumber, slotValue);
            System.out.println("Successfully booked sport ticket.\n"
                    + "name: " + SportComplex.name + "\n"
                    + "sport: BoxCricketSport\n"
                    + "slot timings: " + slotValue);
        } else {
            System.out.println("Slot is already booked");
        }
    }
}
