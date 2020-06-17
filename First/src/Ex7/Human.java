package Ex7;

public class Human {
	private String name;
	private int age;
	enum ColourOfEyes {
		BLACK,
		BLUE,
		GREY,
		GREEN,
		YELLOW,
		BROWN
	}
	enum ColourOfHair {
		BROWN,
		BLACK,
		BLONDE,
		GINGER,
		GREY
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
