package com.techDepartment;

import com.superDepartment.SuperDepartment;

public class TechDepartment extends SuperDepartment{
	
	public  String departmentName() {
		return "Welcome to Tech Department";
	}
     
	public String getTodaysWork() {
		return "Complete coding of Module 1";		
	}             
	
	public String getWorkDeadline() {
		return "Complete by EOD";		
	}

	public String getTechStackInformation() {
		return "Core Java";		
	}

}
