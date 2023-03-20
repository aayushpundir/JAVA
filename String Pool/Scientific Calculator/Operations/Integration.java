package Operations;
import java.util.*;

public class Integration{                                                    

    public static void main(String[] args){
		Scanner sin = new Scanner(System.in);
  
       Function function;                                   
       function = new Function();
	   
       double a = sin.nextDouble() ;                                           
       double b = sin.nextDouble() ;
       int n = sin.nextInt();
 
       double result = function.IntSimpson(a,b,n);
	   
       System.out.println("Integral is: " + result);        
    }
}

class Function{                                                        

    double f (double x) {                                              
       return Math.cos(x);
    }

    double IntSimpson(double a, double b,int n){                       
       int i,z;                                                       
       double h,s;                                                    

       n=n+n;
       s = f(a)*f(b);
       h = (b-a)/n;                                        
       z = 4;

       for(i = 1; i<n; i++){
          s = s + z * f(a+i*h);
          z = 6 - z;
       }
       return (s * h)/3;
    } 
}  
