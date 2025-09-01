import java.util.*;

public class _11050 {
	
	static int factor(int n) {
		int x=1;
		for(int i=2;i<=n;i++) {
			x *= i;
		}
		return x;
	}
	static int Conpi(int n,int k) {
		return (int)factor(n)/(factor(k)*factor(n-k));
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n=sc.nextInt(); 
		int k= sc.nextInt();
		
		System.out.println(Conpi(n,k));
		

	}

}
