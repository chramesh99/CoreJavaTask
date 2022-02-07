package arraytask;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class DuplicatesArray {
	public void Dup() {
		ArrayList<Integer> list = new ArrayList<>();
		System.out.println("enter the elements:");
		Scanner sc = new Scanner(System.in);
		while(true) {
			int storeValue = sc.nextInt();
			System.out.println("Enter '0' to exit");
			if(storeValue != 0) {
				list.add(storeValue);
			}
			else {
				break;
			}
		}
		ArrayList<Integer> list2 = new ArrayList<>();
		for(Integer i : list) {
			if(!list2.contains(i)) {
				list2.add(i);
			}
		}
		Collections.sort(list2, Collections.reverseOrder());
		Object[] arr = list2.toArray();
		System.out.println("the decending order of the array is:");
		for(Object array : arr) {
			System.out.print(array + " ");
		}
	}
}
