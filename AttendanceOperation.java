package attendance;

import java.util.ArrayList;
import java.util.Scanner;

public class AttendanceOperation 
{
	public StudentAttendance attendance(ArrayList<Student> student)
	{
		  Scanner scanner = new Scanner (System.in);
		  
		  System.out.println("Please enter the date");
		  String date = scanner.nextLine();
		  
		  System.out.println("Please enter the course title");
		  String title = scanner.nextLine();
		  
		  System.out.println("Please enter the year");
		  int year = scanner.nextInt();
		  
		  StudentAttendance attendance = new StudentAttendance(title, date,year);
		  attendance.takeAttendance(student);
		  return attendance;
	}
	
	
	
	
	public void searchAttendancebytitle(ArrayList<StudentAttendance> attendances)
	{
		Scanner scanner = new Scanner (System.in);
		
		System.out.println("Please enter the course title"+"\n");
		String title = scanner.nextLine();
		  
		  for(StudentAttendance attendance : attendances ) 
		  {
			  if(attendance.title.equalsIgnoreCase(attendance.title) == true)
			 {
				 this.displayAttendance(attendance); 
				 return; //
		         }	  
		  }
	 }
	
	
	
	public void displayAttendance(StudentAttendance attendance)
	{
		System.out.println("Date: "+attendance.date+ "\n");
		System.out.println("Title:"+attendance.title+"\n");
		System.out.println("Year: "+attendance.year+ "\n");
		
		for(Student s: attendance.studentAttendance) 
		{
			(new StudentOperation()).display(s);
		}			
	}
}
