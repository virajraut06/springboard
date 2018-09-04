
public class Consumer extends Thread {
	private Test test;
	public Consumer(Test test) {
		this.test = test;
		start();
	}
	
	@Override
	public void run() {
		while(true) {
			test.getNum();
		}
	}
}
