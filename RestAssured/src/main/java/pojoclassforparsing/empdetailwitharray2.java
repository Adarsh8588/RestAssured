package pojoclassforparsing;

public class empdetailwitharray2 {
	//step1:- variable declaraction
	String ename;
	String eid;
	String[] mailid;
	int salary;
	//create a constructor for initilazition
	public empdetailwitharray2(String ename, String eid, String[] mailid, int salary) {
		//super();
		this.ename = ename;
		this.eid = eid;
		this.mailid = mailid;
		this.salary = salary;
	}
	public empdetailwitharray2(String ename2, String eid2, String string, int salary2) {
		// TODO Auto-generated constructor stub
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
