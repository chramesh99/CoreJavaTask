package parkingslottask;

import java.util.ArrayList;
import java.util.Scanner;

public class SlotsForBike {
	ArrayList<Integer> slotB = new ArrayList<>();
	public void forBike() {
		System.out.println("enter the parking slot:");
		Scanner sc = new Scanner(System.in);
		int slot = sc.nextInt();
		for(int i = 0 ; i <=slot ; i++) {
			if(slot>=15) {
				System.out.println("all slots are full");
				break;
			}
			else if((slotB.contains(slot)) && (slot<=15)) {
				System.out.println("The slot is already parked please select another slot");
				break;
			}
			else if(!((slotB.contains(slot) && (slot<=15)))){
				slotB.add(slot);
				System.out.println("The slot is allocated for " + slot + " this vehical");
				break;
			}
		}
		sc.close();
	}
	public void forBikeSlots() {
		while(true) {
			System.out.println("Enter 1 for allocate bike slot");
			System.out.println("Enter 2 for allocate car slot");
			System.out.println("Enter the value:");
			Scanner scanner = new Scanner(System.in);
			int value = scanner.nextInt();
			switch(value) {
			case 1:{
				forBike();
				break;
			}
			case 2:{
				System.out.println("over");
				break;
			}
			}
			System.out.println();
			scanner.close();
		}
	}
}
