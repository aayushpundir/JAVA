package Operations;
import java.util.*;

public class Trig_Functions {
	public void Sin() {
		Scanner in = new Scanner(System.in);
		
		double Degree, ans;
		Degree = in.nextDouble();
		double radians = Math.toRadians(Degree);
		ans = Math.sin(radians);
		
		System.out.println("sin(" + Degree + ") = " + ans);
	}
	
	public void Cos() {
		Scanner in = new Scanner(System.in);
		
		double Degree, ans;
		Degree = in.nextDouble();
		double radians = Math.toRadians(Degree);
		ans = Math.cos(radians);
		
		System.out.println("cos(" + Degree + ") = " + ans);
	}
	
	public void Tan() {
		Scanner in = new Scanner(System.in);
		
		double Degree, ans;
		Degree = in.nextDouble();
		double radians = Math.toRadians(Degree);
		ans = Math.tan(radians);
		
		System.out.println("tan(" + Degree + ") = " + ans);
	}
}