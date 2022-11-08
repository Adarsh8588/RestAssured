package pojoclassforparsing;

public class empdetailswithobject  {
	String ename;
	String eid;
	String[] mailid;
	int salary;
	Object spouse;
	
	//create a constructor for initilazition
	public empdetailswithobject(String ename, String eid, String[] mailid, int salary) {
		//super();
		this.ename = ename;
		this.eid = eid;
		this.mailid = mailid;
		this.salary = salary;
	}
	//create getters and setters
	public String getEname() {
		return ename;
	}
	public void setEname(String ename) {
		this.ename = ename;
	}
	public String getEid() {
		return eid;
	}
	public void setEid(String eid) {
		this.eid = eid;
	}
	public String[] getMailid() {
		return mailid;
	}
	public void setMailid(String[] mailid) {
		this.mailid = mailid;
	}
	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}

}

	
	



