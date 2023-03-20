package inheritance;
import java.util.*;

class Result1 {
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

class Marks extends Result1 {
	public float mark1 = 0f, mark2 = 0f, mark3 = 0f, mark4 = 0f, mark5 = 0f;
	
	public void Get_Marks() {
		Scanner sin = new Scanner(System.in);
		
		System.out.println("Enter the marks of the student in five subjects");
		mark1 = sin.nextFloat();
		mark2 = sin.nextFloat();
		mark3 = sin.nextFloat();
		mark4 = sin.nextFloat();
		mark5 = sin.nextFloat();
		
	}

}

public class MultiLevel_Inheritance extends Marks {
	public float sports_marks = 0f;
	public float Total_Marks = 0f, Percentage = 0f;
	
	public void Calculate_Total() {
		Scanner sin = new Scanner(System.in);
		System.out.println("Enter the sports marks of the student");
		sports_marks = sin.nextFloat();
		
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
