
public class ProducerThread extends Thread{
	private Product product;
	private int number;
	public ProducerThread(Product product, int number) {
		this.product = product;
		this.number = number;
		start();
	}
	@Override
	public void run() {
		product.setNumber(number);
	}
}
