package studentmarkstask;

import java.util.HashMap;
import java.util.Map;

public class Validate {
	StudentDetails detail;
	HashMap<String,Double> details;
	HashMap<String, String> result;
	public Validate() {
		this.details = new HashMap<>();
		this.result = new HashMap<>();
	}
	
	public void addDetails(String stdName, double stdMarks) {
		details.put(stdName, stdMarks);
	}
	
	public void check() {
		for(Map.Entry<String, Double> i : details.entrySet()) {
			//System.out.println(i);
			if(i.getValue() > 70) {
				//System.out.print(i.getKey() + " " + "pass");
				result.put(i.getKey(), "pass");
			}
			else {
				result.put(i.getKey(), "fail");
			}
		}
		System.out.println(result);
	}

//	@Override
//	public String toString() {
//		String output = "{ ";
//		for(Map.Entry<String, String> i : result.entrySet()) {
//		output += i.getKey() +": "+i.getValue()+" || ";
//	}
//		return output +" }" ;
//	}
	
	
//	public void getResults() {
//		check();
//		System.out.println(result);
//		for(Map.Entry<String, String> i : result.entrySet()) {
//			System.out.println(i.toString());
//		}
//	}
}
