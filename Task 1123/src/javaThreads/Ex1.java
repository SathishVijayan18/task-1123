package javaThreads;

public class Ex1 implements Runnable {
	
	Thread t;
	
	Ex1()
	{
	t=new Thread(this,"New Thread");
	t.start();
	}
	public void run() {
		try {
			for(int i=5;i>0;i--) {
				System.out.println("Thread : "+i);
				Thread.sleep(500);
			}
		}
		catch(Exception e) {
			e.printStackTrace();
		}
	}
	public static void main(String[] args) {
	
		Ex1 obj=new Ex1();
		
	}
}
