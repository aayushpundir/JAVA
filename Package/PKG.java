import java.util.*;
import XYZ.*;
class PKG {
	void put() {
		System.out.println("Hello End");
	}
	public static void main(String[] args) {
		stud s1 = new stud();
		PKG p1 = new PKG();
		Arithmetic_Operations AO = new Arithmetic_Operations();
		
		int a = Integer.parseInt(args[0]);
		int b = Integer.parseInt(args[1]);
		AO.Add(a, b);
		AO.Sub(a, b);
		AO.Mul(a , b);
		AO.Div(a, b);
		
	}
}