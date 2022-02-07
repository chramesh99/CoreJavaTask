package MultiThreading;

class Thread4 extends Thread{
	public void run() {
		try {
			Thread.sleep(200);
		}
		catch (Exception e) {
			e.printStackTrace();
		}
	}
}

public class MultiThreading4 {
	public static void main(String[] args) {
		Thread4 t1 = new Thread4();
		System.out.println(t1.getState());
		t1.start();
		System.out.println(t1.getState());
	}
}
