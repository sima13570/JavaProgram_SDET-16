package serilization;

public class Employee {  //Pojo class
	
	String name;
	int id ;
	double sal;
	char gender;
	
	Employee() {
		
	}
	
	
	public Employee(String name, int id, double sal, char gender) {
		
		this.name = name;
		this.id = id;
		this.sal = sal;
		this.gender = gender;
	}


	public String getName() {  // business logics
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public double getSal() {
		return sal;
	}

	public void setSal(double sal) {
		this.sal = sal;
	}

	public char getGender() {
		return gender;
	}

	public void setGender(char gender) {
		this.gender = gender;
	}
	
	
}

