package MultiThreading;

class RunnableInterface implements Runnable{
	static int c;
	public void run() {
		int a = 10;
		int b = 20;
		c = a + b;
	}
}

class RunnableInterface1 implements Runnable{
	static int result;
	public void run() {
		int a = 10;
		int b = 20;
		result = (a + b)/2;
	}
}

class RunnableInterface2 implements Runnable{
	public void run() {
		System.out.println(RunnableInterface.c);
		System.out.println(RunnableInterface1.result);
	}
}

public class MultiThreading2 {
	public static void main(String[] args) {
		RunnableInterface thread = new RunnableInterface();
		Thread t1 = new Thread(thread);
		t1.start();
		RunnableInterface1 thread1 = new RunnableInterface1();
		Thread t2 = new Thread(thread1);
		t2.start();
		RunnableInterface2 thread2 = new RunnableInterface2();
		Thread t3 = new Thread(thread2);
		t3.start();
	}
}
