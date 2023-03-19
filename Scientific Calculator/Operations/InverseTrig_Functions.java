package Operations;
import java.util.*;
import java.lang.Math;

public class InverseTrig_Functions {
	public void ASin() {
		Scanner in = new Scanner(System.in);
		
		double Degree, ans;
		Degree = in.nextDouble();
		double radians = Math.toRadians(Degree);
		ans = Math.asin(radians);
		
		System.out.println("sin_inverse(" + Degree + ") = " + ans);
	}
	
	public void ACos() {
		Scanner in = new Scanner(System.in);
		
		double Degree, ans;
		Degree = in.nextDouble();
		double radians = Math.toRadians(Degree);
		ans = Math.acos(radians);
		
		System.out.println("cos_inverse(" + Degree + ") = " + ans);
	}
	
	public void ATan() {
		Scanner in = new Scanner(System.in);
		
		double Degree, ans;
		Degree = in.nextDouble();
		double radians = Math.toRadians(Degree);
		ans = Math.atan(radians);
		
		System.out.println("tan_inverse(" + Degree + ") = " + ans);
	}
}