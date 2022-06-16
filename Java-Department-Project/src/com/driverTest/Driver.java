package com.driverTest;

import com.adminDepartment.AdminDepartment;
import com.hrDepartment.HrDepartment;
import com.techDepartment.TechDepartment;

public class Driver {

	public static void main(String[] args) {
		
		System.out.println("\n");
		
		AdminDepartment adminDepartment = new AdminDepartment();
		String adminDepartmentName = adminDepartment.departmentName();
		System.out.println(adminDepartmentName);
		String adminTodaysWork = adminDepartment.getTodaysWork();
		System.out.println(adminTodaysWork);
		String adminWorkDeadLine = adminDepartment.getWorkDeadline();
		System.out.println(adminWorkDeadLine);
		String adminTodayHoliday = adminDepartment.isTodayAHoliday();
		System.out.println(adminTodayHoliday);
		
		System.out.println("\n");
		
		HrDepartment hrDepartment = new HrDepartment();
		String hrDepartmentName = hrDepartment.departmentName();
		System.out.println(hrDepartmentName);
		String hrActivityName = hrDepartment.doActivity();
		System.out.println(hrActivityName);
		String hrTodaysWork = hrDepartment.getTodaysWork();
		System.out.println(hrTodaysWork);
		String hrWorkDeadLine = hrDepartment.getWorkDeadline();
		System.out.println(hrWorkDeadLine);
		String hrTodayAHoliday = hrDepartment.isTodayAHoliday();
		System.out.println(hrTodayAHoliday);
		
		System.out.println("\n");
		
		TechDepartment techDepartment = new TechDepartment();
		String techDepartmentName = techDepartment.departmentName();
		System.out.println(techDepartmentName);
		String techTodaysWork = techDepartment.getTodaysWork();
		System.out.println(techTodaysWork);
		String techWorkDeadLine = techDepartment.getWorkDeadline();
		System.out.println(techWorkDeadLine);
		String techTechStackInformation = techDepartment.getTechStackInformation();
		System.out.println(techTechStackInformation);
		String techTodayHoliday = techDepartment.isTodayAHoliday();
		System.out.println(techTodayHoliday);
		
	}

}
