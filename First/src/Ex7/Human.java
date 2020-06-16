package Ex7;

public class Human {
	private String name;
	private int age;
	enum ColourOfEyes {
		black,
		blue,
		grey,
		green,
		yellow,
		brown
	}
	enum ColourOfHair {
		brown,
		black,
		blonde,
		ginger,
		grey
	}
	
	public String getName() {
		return this.name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return this.age;
	}
	public void setAge(int age) {
		this.age = age;
	}	
}
