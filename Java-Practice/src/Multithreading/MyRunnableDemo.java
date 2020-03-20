package Multithreading;


class RunnableDemo implements Runnable{

	Thread myThread;
	
	//Default Constructor
	RunnableDemo(){
		myThread = new Thread(this,"My runnable thread");
		System.out.println("My thread created"+myThread);
		myThread.start();
	}
	
	@Override
	public void run() {
		// TODO Auto-generated method stub
		try {
			for(int i=0;i<10;i++) {
				System.out.println("Printing the count "+i);
				Thread.sleep(1000);
			}
		}catch(InterruptedException e) {
			System.out.println("My thread interrupted");
		}
		System.out.println("My thread run is over");
	}
	
}



public class MyRunnableDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		RunnableDemo obj = new RunnableDemo();
		try {
			while(obj.myThread.isAlive()) {
				System.out.println("Main thread will be alive till the child thread is live");
				Thread.sleep(2000);
			}
		}catch(Exception e) {
			System.out.println("Main thread Interrupted");
		}
		System.out.println("Main thread's run is over");
	}
}
