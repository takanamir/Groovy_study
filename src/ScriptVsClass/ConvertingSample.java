package ScriptVsClass;

public class ConvertingSample {

	private String name;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	public String success() {
		return "Hello " + name;
	}
	
	public static void main(String[] args) {
		ConvertingSample cs = new ConvertingSample();
		cs.setName("Java to Groovy");
		System.out.println(cs.success());
	}
	
}