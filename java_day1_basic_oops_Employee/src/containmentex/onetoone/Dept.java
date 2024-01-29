package containmentex.onetoone;

public class Dept {
	
	private int deptid;
	private String deptName;
	private int empCt;
	private String location;
	

	public Dept() {
		// TODO Auto-generated constructor stub
	}


	


	public Dept(int deptid, String deptName, int empCt, String location) {
		super();
		this.deptid = deptid;
		this.deptName = deptName;
		this.empCt = empCt;
		this.location = location;
	}





	/**
	 * @return the deptName
	 */
	public String getDeptName() {
		return deptName;
	}


	/**
	 * @param deptName the deptName to set
	 */
	public void setDeptName(String deptName) {
		this.deptName = deptName;
	}


	/**
	 * @return the empCt
	 */
	public int getEmpCt() {
		return empCt;
	}


	/**
	 * @param empCt the empCt to set
	 */
	public void setEmpCt(int empCt) {
		this.empCt = empCt;
	}


	/**
	 * @return the deptid
	 */
	public int getDeptid() {
		return deptid;
	}

	

	public String getLocation() {
		return location;
	}





	public void setLocation(String location) {
		this.location = location;
	}





	@Override
	public String toString() {
		return "Dept [deptid=" + deptid + ", deptName=" + deptName + ", empCt=" + empCt + ", location=" + location
				+ "]";
	}





	
	

}
