package serialiseDeserialise;

public class Employee {
	
	int age ;
	String name;
	
	public int getAge() {
		return age;
	}

	public String getName() {
		return name;
	}

	public void setAge(int age) {
	this.age=age;
		
	}

	public void setName(String name) {
		
		this.name = name;
	}

	@Override
	public String toString() {
		return "Employee [age=" + age + ", name=" + name + "]";
	}
	

}
