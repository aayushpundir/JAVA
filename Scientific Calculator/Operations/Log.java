package Operations;
import java.util.*;
import java.lang.*;

public class Log {
	public void Logarithm() {
		Scanner sin = new Scanner(System.in);
		
		double num = sin.nextDouble();
		double ans = Math.log(num);
		
		System.out.println("log(" + num + ") = " + ans);
	}
	
	public void AntiLogarithm() {
		Scanner sin = new Scanner(System.in);
		
		double num, ans;
		num = sin.nextDouble();
		ans = Math.pow(10, num);
		
		System.out.println("antilog(" + num + ") = " + ans);
	} 
}
