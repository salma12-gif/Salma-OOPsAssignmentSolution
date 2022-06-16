package com.hrDepartment;

import com.superDepartment.SuperDepartment;

public class HrDepartment extends SuperDepartment {
	
	public  String departmentName() {
		return "Welcome to HR Department";
	}
     
	public String getTodaysWork() {
		return "File today's worksheet and mark your attendance";		
	}             
	
	public String getWorkDeadline() {
		return "Complete by EOD";		
	}

	public String doActivity() {
		return "team Lunch";		
	}
}
