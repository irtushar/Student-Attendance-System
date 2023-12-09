package attendance;

import java.util.ArrayList;
import java.util.Scanner;

public class StudentAttendance 
{
	String date;
	String title;
	int year;
	ArrayList<Student> studentAttendance;
	public StudentAttendance(String date, String title, int year) 
	{
		super();
		this.date = date;
		this.title = title;
		this.year = year;
		this.studentAttendance = new ArrayList<Student>();
	}
	public void takeAttendance(ArrayList <Student> students )
	{
		StudentOperation operation = new StudentOperation();
		Scanner scanner = new Scanner(System.in);
		
		for(Student s : students) 
		{
			if(s.year == this.year)
			{
				operation.display(s);
				System.out.println("1 for \"yes\" \t0 for no");
				int a = scanner.nextInt();
				if(a == 1) this.studentAttendance.add(s);
			}	
		}
	}	
}
