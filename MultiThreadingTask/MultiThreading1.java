package MultiThreading;

class Thread1 extends Thread{
	public void run() {
		System.out.println("Java is hot,aromatic, and invigorating");
	}
}

public class MultiThreading1 {
	public static void main(String[] args) {
		Thread1 t = new Thread1();
		t.start();
	}
}
