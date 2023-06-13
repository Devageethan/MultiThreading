package multithreading;

public class Dev extends Thread {
	public static void main(String[] args) throws InterruptedException {
		Dev d=new Dev();
		Thread t=new Dev();
		
	}
	public void dev() throws InterruptedException {
		System.out.println(Thread.currentThread().getName());
		Thread.sleep(3000);
		System.out.println(Thread.currentThread().getPriority());
		System.out.println(Thread.currentThread().getState());
		
	}
}
