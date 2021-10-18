package serialiseDeserialise;

public class EmployeeDetails {
	int age;
	String name;
	String contact;
	String designation;
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getContact() {
		return contact;
	}
	public void setContact(String contact) {
		this.contact = contact;
	}
	public String getDesignation() {
		return designation;
	}
	public void setDesignation(String designation) {
		this.designation = designation;
	}
	@Override
	public String toString() {
		return "EmployeeDetails [age=" + age + ", name=" + name + ", contact=" + contact + ", designation="
				+ designation + "]";
	}
	
	

}
