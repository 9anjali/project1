package controller;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import model.Student;
import service.AComponent;


@RestController
public class ControllerClass
{

	
	//private static final String HttpStatus = null;
	//private static final AComponent comp = null;
	@Autowired
	AComponent Acomponent;



	@GetMapping(value = "/checkservice")
	public String serv() 
	{
		return Acomponent.serv();
	}

	@RequestMapping(value = "/getData", method = RequestMethod.GET,headers="Accept=application/json")
	public ResponseEntity<String[]> showData() 
	{
		String arr[]  = Acomponent.getAllData();
		return new ResponseEntity<String[]>(arr, HttpStatus.OK);
	}


}