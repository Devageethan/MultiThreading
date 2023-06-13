package multithreading;

public class R1 implements Runnable {
public void run() {
	//System.out.println("i'm main");
	System.out.println("hi i am "+Thread.currentThread().getName());
	System.out.println(Thread.currentThread().getState());
}
public static void main(String[] args) {
		Runnable r=new R1();
		Thread t=new Thread(r);
		Thread t1=new Thread(r);
		Thread t2=new Thread(r);
		t.start();
		t1.start();
		t2.start();
	
}
}
