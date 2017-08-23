package search;

import java.sql.Connection;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import Login.ConnectDB;

public class CustomerDAO {
	ConnectDB connectDB = new ConnectDB();
	Connection conn = null;
	PreparedStatement ps = null;
	ResultSet rs = null;
	private final int LIMIT = 5;

	public List<CustomerForm> getAllcustomers(int index) {
		List<CustomerForm> customers = new ArrayList<CustomerForm>();
		try {
			String query = "SELECT * FROM ( SELECT *, ROW_NUMBER() OVER (ORDER BY USERID) as row FROM CUSTOMER ) a WHERE row > ? and row <= ?";
			PreparedStatement ps = connectDB.getConnection().prepareStatement(query);
			int start = index*LIMIT;
			ps.setInt(1, start);
			int end = start+LIMIT;
			ps.setInt(2, end);
			rs = ps.executeQuery();
			while (rs.next()) {
				CustomerForm customer = new CustomerForm();
				customer.setUserid(rs.getInt("userid"));
				customer.setCustomerName(rs.getString("customerName"));
				customer.setSex(rs.getString("sex"));
				customer.setBirthDay(rs.getString("birthDay"));
				customer.setAddress(rs.getString("address"));
				customers.add(customer);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return customers;
	}
	public int countCustomers() throws SQLException{
		int count = 0;
		Statement statement = connectDB.getConnection().createStatement();
		ResultSet rs = statement.executeQuery("SELECT Count(USERID) FROM CUSTOMER");
		while(rs.next()){
			count = rs.getInt(1);
		}
		return count;
	}
	public void deleted(int i) throws SQLException {
		Statement statement = connectDB.getConnection().createStatement();
		statement.executeUpdate("DELETE FROM CUSTOMER WHERE USERID="+i);
	}
}