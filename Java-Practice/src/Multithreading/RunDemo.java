package Multithreading;

public class RunDemo implements Runnable{
	
	@Override
	public void run() {
		// TODO Auto-generated method stub
		for(int i=1;i<=3;i++) {
			try {
				Thread.sleep(1000);
			}catch(Exception e) {
				e.printStackTrace();
			}
			System.out.println(i);
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Thread th1 = new Thread(new RunDemo(),"th1");
		Thread th2 = new Thread(new RunDemo(),"th2");
		
//		th1.run();
//		th2.run();
		
     	th1.start();
		th2.start();

	}

	

}
