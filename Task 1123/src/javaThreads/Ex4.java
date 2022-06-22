package javaThreads;
class MyDemoThread extends Thread{
	String threadname;
	Thread t;
	MyDemoThread(String str){
		threadname=str;
		t=new Thread(this,str);
		System.out.println("new thread : "+t);
		t.start();
	}
	public void run() {
		try {
			for(int i=5;i>0;i--) {
				System.out.println(threadname +" "+i);
				Thread.sleep(1000);
			}
		}
		catch(Exception e) {
			e.printStackTrace();
		}
	}
}
public class Ex4 {

	public static void main(String[] args) {
		MyDemoThread obj1=new MyDemoThread("Thread one");
		MyDemoThread obj2=new MyDemoThread("Thread two");
		System.out.println("Thread is alive : "+obj1.t.isAlive());
		System.out.println("Thread is alive : "+obj2.t.isAlive());
		try {
			obj1.t.join();
			obj2.t.join();
		}catch(Exception e) {
			e.printStackTrace();
		}
	}

}
