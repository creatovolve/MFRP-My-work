package com.cogaip.bo;

import java.util.Date;

import com.cogaip.dao.Address;
import com.sun.corba.se.impl.orbutil.closure.Constant;

public class UserRegBO {
	
	private UserBO userBO;
	private Address address;
	private LoginBO loginBO;
	
	private final int userMinAge=21;
    private final int adminMinAge=24;
	

	public int insertNewUser(String firstName,String lastName,String password,String dayOfBirth,String monthOfBirth,String yearOfBirth, 
			String gender, String contactNumber,String email,String address,String zip,String city) {
		
		int i;
		
		boolean [] validateStatus = validate(firstName, lastName, password, dayOfBirth, monthOfBirth, yearOfBirth, gender, contactNumber, email, address, zip, city);
		
	
		return 0;
		
	}
	

	private boolean [] validate(String firstName,String lastName, String password,String dayOfBirth,String monthOfBirth,String yearOfBirth,String gender,String contactNumber,String email,String address,String zip,String city)
	{
		
		boolean [] validateStatus=new boolean[8];
		
		validateStatus[0]=true;
		for(int i=0;i<firstName.length();i++)
		{
			if(!((firstName.charAt(i)>='a'&&firstName.charAt(i)<='z')||
					(firstName.charAt(i)>='A'&&firstName.charAt(i)<='Z')))
			{
				validateStatus[0]=false;
			}
		}
		
		validateStatus[1]=true;
		for(int i=0;i<lastName.length();i++)
		{
			if(!((lastName.charAt(i)>='a'&&lastName.charAt(i)<='z')||
					(lastName.charAt(i)>='A'&&lastName.charAt(i)<='Z')))
			{
				validateStatus[1]=false;
			}
		}
		
		
		

		validateStatus[2]=true;
		
		if(password.length()<8)
			validateStatus[2]=false;

		
		
		{
			boolean isLower=false;
			boolean isUpper=false;
			boolean isNnumber=false;
			
			
			for(int i=0;i<password.length();i++)
			{
				if(password.charAt(i)>='a'&&password.charAt(i)<='z')
				{
					isLower=true;
				}
				if(password.charAt(i)>='A'&&password.charAt(i)<='Z')
				{
					isUpper=true;
				}
				if(password.charAt(i)>='0'&&password.charAt(i)<='9')
				{
					isNnumber=true;
				}
							
				
		
			}
			
			if(!(isLower&&isUpper&&isNnumber))
				validateStatus[2]=true;
		
			
			
		}
		
		
		validateStatus[3]=false;
		
		Date dob=new Date(Integer.parseInt(yearOfBirth),Integer.parseInt(monthOfBirth),Integer.parseInt(dayOfBirth));
		
		Date today=new Date();
		
		long ageMilliSeconds= today.getTime()-dob.getTime();
		
		if((ageMilliSeconds/(365*24*60*60*60))>=userMinAge){
			validateStatus[3]=true;
		}
		
		
		validateStatus[4]=false;
		
		if(!(gender.equalsIgnoreCase("male")||gender.equalsIgnoreCase("female")))
			validateStatus[5]=true;
		
		validateStatus[5]=true;
		
		for(int i=0;i<contactNumber.length();i++)
		{
			if(!(contactNumber.charAt(i)>='0'&&contactNumber.charAt(i)<='9'))
			{
				validateStatus[5]=false;
				break;
			}
			
								
		}
		
		validateStatus[6]=false;
		
		for(int i=0;i<email.length()-1;i++)
		{
			if(email.charAt(i)=='@'){
				
			
				validateStatus[6]=true;
				break;
			}
		}
		
		
		return validateStatus;
		
		
		
		
	}
	
	
	
	
}
