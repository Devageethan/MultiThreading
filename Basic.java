package multithreading;

public class Basic extends Thread{
			public static void main(String[] args) {
				System.out.println(Thread.currentThread().getId());
				System.out.println(Thread.currentThread().getState());
				System.out.println(Thread.currentThread().getName());
				System.out.println(Thread.currentThread().getPriority());
				System.out.println(Thread.currentThread().getStackTrace());
			}
}
