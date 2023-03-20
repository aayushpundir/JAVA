import Operations.*;
import java.util.*;

class Scientific_Calculator {
	public static void main(String[] args) {
		Scanner sin = new Scanner(System.in);
		int n;
		
		System.out.println("Enter 1 to perform Arithmetic Calculations.");
		System.out.println("Enter 2 to perform Logical Calculations.");
		System.out.println("Enter 3 to find the Square Root, Square, Cube Root or Cube of a number.");
		System.out.println("Enter 4 to perform calculations for the Trigonometric Functions.");
		System.out.println("Enter 5 to perform calculations for the Inverse Trigonometric Functions.");
		System.out.println("Enter 6 to perform calculations for the Logarithm and Anti Logarithm Functions.");
		System.out.println("Enter 7 to perform calculations for the Permutations and Combinations.");
		System.out.println("Enter 8 to perform calculations for the Hyperbolic Functions.");
		
		n = sin.nextInt();
		
		switch(n) {
			case 1:
				System.out.println("Enter 1 to perform addition of two numbers.");
				System.out.println("Enter 2 to perform subtraction of two numbers.");
				System.out.println("Enter 3 to perform multiplication of two numbers.");
				System.out.println("Enter 4 to perform divison of two numbers.");
				
				int num = sin.nextInt();
				Arithmetic_Operations AO = new Arithmetic_Operations();
				
				if (num == 1)
					AO.Addition();
				else if (num == 2)
					AO.Subtraction();
				else if (num == 3)
					AO.Multiplication();
				else	
					AO.Divison();
				break;
				
			case 2:
				System.out.println("Enter 1 to perform AND operation.");
				System.out.println("Enter 2 to perform OR operation.");
				System.out.println("Enter 3 to perform X-OR operation.");
				
				int num1 = sin.nextInt();
				Logical_Operations LO = new Logical_Operations();
				
				if (num1 == 1)
					LO.LogicalAnd();
				else if (num1 == 2)
					LO.LogicalOr();
				else	
					LO.LogicalXor();
					
				break;
			
			case 3:
				System.out.println("Enter 1 to perform Square of number.");
				System.out.println("Enter 2 to perform Square Root of number.");
				System.out.println("Enter 3 to perform Cube of the number.");
				System.out.println("Enter 4 to perform Cuber Root of the number.");
				
				int num5 = sin.nextInt();
				Square SQ = new Square();
				
				if (num5 == 1)
					SQ.Squr();
				else if (num5 == 2)
					SQ.Sqrt();
				else if (num5 == 3)
					SQ.Cube();
				else	
					SQ.CubeRoot();
				break;
			
			case 4:
				System.out.println("Enter 1 to perform Sine operation.");
				System.out.println("Enter 2 to perform Cosine operation.");
				System.out.println("Enter 3 to perform Tangent operation.");
				
				int num2 = sin.nextInt();
				Trig_Functions TF = new Trig_Functions();
				
				if (num2 == 1)
					TF.Sin();
				else if (num2 == 2)
					TF.Cos();
				else 
					TF.Tan();
					
				break;
				
			case 5:
				System.out.println("Enter 1 to perform  Inverse Sine operation.");
				System.out.println("Enter 2 to perform Inverse Cosine operation.");
				System.out.println("Enter 3 to perform Inverse Tangent operation.");
				
				int num3 = sin.nextInt();
				InverseTrig_Functions ITF = new InverseTrig_Functions();
				
				if(num3 == 1)
					ITF.ASin();
				else if(num3 == 2)
					ITF.ACos();
				else
					ITF.ATan();
					
				break;
				
			case 6:
				System.out.println("Enter 1 to perform  Logarithm of a number.");
				System.out.println("Enter 2 to perform Anti Logarithm of a number.");
				
				int num4 = sin.nextInt();
				Log L = new Log();
				
				if (num4 == 1)
					L.Logarithm();
				else
					L.AntiLogarithm();
				
				break;
				
			case 7:
				System.out.println("Enter 1 to perform  Combination.");
				System.out.println("Enter 2 to perform Permutations.");
				
				int num6 = sin.nextInt();
				nPr np = new nPr();
				
				if (num6 == 1)
					np.NCR();
				else
					np.NPR();
					
				break;
				
			case 8:
				System.out.println("Enter 1 to perform Hyperbolic Sine of a number.");
				System.out.println("Enter 2 to perform Hyperbolic Cosine of a number.");
				System.out.println("Enter 3 to perform Hyperbolic Tangent of a  numbers.");
				
				int num7 = sin.nextInt();
				Hyperbolic HP = new Hyperbolic();
				
				if (num7 == 1)
					HP.Sinh();
				else if (num7 == 2)
					HP.Cosh();
				else	
					HP.Tanh();
					
				break;
		}
		
	}
}