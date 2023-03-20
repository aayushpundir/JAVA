import inheritance.*;
import java.util.*;

class InHeritance {
	public static void main(String[] args) {
		int n, m;

		Scanner sin = new Scanner(System.in);

		System.out.println("Enter 1 to perform Single Inheritance and 2 to perform MultiLevel Inheritance");
		n = sin.nextInt();
		switch(n) {
			case 1:
				Single_Inheritance S = new Single_Inheritance();

				S.Get_Details();
				S.Get_Marks();
				S.Calculate_Total();
				S.Show_Details();
				break;

			case 2:
				MultiLevel_Inheritance M = new MultiLevel_Inheritance();
				M.Get_Details();
				M.Get_Marks();
				M.Calculate_Total();
				M.Show_Details();
				break;
	
		}	
	}
}