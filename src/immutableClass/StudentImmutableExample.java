package immutableClass;

import java.util.HashMap;
import java.util.Map;

import lombok.Getter;
import lombok.ToString;

@Getter
@ToString

/**
 * @author Shivam kumar
 * @implNote  Immutable class is used to create when we need to create the object in such
 *  a way that it can't be modify further, Examples- String class
 * 
 * @Steps 
 * 	1. declare the class and it's data member as final.
 * 	2. create a constructor with all parameters.
 * 	3. for Collection Objects, use deep copy so that it won't be affected from outside.
 * 	4. for getters of collection object, return copy instead of original.
 */
final class StudentImmutableExample {
	private final String studentName;
	private final int regNo;
	private final Map<String, String> metaData;
	
	public StudentImmutableExample(String studentName, int regNo, Map<String, String> metadata) {
		this.studentName = studentName;
		this.regNo = regNo;
		
		Map<String, String> tempMap = new HashMap<>();
		for(Map.Entry<String, String> entry : metadata.entrySet()) {
			tempMap.put(entry.getKey(), entry.getValue());
		}
		this.metaData = tempMap;
	}
	
	public Map<String, String> getMetaData(){
		Map<String, String> tempMap = new HashMap<>();
		for(Map.Entry<String, String> entry : this.metaData.entrySet()) {
			tempMap.put(entry.getKey(), entry.getValue());
		}
		return tempMap;
	}
	
	public static void main(String[] args) {
		Map<String, String> metaDataMap = new HashMap<>();
		metaDataMap.put("1", "first");
		metaDataMap.put("2", "second");
		
		StudentImmutableExample immutableObject = new StudentImmutableExample("testStudent", 124578, metaDataMap);
		System.out.println(immutableObject.getStudentName());
		System.out.println(immutableObject.getRegNo());
		System.out.println(immutableObject.getMetaData());

//		immutableObject.regNo = 5; This line will give error after un-commenting it as regNo is final.
		metaDataMap.put("testKeyLocal", "testValueLocal");
		System.out.println(immutableObject.getMetaData());
//		This won't affect the immutable class map because we copied the map value not assigned it.
		
		immutableObject.getMetaData().put("testKey", "testValue");
		System.out.println(immutableObject.getMetaData());
//		This won't affect the immutable class map because getter is returning a copy of the metaData map.
	}
} 

