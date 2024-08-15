package hw7;

import java.io.Serializable;

public class HW7_4_Dog implements Serializable{
	private static final long serialVersionUID = 3L;

	private String name;
	
	public HW7_4_Dog(String name) {
		this.name = name;
	}
	
	public void speak() {
		System.out.println("This is Dog " + name + " speaking.");
	}

}
