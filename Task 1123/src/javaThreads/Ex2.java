package javaThreads;

class MyThread extends Thread {
	
	MyThread(){
		super();
		start();
	}
	public void run() {
	try {
		for(int i=5;i>0;i--) {
			System.out.println("Child thread : "+i);
			Thread.sleep(1000);
			}
		}
	catch(Exception e) {
			e.printStackTrace();
		}
	}
	
public class Ex2{
		
	public static void main(String[] args) {
		new MyThread();
	try {
		for(int j=5;j>0;j--) {
			System.out.println("Main thread :"+j);
			Thread.sleep(1000);
		}
	}
		catch(Exception e) {
			e.printStackTrace();
		}
	
	}
}
}
