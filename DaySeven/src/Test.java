
public class Test {
	private int num;
	private boolean flag = true;
	public synchronized int getNum() {
		if(flag) {
			try {
				wait();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		System.out.println("GOT: "+num);
		notify();
		flag = true;
		return num;
	}

	public synchronized void setNum(int num) {
		if(!flag) {
			try {
				wait();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		this.num = num;
		System.out.println("PUT: "+num);
		flag =  false;
		notify();
	}
	
	
}
