package com.mile1.service;

import com.mile1.bean.Student;
public class StudentService 
{
	public int findNumberOfNullMarksArray(Student s[])
	{
		int countmarks=0;
		for(int i=0;i<s.length;i++)
		{
			try
			{
				s[i].getMarks();
			}
			catch (Exception e)
			{
				
				countmarks++;
			}
		}
		return countmarks;
	}
	public int findNumberOfNullName(Student s[])
	{
		int countname=0;
		for(int i=0;i<s.length;i++)
		{
			try
			{
				s[i].getName();
			}
			catch (Exception e)
			{
				countname++;
			}
		}
		return countname;
	}
	public int findNumberOfNullObjects(Student s[])
	{
		int countObject=0;
		for(int i=0;i<s.length;i++)
		{
			if(s[i]==null)
			{
				countObject++;
			}
		}
		return countObject;
	}
}
