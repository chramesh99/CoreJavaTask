package studentmedalstask;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class ValidateMarks {
	StudentMarks marks;
	HashMap<Integer, Double> store;
	HashMap<Integer, String> result;
	
	public ValidateMarks() {
		this.store = new HashMap<>();
		this.result = new HashMap<>();
	}
	public void addMarks() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the details regnumber and marks:");
		while(true) {
			int regNumber = sc.nextInt();
			if(regNumber != 0) {
				double stdMarks = sc.nextDouble();
				System.out.println("press '0' to exit");
				store.put(regNumber, stdMarks);
			}
			else {
				break;
			}
		}
	}
	public void marksValidate() {
		for(Map.Entry<Integer, Double> i : store.entrySet()) {
			if(i.getValue() >= 90) {
				result.put(i.getKey(), "Gold");
			}
			else if((i.getValue() >= 80) && (i.getValue() < 90)) {
				result.put(i.getKey(), "Silver");
			}
			else if((i.getValue() >= 70) && (i.getValue() < 80)) {
				result.put(i.getKey(), "Bronze");
			}
			else {
				result.put(i.getKey(), "there is no medal");
			}
		}
		System.out.println(result);
	}
}
