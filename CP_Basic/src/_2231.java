import java.util.*;

public class _2231 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		boolean is_empty = true;
		int len = (int)Math.log10(n)+1;
		for(int i=n-len*9;i<n;i++) {
			int temp=i;
			int sum=i;
			while(temp>0) {
				sum += temp%10;
				temp /= 10;
			}
			if(n == sum) {
				System.out.println(i);
				is_empty = false;
				break;
			}
		}
		if(is_empty) {
			System.out.println(0);
		}
		
	}

}
