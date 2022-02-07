package ArrayUpperAndLower;

import java.util.Arrays;
import java.util.Scanner;

public class ValidateArray {
	public void convert() {
		Scanner sc = new Scanner(System.in);
//		System.out.println("enter the size of an array");
//		int arraySize = sc.nextInt();
		String[] name = new String[5];
		System.out.println("Enter the name to insert");
		for(int i = 0 ; i < name.length; i++) {
			String nameString = sc.nextLine();
			name[i] = nameString;
		}
		Arrays.sort(name);
		for(int i = 0 ; i<name.length ; i++) {
			System.out.println(name[i]);
		}
		
		if(name.length % 2 == 0) {
//			String[] myArray1 = Arrays.copyOfRange(name,0,name.length/2);
//			String[] myArray2 = Arrays.copyOfRange(name, name.length/2, name.length);
			//String[] myArray3 = new String[name.length];
			for(int i = 0 ; i<name.length/2 ; i++) {
				name[i] = name[i].toUpperCase();
			}
			System.out.println(Arrays.toString(name));
		}
		else {
			for(int i = 0 ; i < (name.length/2)+1 ; i++) {
				name[i] = name[i].toUpperCase();
			}
			System.out.println(Arrays.toString(name));
		}
	}
}
