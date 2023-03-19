package Operations;
import java.util.*;
import java.lang.*;

public class Square {
	public void Squr() {
		Scanner sin = new Scanner(System.in);
		
		double a = sin.nextDouble();
		double ans = a * a;
		
		System.out.println("Square of " + a + " is " + ans);
	}
	
	public void Sqrt() {
		Scanner sin = new Scanner(System.in);
		
		double a = sin.nextDouble();
		double ans = Math.sqrt(a);
		
		System.out.println("Square root of" + a + " is " + ans);
	}
	
	public void Cube() {
		Scanner sin = new Scanner(System.in);
		
		double a = sin.nextDouble();
		double ans = a * a * a;
		
		System.out.println("Cube of" + a + " is " + ans);
	}
	
	public void CubeRoot() {
		Scanner sin = new Scanner(System.in);
		
		double a  = sin.nextDouble();
		double ans = Math.cbrt(a);
		
		System.out.println("Cube root of" + a + " is " + ans);
	}
	
	public void Inverse() {
		Scanner sin = new Scanner(System.in);
		
		double a = sin.nextDouble();
		double ans = 1 / a;
		
		System.out.println("Inverse of" + a + " is " + ans);
	}
}
