package inheritance;
import java.util.*;

class Result {
	public String Name;
	public int roll, age;
	
	public void Get_Details() {
		Scanner sin = new Scanner(System.in);
		
		System.out.println("Enter the name of the student");
		Name = sin.nextLine();
		System.out.println("Enter the roll number of the student");
		roll = sin.nextInt();
		System.out.println("Enter the age of the student");
		age = sin.nextInt();
		
	}
}

public class Single_Inheritance extends Result {
	public int mark1, mark2, mark3, mark4, mark5;
	public int sports_marks;
	public float Total_Marks = 0f;
	public float Percentage = 0f;

	public void Get_Marks() {
		Scanner sin = new Scanner(System.in);
		
		System.out.println("Enter the marks of the student in five subjects");
		mark1 = sin.nextInt();
		mark2 = sin.nextInt();
		mark3 = sin.nextInt();
		mark4 = sin.nextInt();
		mark5 = sin.nextInt();
		System.out.println("Enter the sports marks of the student");
		sports_marks = sin.nextInt();
		
	}
	public void Calculate_Total() {
		Total_Marks = mark1 + mark2 + mark3 + mark4 + mark5 + sports_marks;
		Percentage = Total_Marks / 6;
	}
	
	public void Show_Details() {
		System.out.println("Name of the Student- " + Name);
		System.out.println("Roll Number of the Student- " + roll);
		System.out.println("Age of the Student- " + age);
		System.out.println("Total Marks of the Student- " + Total_Marks);
		System.out.println("Percentage scored by the Student- " + Percentage);
		
	}
	
}