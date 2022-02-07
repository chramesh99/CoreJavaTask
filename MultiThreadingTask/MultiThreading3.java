package MultiThreading;

class Thread2 extends Thread{
	public void run() {
		if(Thread.currentThread().isDaemon()) {
			System.out.println("This is Daemon Thread");
		}
		else {
			System.out.println("This is not Daemon Thread");
		}
	}
}

public class MultiThreading3 {
	public static void main(String[] args) {
		Thread2 t1 = new Thread2();
		Thread2 t2 = new Thread2();
		Thread2 t3 = new Thread2();
		t1.setName("dundiramesh");
		System.out.println(t1.getName());
		System.out.println(t1.isDaemon());
		t1.setDaemon(true);
		System.out.println(t1.isDaemon());
		t1.start();
		t2.start();
		t3.start();
	}
}
