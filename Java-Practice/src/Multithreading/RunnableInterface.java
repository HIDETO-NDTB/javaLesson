package Multithreading;

class Count implements Runnable{

	@Override
	public void run() {
		// TODO Auto-generated method stub
		System.out.println("My thread is in running state");
	}
	
}




public class RunnableInterface {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Count obj = new Count();
		Thread tobj = new Thread(obj);
		tobj.start();

	}

}
