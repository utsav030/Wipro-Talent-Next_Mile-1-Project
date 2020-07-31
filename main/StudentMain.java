package com.mile1.main;

import com.mile1.bean.Student;
import com.mile1.exception.NullMarksArrayException;
import com.mile1.exception.NullNameException;
import com.mile1.exception.NullStudentObjectException;
import com.mile1.service.StudentReport;
import com.mile1.service.StudentService;

public class StudentMain {
	static Student data[] = new Student[10];
	
	static {
		for (int i = 0; i < data.length; i++) 
			data [i]= new Student(); 
		
		data [0] = new Student("Sekar", new int[] {85, 75, 95});
		data [1] = new Student(null, new int[] {11, 22, 33});
		data [2] = null;
		data [3] = new Student("Manoj", null);
		
		
	}
	
	public static void main(String[] args) {
		StudentReport studentReport = new StudentReport();
		StudentService studentService = new StudentService();
		
		
		
		String x ="";
		
		for (int i = 0; i < data.length; i++)  {
			try {
				x = studentReport.validate(data[i]);
			} catch (NullNameException e) {
				x = "NullNameException occured";
			} catch (NullMarksArrayException e) {
				x = "NullMarksArrayException occured";
			} catch (NullStudentObjectException e) {
				x = "NullStudentObjectException occured";
			}
			if(x.equals("valid"))
			System.out.println("GRADE = " + studentReport.findGrades(data[i]));
		}
		
		System.out.println("The NumberOfNullMarksArray :" + studentService.findNumberOfNullMarksArray(data));
		System.out.println("The NumberOfNullName :" +studentService.findNumberOfNullName(data));
		System.out.println("The NumberOfNullObjects :" +studentService.findNumberOfNullObjects(data));
		
		
	}
}