package pojoclassforparsing;

public class empdetailswithobject  {
	String ename;
	String eid;
	String[] mailid;
	int[] phoneNo;
	int salary;
	Object spouse;
	
	//create a constructor for initilazition
	public empdetailswithobject(String ename, String eid, String[] mailid,int[] phoneNo, int salary) {
		//super();
		this.ename = ename;
		this.eid = eid;
		this.mailid = mailid;
		this.salary = salary;
		this.phoneNo=phoneNo;
	}
	public empdetailswithobject() {
		
	}
	
	//  create getters and setters
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
	public int[] getphoneNo() {
		return phoneNo;
	}
	public void setphoneNo(int[] phoneNo) {
		this.phoneNo = phoneNo;
	}
	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}

}

	
	



