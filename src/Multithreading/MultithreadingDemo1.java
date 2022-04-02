package Multithreading;

public class MultithreadingDemo1 {

	public static void main(String[] args) {
		ThreadDemo thread = new ThreadDemo();
		thread.start();
		System.out.println("I am main Thread");
	}

}

class ThreadDemo extends Thread{

	public void run() {
		
			System.out.println("I am MyThread");
		
	}
}