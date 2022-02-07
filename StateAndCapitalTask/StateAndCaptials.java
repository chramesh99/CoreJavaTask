package stateandcapital;

import java.util.HashMap;
import java.util.Scanner;

public class StateAndCaptials {
	public static void main(String[] args) {
		HashMap<String, String> map = new HashMap<>();
		map.put("101", "asd");
		map.put("102", "qwe");
		map.put("103", "zxc");
		map.put("104", "ert");
		System.out.println(map);
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the key to get the value:");
		String s = scanner.nextLine();
		System.out.println("The value based on the " + s + " is " + map.get(s));
	}
}
