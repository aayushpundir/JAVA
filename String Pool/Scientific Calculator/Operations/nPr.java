package Operations;
import java.util.*;
import java.io.*;

public class nPr {
	public int fact(int n)
    {
        if (n <= 1)
            return 1;
        return n * fact(n - 1);
    }
 
    public int Pr(int n, int r)
    {
        return fact(n) / fact(n - r);
    }
	
	// This portion is for NPR calculation.
	
    public void NPR()
    {
		Scanner sin = new Scanner(System.in);
		
		System.out.println("Enter the value of n and r");
		
        int n = sin.nextInt();
        int r = sin.nextInt();
 
        System.out.println(n + "P" + r + " = " + Pr(n, r));
    }
	
	public int Cr(int n, int r)
	{
		return fact2(n) / (fact2(r) *
					fact2(n - r));
	}
 
	public int fact2(int n)
	{
		if(n==0)
			return 1;
		int res = 1;
		for (int i = 2; i <= n; i++)
			res = res * i;
		return res;
	}
 
	public void NCR()
	{
		Scanner sin = new Scanner(System.in);
		
		System.out.println("Enter the value of n and r");
		
		int n = sin.nextInt();
		int r = sin.nextInt();
		System.out.println(n + "C" + r + " = " + Cr(n, r));
	}
}