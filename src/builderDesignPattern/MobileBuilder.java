package builderDesignPattern;

import java.util.Date;

import lombok.Getter;

@Getter
public class MobileBuilder {
	private int id;
	private String modelName;
	private Date launchDate;
	private String processor;
	private int ram;
	private int storage;
	
	//constructor will have mandatory fields, In this case Id is mandatory
	public MobileBuilder(int id) {
		this.id = id;
	}
	
	public MobileBuilder modelName(String modelName) {
		this.modelName = modelName;
		return this;
	}
	
	public MobileBuilder launchDate(Date launchDate) {
		this.launchDate = launchDate;
		return this;
	}
	
	public MobileBuilder processor(String processor) {
		this.processor = processor;
		return this;
	}
	
	public MobileBuilder ram(int ram) {
		this.ram = ram;
		return this;
	}
	
	public MobileBuilder storage(int storage) {
		this.storage = storage;
		return this;
	}
	
	public Mobile build() {
		return new Mobile(this);
	}
}
