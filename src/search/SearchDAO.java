package search;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import Login.ConnectDB;

public class SearchDAO {
	ConnectDB connectDB = new ConnectDB();
	Connection conn = null;
	PreparedStatement ps = null;
	ResultSet rs = null;

	public List<CustomerForm> searchCustomers(SearchForm searchForm) {
		List<CustomerForm> customers = new ArrayList<CustomerForm>();
		System.out.println(searchForm.getBirthDayEnd().length());
		StringBuffer query = new StringBuffer();
		query.append("SELECT * FROM CUSTOMER WHERE SEX = '"+searchForm.getSex()+"'");
		if(searchForm.getCustomerName() != null ||
				!searchForm.getCustomerName().isEmpty()|| !searchForm.equals("")){
			query.append(" AND CUSTOMERNAME LIKE '%"+searchForm.getCustomerName()+"%'");
		}
		if(searchForm.getBirthDayStart().length() != 0){
			query.append(" AND CONVERT(date, BIRTHDAY) BETWEEN '"+searchForm.getBirthDayStart()+"'");
		}
		if(searchForm.getBirthDayEnd().length() != 0){
			query.append(" AND '"+searchForm.getBirthDayEnd()+"'");
		}
		System.out.println(query.toString());
		try {
			Statement statement = connectDB.getConnection().createStatement();
			ResultSet rs = statement.executeQuery(query.toString());
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

}
