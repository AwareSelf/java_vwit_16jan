package containmentex.onetoone;



public class ContainmentEx {

	public ContainmentEx() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Dept d = new Dept(10,"HR",10,"Delhi");
		
		Emp nama = new Emp(2,"Nama",12000,d);
		System.out.println(nama);
		
		
		
		Emp varun = new Emp(1,"Namrata",100000);
		varun.setDept(d);
		
		//show employee details along with his department details
		System.out.println(varun);
		
		/*
		Dept dp = e.getDept();
		String depname1 = dp.getDeptName();
		*/

		String deptname = varun.getDept().getDeptName();
		System.out.println("emp "+varun.getName()+" works in department "+deptname);
		System.out.println("emp Varun's dept location: "+varun.getDept().getLocation());
		
		d.setLocation("Mumabi");
		
		System.out.println("emp Varun's dept location: "+varun.getDept().getLocation());
		System.out.println(nama);
		
		

	}

}
