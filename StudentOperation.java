package attendance;

import java.util.ArrayList;
import java.util.Scanner;

public class StudentOperation
{
	Scanner scanner = new Scanner(System.in);
	
	public void registration(ArrayList <Student> students)
	{
		
		System.out.println("Please Enter Name: ");
		String name = scanner.nextLine();
		
		System.out.println("Please Enter Mobile Number: ");
		String mobile = scanner.next();
		
		System.out.println("Please Enter A Valid Id: ");
		String id = scanner.next();
		
		System.out.println("Please Enter Student Year: ");
		int year = scanner.nextInt();
		
		scanner.nextLine();
		
		Student student = new Student(name, mobile, id, year);
		students.add(student);
		System.out.println("One student is inserted. Now total student are:"+ students.size()+"\n");
	
        }
	
	public void searchbyId(ArrayList <Student> students)
	{
		System.out.println("Please Enter A Valid Id: ");
		String id = scanner.next();
		
		for(Student s : students)
		{
			if(id.equalsIgnoreCase(s.id) == true)
			{
				this.display(s);
				return;
			}
		}
		System.out.println("No student found.");
	}
	
	public void searchByYear(ArrayList <Student> students)
	{
		System.out.printf("Please Enter A Valid Year: ");
		int year = scanner.nextInt();
		
		System.out.printf("Searching student... Year: ");
		for(Student s : students)
		{
			if(s.year == year)
			{
				this.display(s);
		
			}
		}
	}
	
	public void delete(ArrayList <Student> students)
	{
		System.out.printf("Please Enter A Valid Id: ");
		String id = scanner.next();
		for(Student s : students)
		{
			if(id.equalsIgnoreCase(s.id) == true)
			{
				this.display(s);
				students.remove(s);
				System.out.println("Removed successful, total student are: "+ students.size());
				return;
			}
		}
		System.out.println("No student found.");
	}
	
	public void display(Student students)
        {
		System.out.println("Name: "+ students.name +"\n");
		System.out.println("Id: "+ students.id+"\n");
		System.out.println("Mobile: "+ students.mobile+"\n");
		System.out.println("Year: "+ students.year+"\n");
		System.out.println();
	}
}
