package streams;
import java.util.ArrayList;
import java.util.List;

public class Employee {
    private int id;
    private String name;
    private int age;
    private long salary;
    private boolean isManager;
    private List<String> subordinates;
   

	public Employee(int id, String name, int age, long salary) {
        super();
        this.id = id;
        this.name = name;
        this.age = age;
        this.salary = salary;
    }
    
    public Employee(int id, String name, int age, long salary,boolean isManager) {
        super();
        this.id = id;
        this.name = name;
        this.age = age;
        this.salary = salary;
        this.isManager=isManager;
    }
    public Employee(int id, String name, int age, long salary,boolean isManager,List<String> sub) {
        super();
        this.id = id;
        this.name = name;
        this.age = age;
        this.salary = salary;
        this.isManager=isManager;
        this.subordinates =  new ArrayList<String>();
        sub.forEach(s-> this.subordinates.add(s));
       
    }
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }
    public long getSalary() {
        return salary;
    }
    public void setSalary(long salary) {
        this.salary = salary;
    }
    
    public boolean isManager() {
		return isManager;
	}

	public void setManager(boolean isManager) {
		this.isManager = isManager;
	}
	
	public void displaySubordinates()
	{
		this.subordinates.forEach(System.out::println);
	}
	
    public List<String> getSubordinates() {
		return subordinates;
	}

	public void setSubordinates(List<String> subordinates) {
		this.subordinates = subordinates;
	}

	@Override
    public String toString() {
        return "Employee [id=" + id + ", name=" + name + ", age=" + age + ", salary=" + salary + "]";
    }
}
