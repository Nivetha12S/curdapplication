package PojoEmployee;

public class EmployeePojo {
	String id;
	String name;
	String age;
	String email;
	String address;
	
	public EmployeePojo(String name1, String age1, String email1, String address1) {
		this.name=name1;
		this.age=age1;
		this.email=email1;
		this.address=address1;
	}
	
	public EmployeePojo(String id2,String name2, String age2, String email2, String address2) {
		this.id=id2;
		this.name=name2;
		this.age=age2;
		this.email=email2;
		this.address=address2;
	}
	public String getId() {
		return this.id;
	}
	public void setId(String id) {
		this.id=id;
	}
	
	public String getName() {
		return this.name;
	}
	public void setName(String name) {
		this.name=name;
	}
	
	public String getAge() {
		return this.age;
	}
	public void setAge(String age) {
		this.age=age;
	}
	
	public String getEmail() {
		return this.email;
	}
	public void setEmail(String email) {
		this.email=email;
	}
	
	public String getAddress() {
		return this.address;
	}
	public void setAddress(String address) {
		this.address=address;
	}

}
