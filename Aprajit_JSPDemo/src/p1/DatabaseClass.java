package p1;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

public class DatabaseClass {
	
	public List<String> getCourse()throws Exception
	{
		List<String> list = new ArrayList<>();
		
		Connection con = DatabaseUtil.con;
		
		String sql = "select DISTINCT coursename from courses";
		PreparedStatement ps = con.prepareStatement(sql);
		
		ResultSet rs = ps.executeQuery();
		while(rs.next())
		{
			String data = rs.getString("coursename");
			list.add(data);
		}
		
		return list;
	}
	
	
	public List<String> getTrainerByCourse(String course)throws Exception
	{
		Connection con = DatabaseUtil.con;
		
		List<String> list = new ArrayList<>();
		
		String sql = "select name from instructor where instructorcode in "
				+ "(select instructorcode from instructorcourseinfo where coursename = '"+course+"') ";
		
		PreparedStatement ps = con.prepareStatement(sql);
		
		ResultSet rs = ps.executeQuery();
		
		while(rs.next())
		{
			list.add(rs.getString("name"));
		}
		
		
		return list;
	}
	

	
}










