import XYZ.*;
import java.util.*;

class Logical_Operations {
	void LogicalAnd(int a, int b) {
		int c;
		c = a & b;
		System.out.println("The Logical AND of the two numbers" + a + " and " + b + " is " + c);
	}
	void LogicalOr(int a, int b) {
		int c;
		c = a | b;
		System.out.println("The Logical OR of the two numbers" + a + " and " + b + " is " + c);
	}
	void LogicalXor(int a, int b) {
		int c;
		c = a ^ b;
		System.out.println("The Logical X-OR of the two numbers" + a + " and " + b + " is " + c);
	}
	public static void main(String[] args) {
		Logical_Operations LO = new Logical_Operations();
		Arithmetic_Operations AO = new Arithmetic_Operations();
		
		int a = Integer.parseInt(args[0]);
		int b = Integer.parseInt(args[1]);
		
		LO.LogicalAnd(a, b);
		LO.LogicalOr(a, b);
		LO.LogicalXor(a, b);
		
		AO.Add(a, b);
		AO.Sub(a, b);
		AO.Mul(a , b);
		AO.Div(a, b);
	}
}