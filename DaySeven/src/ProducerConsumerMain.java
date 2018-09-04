
public class ProducerConsumerMain {
	public static void main(String[] args) {
		Test test = new Test();
		new Producer(test);
		new Consumer(test);
	}
}
