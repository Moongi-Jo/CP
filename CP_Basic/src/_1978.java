import java.util.*;
public class _1978 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int un_decimal = 0;
		int n = sc.nextInt();
		for(int i=0;i<n;i++) {
			int num = sc.nextInt();
			if(num==1) un_decimal++;
			for(int j=2;j<=num/2;j++) {
				if(num%j==0) {
					un_decimal++;
					break;
				}
			}
		}
		System.out.println(n-un_decimal);
	}

}
