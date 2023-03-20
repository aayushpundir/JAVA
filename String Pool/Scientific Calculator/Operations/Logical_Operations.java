package Operations;
import java.util.*;

public class Logical_Operations {
	public void LogicalAnd() {
		Scanner sin = new Scanner(System.in);
		int a, b;
		System.out.println("Enter Two Numbers");
		
		a = sin.nextInt();
		b = sin.nextInt();
		
		System.out.println(a & b);
	}
	
	public void LogicalOr() {
		Scanner sin = new Scanner(System.in);
		int a, b;
		System.out.println("Enter Two Numbers");
		
		a = sin.nextInt();
		b = sin.nextInt();
		
		System.out.println(a | b);
	}
	
	public void LogicalXor() {
		Scanner sin = new Scanner(System.in);
		int a, b;
		System.out.println("Enter Two Numbers");
		
		a = sin.nextInt();
		b = sin.nextInt();
		
		System.out.println(a ^ b);
	}
}