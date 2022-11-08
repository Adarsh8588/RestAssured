package pojoclassforparsing;

public class employeDetailsWithArray1 {
	//step1:- variable declaraction
			String ename;
			String eid;
			int    Phoneno;
			int salary;
			//create a constructor for initilazition
			public employeDetailsWithArray1(String ename, String eid, int phoneno, int salary) {
				//super();
				this.ename = ename;
				this.eid = eid;
				Phoneno = phoneno;
				this.salary = salary;
				
				
			}
		 	// create getters an setters

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

			public int getSalary() {
				return salary;
			}

			public void setSalary(int salary) {
				this.salary = salary;
			}
			
			
}
