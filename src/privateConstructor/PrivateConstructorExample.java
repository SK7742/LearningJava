package privateConstructor; 

class Test{
	
	private static Test test;
	public static Test getInstance() { //It will create a object for Test Class by invoking the private Constructor
		if(test == null) {
			test = new Test();
		}
		return test;
	}
	private Test() { //Private constructor is not accessible by other classes. 
		System.out.println("Test Private Test Constructor Invoked");
	}
}
public class PrivateConstructorExample {
	public  PrivateConstructorExample() {
		System.out.println("Public PrivateConstructorExample Constructor Invoked.");
	}
	public static void main(String[] args) {
		PrivateConstructorExample example = new PrivateConstructorExample();
		System.out.println("Main Method");
		//Test test = new Test(); //Compile time error: Constructor not visible directly.
		//Now getInstance method will return the instance of the class and during this private constructor will be invoked.
		
		Test t = Test.getInstance();
		Test t2 = Test.getInstance();
		
		System.out.println(t==t2);
	}

}
