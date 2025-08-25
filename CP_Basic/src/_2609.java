import java.util.*;


public class _2609 {
	static int x;
	public static void max_n(int a, int b) {
		if(a%b==0) {
			x=b;
			System.out.println(b);
		}
			
		else max_n(b,a%b);	
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num1 = sc.nextInt();
		int num2 = sc.nextInt();
		
		
		
		if(num1>num2) max_n(num1,num2) ;
		else max_n(num2,num1);
		
		System.out.println(num1*num2/x);
		
		
		}
		
	}


