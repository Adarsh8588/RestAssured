package GenericLibraries;

import java.sql.Connection;
import java.sql.Driver;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;

public class DataBaseLibrary {

	Driver driverref;
	Connection con;

	public void connectionToDB() throws Throwable {
		driverref = new com.mysql.cj.jdbc.Driver();
		DriverManager.registerDriver(driverref);
		con = DriverManager.getConnection(Iconstants.dbURL, Iconstants.dbUserName, Iconstants.dbPassword);
	}

	public void close() throws Throwable {
		con.close();
	}

	public String readDataFromDBAndValidate(String query, int coloumnIndex, String expData) throws SQLException {
		Boolean flag = false;
		ResultSet result = con.createStatement().executeQuery(query);
		while (result.next()) {
			if (result.getString(coloumnIndex).equalsIgnoreCase(expData)) {
				flag = true;
				break;
			}
		}
		if (flag) {
			System.out.println("Verified");
			return expData;
		} else {
			System.out.println("Data not verified");
			return "";
		}
	}

}
