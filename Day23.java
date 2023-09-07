public class prior implements Runnable {
	public void run() {
		for (int i = 1; i < 4; i++) {

			System.out.println(Thread.currentThread().getName() + "thread is running..." + i);
		}
	}

	public static void main(String args[]) {
		prior p1 = new prior();
		Thread t1 = new Thread(p1, "first");
		t1.setPriority(Thread.MAX_PRIORITY);

		Thread t2 = new Thread(p1, "second");
		t2.setPriority(Thread.MIN_PRIORITY);

		t1.start();
		t2.start();
	}
}
