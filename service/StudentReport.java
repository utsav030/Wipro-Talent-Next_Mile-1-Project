package com.mile1.service;

import com.mile1.bean.Student;
import com.mile1.exception.*;

public class StudentReport 
{
	public String findGrades(Student studentObject)
	{
		int marks[]=studentObject.getMarks();
		int markssum=0;
		
		for(int i=0;i<marks.length;i++)
		{
			if(marks[i]<35)
			{
				return ("F");
			}
			else
			{
				markssum +=marks[i];
			}
		}
		if(markssum<=150)
		{
			return ("C");
		}
		else if(markssum>150 && markssum<=200)
		{
			return ("B");
		}
		else if(markssum>200 && markssum<=250)
		{
			return ("A");
		}
		else 
		{
			return ("A+");
		}
		
	}

	public String validate(Student s)throws NullNameException,NullMarksArrayException,NullStudentObjectException
	{
		if(s == null)
		{
			throw new NullStudentObjectException();
		}
		else
		{
			if(s.getName() == null)
			{
				throw new NullNameException();
			}
			else if(s.getMarks()== null)
			{
				throw new NullMarksArrayException();
			}
			else
			{
				return "valid";
			}
		}	
	}
}