package util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.HashMap;
import java.util.Map;

public class DBUtil 
{

	public static String[] getData()
	{

		String url = "jdbc:h2:tcp://localhost/~/test";
		String user = "sa";
		String password = "";
		Connection connection = null;
		String arr[] = new String[3];
		int i=0;
		try
		{
			Class.forName("org.h2.Driver");
			connection = DriverManager.getConnection(url,user,password);

			String sq = "select * from student";		
			Statement ps = connection.createStatement();
			ResultSet rs = ps.executeQuery(sq);
			while(rs.next())
			{
				String s= rs.getString("s_name");
				arr[i] = s;
				i++;
			}
		}
		catch (Exception e)
		{

			e.printStackTrace();
		}
		return arr;
	}

	
}