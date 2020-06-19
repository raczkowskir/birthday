package Ex9;

public class Human {
	
	private String name;
	private String surname;
	private int dnaCode;
	
	public Human(String name, String surname, int dnaCode) {
		this.name = name;
		this.surname = surname;
		this.dnaCode = dnaCode;
	}
	
	@Override
	public boolean equals(Object obj) {
		
		if (obj instanceof Human) {
			Human otherHuman = (Human) obj;
					
		return name.equals(otherHuman.name); 
		}
		return false;
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
