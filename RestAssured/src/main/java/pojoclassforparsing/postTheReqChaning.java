package pojoclassforparsing;

public class postTheReqChaning {
   String name;
   String projectName;
   String status;
   int teamsize;
public postTheReqChaning(String name, String projectName, String status, int teamsize) {
	super();
	this.name = name;
	this.projectName = projectName;
	this.status = status;
	this.teamsize = teamsize;
}
public postTheReqChaning() {
	
}

public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public String getProjectName() {
	return projectName;
}
public void setProjectName(String projectName) {
	this.projectName = projectName;
}
public String getStatus() {
	return status;
}
public void setStatus(String status) {
	this.status = status;
}
public int getTeamsize() {
	return teamsize;
}
public void setTeamsize(int teamsize) {
	this.teamsize = teamsize;
}
   
   
}
