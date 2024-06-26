package builderDesignPattern;

import java.util.Date;

public class DriverClass {
	public static void main(String[] args) {
		//Suppose we need to create a object for mobile class with some specific properties.
		Mobile mobileOne = new MobileBuilder(1)
				.launchDate(new Date())
				.modelName("Samsung S52")
				.ram(8).build();
		
		Mobile mobileTwo = new MobileBuilder(2)
				.modelName("OnePlus 10R")
				.ram(12).build();
		
		
		System.out.println(mobileOne + "\n" + mobileTwo);
	}
}
