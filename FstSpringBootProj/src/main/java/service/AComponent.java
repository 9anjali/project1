package service;


import org.springframework.stereotype.Component;
import util.DBUtil;

@Component
public class AComponent
{
	String[] arr= new String[3];
	public String serv() 
	{
		return "Running";
	}

	public String[] getAllData()
	{
		arr = DBUtil.getData();
		return arr;

	}

}
