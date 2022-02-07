package studentmarkstask;

public class Main {
	public static void main(String[] args) {
		Validate v = new Validate();
		v.addDetails("ramesh", 75.0);
		v.addDetails("selva", 60.0);
		v.addDetails("abi", 73.0);
		v.addDetails("ram", 50.0);
		v.check();
		//System.out.println(v);
	}
}
