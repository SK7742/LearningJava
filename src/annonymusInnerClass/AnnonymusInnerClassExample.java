package annonymusInnerClass;
interface Test{
	void print();
}
public class AnnonymusInnerClassExample {
	public static void main(String[] args) {
		Test test = new Test() {
			@Override
			public void print() {
				System.out.println("Example of Anonymous Inner class...");
				
			}
		};
		test.print();
	}
}
