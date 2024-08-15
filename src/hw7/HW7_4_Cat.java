package hw7;

import java.io.Serializable;

public class HW7_4_Cat implements Serializable {
	private static final long serialVersionUID = 4L;

	private String name;
	
	public HW7_4_Cat(String name) {
		this.name = name;
	}
	
	public void speak() {
		System.out.println("This is Cat " + name + " speaking!");
	}

}
