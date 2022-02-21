package com.company;

import java.util.*;

public class SportComplex {
    BadmintonSport bs = new BadmintonSport();
    FootBallSport fs = new FootBallSport();
    BoxCricketSport bsc = new BoxCricketSport();
    Scanner scanner = new Scanner(System.in);
    static String name;

    public void selectSport() {
        boolean nextStep = true;
        bs.createBadmintonSlot();
        fs.createFootBallSlot();
        bsc.createBoxCricketSlot();
        while (nextStep) {
            System.out.println("Enter your name: ");
            name = scanner.next();
            System.out.println("1.Badminton");
            System.out.println("2.FootBall");
            System.out.println("3.BoxCricketSport");
            System.out.println("Enter number of the sport : ");
            int sportNumber = scanner.nextInt();
            switch (sportNumber) {
                case 1: {
                    System.out.println(" you have selected the Badminton And the slots are : ");
                    bs.displayBadmintonSlot();
                    bs.bookBadmintonSlot();
                    break;
                }
                case 2: {
                    System.out.println(" you have selected the FootBall");
                    fs.displayFootBallSlot();
                    fs.bookFootBallSlot();
                    break;
                }
                case 3: {
                    System.out.println(" you have selected the BoxCricketSport");
                    bsc.displayBoxCricketSlot();
                    bsc.bookBoxCricketSlot();
                    break;
                }
                default: {
                    System.out.println(sportNumber + " you have entered invalid input");
                }
            }
            System.out.println("want to book another slot enter true");
            System.out.println("For stop enter false");
            nextStep = scanner.nextBoolean();
        }
    }
}
