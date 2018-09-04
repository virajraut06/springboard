
public class ThreadDemo extends Thread {
	public ThreadDemo(String name, int priority) {
		setName(name);
		start();
		setPriority(priority);
	}
	@Override
	public void run() {
		for(int i=0; i<10; i++) {
			System.out.println(getName()+" : "+ i);
			try {
				sleep(2000);
			} catch (InterruptedException e){
				e.printStackTrace();
			}
		}
	}
	public static void main(String[] args) {
		new ThreadDemo("T1",3);
		new ThreadDemo("T2",9);
		new ThreadDemo("T3",6);
	}
}
