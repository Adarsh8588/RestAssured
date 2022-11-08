package DiffWaysToPostReq;

import org.omg.CORBA.PUBLIC_MEMBER;

public class PojoClassForCreate {
	
		//declare all the variables glibally
		String CreatedBy;
		String ProjectName;
		String status;
		int teamSize;
		public PojoClassForCreate(String createdBy, String projectName, String status, int teamSize) {
			super();
			CreatedBy = createdBy;
			ProjectName = projectName;
			this.status = status;
			this.teamSize = teamSize;
			 
		}
           public PojoClassForCreate() {
         }		
		public String getCreatedBy() {
			return CreatedBy;
		}
		public void setCreatedBy(String createdBy) {
			CreatedBy = createdBy;
		}
		public String getProjectName() {
			return ProjectName;
		}
		public void setProjectName(String projectName) {
			ProjectName = projectName;
		}
		public String getStatus() {
			return status;
		}
		public void setStatus(String status) {
			this.status = status;
		}
		public int getTeamSize() {
			return teamSize;
		}
		public void setTeamSize(int teamSize) {
			this.teamSize = teamSize;
		}
		
		
		
		
	

}
