package ro.acs.ase.Classes;

public class Human implements Runner {
	
	int age;
	
	public Human() {
		// TODO Auto-generated constructor stub
	}
	
	@Override
	public int getSpeed() {
		if(this.age < 50)
			return 10;
		else
			return 7;
	}
	
	@Override
	public String toString() {
		return "" + age;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}
	
}
