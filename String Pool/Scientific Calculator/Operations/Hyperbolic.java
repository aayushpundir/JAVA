package Operations;
import java.util.*;
import java.lang.*;

public class Hyperbolic {
	public void Sinh() {
		Scanner sin = new Scanner(System.in);
		
		double num = sin.nextDouble();
		double ans = Math.sinh(num);
		
		System.out.println("sinh(" + num + ") = " + ans);
	}
	
	public void Cosh() {
		Scanner sin = new Scanner(System.in);
		
		double num = sin.nextDouble();
		double ans = Math.cosh(num);
		
		System.out.println("cosh(" + num + ") = " + ans); 
	}
	
	public void Tanh() {
		Scanner sin = new Scanner(System.in);
		
		double num = sin.nextDouble();
		double ans = Math.tanh(num);
		
		System.out.println("tanh(" + num + ") = " + ans); 
	}
}