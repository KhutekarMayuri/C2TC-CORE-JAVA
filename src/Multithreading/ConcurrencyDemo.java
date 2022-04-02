package Multithreading;

import java.util.concurrent.locks.ReentrantLock;

public class ConcurrencyDemo {

	public static void main(String[] args) {
		
		ReentrantLock l = new ReentrantLock();
		l.lock();
		l.lock();
		l.lock();
		System.out.println(l.isHeldByCurrentThread());
		
		System.out.println(l.isLocked());
		l.unlock();
		l.unlock();
		l.unlock();
		
		System.out.println(l.isLocked());
		
		System.out.println(l.getQueueLength());
		
		System.out.println(l.isHeldByCurrentThread());

	}

}
