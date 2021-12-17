package immutableClass;

public class ImmutableClassExample {
	private final String str;
	ImmutableClassExample(final String str) {
		this.str=str;
	}
	public String getStr() {
		return str;
	}
	public static void main(String[] args) {
		ImmutableClassExample example = new ImmutableClassExample("Immutable Object Created...");
		System.out.println(example.getStr());
	
	}

}
