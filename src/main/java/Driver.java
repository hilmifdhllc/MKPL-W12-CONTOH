import src.main.java.Counter;

public class Driver {

	public static void main(String[] args) {
		
		Counter counter = new Counter();

		counter.increaseBy(4);
		
		System.out.println("Current count:" + counter.getCount());
		
		counter.decreaseBy(1);
		
		System.out.println("Current count:" + counter.getCount());
		
		counter.multiplyBy(7);
		
		System.out.println("Current count:" + counter.getCount());
		
	}

}
