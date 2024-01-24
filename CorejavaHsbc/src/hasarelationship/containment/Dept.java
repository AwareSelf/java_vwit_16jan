package hasarelationship.containment;

public class Dept {
	
	private int deptid;
	private String deptName;
	private int empCt;
	

	public Dept() {
		// TODO Auto-generated constructor stub
	}


	public Dept(int deptid, String deptName, int empCt) {
		super();
		this.deptid = deptid;
		this.deptName = deptName;
		this.empCt = empCt;
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


	@Override
	public String toString() {
		return "Dept [deptid=" + deptid + ", deptName=" + deptName + ", empCt=" + empCt + "]";
	}
	
	

}
