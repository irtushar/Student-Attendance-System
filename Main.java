package attendance;

import java.util.Scanner;
import java.util.ArrayList;

public class Main 
{
	public static void main(String[] args)
	{
	    System.out.println("Welcome to student attendence system");
     	    Scanner scanner = new Scanner (System.in);	
		
	    ArrayList <Student> students = new ArrayList<Student>();
	    ArrayList <StudentAttendance> attendance = new ArrayList<StudentAttendance>();
	    StudentOperation operation = new StudentOperation();
	    AttendanceOperation attendanceOperation = new AttendanceOperation();
 	    int choice;
	
	  while(true)
	  {
		       System.out.println("1 for student registration");
		       System.out.println("2 for student serch by id");
		       System.out.println("3 for remove student by id");
		       System.out.println("4 for search student by year");
		       System.out.println("5 for take attendance");
		       System.out.println("6 for show attendance by title");
		       System.out.println("0 for exit the system");
		       
		       choice = scanner.nextInt();
		       
		  if(choice == 1)
		    {
		 	  operation.registration(students);	
		    }
		  else if(choice == 2) 
		    {
		      operation.searchbyId(students);
		    }
		  else if(choice == 3)
		    {
			  operation.delete(students);
	     	    }
		  else if(choice == 4)
		    {
			  operation.searchByYear(students);
	     	    }
		  else if(choice == 5)
		    {
			  attendance.add(attendanceOperation.attendance(students));
	     	    }
		  else if(choice == 6)
		    {
			  attendanceOperation.searchAttendancebytitle(attendance);
	     	    }
		  else if(choice == 0)
		    {
			  break; 
		    }
	  }	
	      System.out.println("Thank you for using our system");
       }
}
