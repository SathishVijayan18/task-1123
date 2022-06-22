package javaThreads;

class Main_Thread implements Runnable{
	public void run() {
		System.out.println(Thread.currentThread()+"running..");
		
	}
}
public class Ex3 {

	public static void main(String[] args) {
		Main_Thread obj=new Main_Thread();
		Thread t1=new Thread(obj);
		t1.setName("Thread1");
		t1.start();
		//System.out.println("running "+t1);
	}

}
