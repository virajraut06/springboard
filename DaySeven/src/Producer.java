
public class Producer extends Thread {
	private Test test;
	public Producer(Test test) {
		this.test = test;
		start();
	}
	
	@Override
	public void run() {
		int count = 0;
		while(true) {
			test.setNum(count++);
		}
	}
}
