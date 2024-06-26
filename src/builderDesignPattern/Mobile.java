package builderDesignPattern;

import java.util.Date;

import lombok.Getter;
import lombok.ToString;

@Getter
@ToString
public class Mobile implements Cloneable{
	private int id;
	private String modelName;
	private Date launchDate;
	private String processor;
	private int ram;
	private int storage;
	
	public Mobile(MobileBuilder mobileBuilder) {
		id = mobileBuilder.getId();
		modelName = mobileBuilder.getModelName();
		launchDate = mobileBuilder.getLaunchDate();
		processor = mobileBuilder.getProcessor();
		ram = mobileBuilder.getRam();
		storage = mobileBuilder.getStorage();
	}
}
