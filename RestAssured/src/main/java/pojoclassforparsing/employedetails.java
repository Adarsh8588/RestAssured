package pojoclassforparsing;
public class employedetails{
	
		//step1:- variable declaraction
		String ename;
		String eid;
		int    Phoneno;
		String address;
		String mailId;
		Object spouse;
		//step2:-create a constructor for initilization
		public employedetails(String ename, String eid, int phoneno, String address, String mailId, Object spouse) {
			super();
			this.ename = ename;
			this.eid = eid;
			Phoneno = phoneno;
			this.address = address;
			this.mailId = mailId;
			this.spouse = spouse;
		}
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
		public int getPhoneno() {
			return Phoneno;
		}
		public void setPhoneno(int phoneno) {
			Phoneno = phoneno;
		}
		public String getAddress() {
			return address;
		}
		public void setAddress(String address) {
			this.address = address;
		}
		public String getMailId() {
			return mailId;
		}
		public void setMailId(String mailId) {
			this.mailId = mailId;
		}
		public Object getSpouse() {
			return spouse;
		}
		public void setSpouse(Object spouse) {
			this.spouse = spouse;
		}

}