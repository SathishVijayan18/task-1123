package javaThreads;
class My_Thread extends Thread{
	static String message[]= {"Java is aromatic","and","invograting"};
	
	public My_Thread(String tname) {
		super(tname);
	}
	public void run() {
		String name = getName();
		for(int i=0;i<message.length;++i) {
			SleepMethod();
			System.out.println(name + message[i]);
		}
	}
	void SleepMethod() {
		try {
			sleep(2000);
		}
		catch(Exception e) {
			e.printStackTrace();
		}
	}
}
public class Ex5 {

	public static void main(String[] args) {
		My_Thread thread1=new My_Thread("thread1 ");
		My_Thread thread2=new My_Thread("thread2 ");
		thread1.start();
		thread2.start();
		boolean thread1IsAlive=true;
		boolean thread2IsAlive=true;
		do {
			if(thread1IsAlive && !thread1.isAlive())
			{
				thread1IsAlive=false;
				System.out.println("thread1 is dead");
			}
			if(thread2IsAlive && !thread2.isAlive())
			{
				thread2IsAlive=false;
				System.out.println("thread2 is dead");
			}
		}while(thread1IsAlive || thread2IsAlive);
	}

}
