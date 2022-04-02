package Multithreading;

public class MultithreadingDemo {
	
	public static void main(String args[])throws InterruptedException {
		
		MyThread thread = new MyThread();
		thread.start();
		//Thread.sleep(6000);
		//Thread.yield();
		System.out.println(Thread.currentThread().getThreadGroup().getParent().getName());
		for(int i = 0; i<10; i++) {
			System.out.println("I am main Thread");
		}
	}
}

class MyThread extends Thread{

	public void run() {
		System.out.println(Thread.currentThread().getThreadGroup());
		for(int i = 0; i<10; i++) {
			
			System.out.println("I am MyThread");
			Thread.yield();
		}
	}
}
