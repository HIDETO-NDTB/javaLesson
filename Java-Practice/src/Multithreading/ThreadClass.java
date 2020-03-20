package Multithreading;

class MyThread extends Thread{

	@Override
	public void run() {
		// TODO Auto-generated method stub
	    System.out.println("My thread running state");
	}
}

public class ThreadClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        MyThread obj = new MyThread();
        obj.start();
		
	}

}
