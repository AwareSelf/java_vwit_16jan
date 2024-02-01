package junit.nama.junit.dynamictest;

public class Employee {
	
	private int id;
	private String firstName;
	
	public Employee()
	{
		
	}
	
	public Employee(int id, String name) {
		super();
		this.id = id;
		this.firstName = name;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", firstName=" + firstName + "]";
	}
	

	
	
	

}
