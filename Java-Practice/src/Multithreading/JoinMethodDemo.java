package Multithreading;

class MyClass implements Runnable{

	@Override
	public void run() {
		// TODO Auto-generated method stub
		Thread th = Thread.currentThread();
		System.out.println("Thread Started: "+th.getName());
		try {
			Thread.sleep(4000);
		}catch(Exception e) {
			e.printStackTrace();
		}
		System.out.println("Thread ended: "+th.getName());
	}
	
}

public class JoinMethodDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		MyClass obj = new MyClass();
		Thread th1 = new Thread(obj,"th1");
		Thread th2 = new Thread(obj,"th2");
		Thread th3 = new Thread(obj,"th3");
		
		//Thread th1 = new Thread(new MyClass(),"th1");
		
		th1.start();
		
		try {
			th1.join();
		}catch(Exception e) {
            e.printStackTrace();
	    }
		th2.start();
		
		try {
			th2.join();
		}catch(Exception e) {
            e.printStackTrace();
	    }
		th3.start();
		
		try {
			th3.join();
		}catch(Exception e) {
            e.printStackTrace();
	    }
		
		System.out.println("All three threads have finished execution");
	}
}
