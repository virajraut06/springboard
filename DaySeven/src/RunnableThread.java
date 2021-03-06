
public class RunnableThread implements Runnable {
	private Thread thread;
	public RunnableThread(String name) {
		thread = new Thread(this);
		thread.setName(name);
		thread.start();
	}
	@Override
	public void run() {
		for(int i=0; i<10; i++) {
			System.out.println(thread.getName()+" : "+ i);
			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
	public static void main(String[] args) {
		new RunnableThread("T1");
		new RunnableThread("T2");
		new RunnableThread("T3");
	}
}
