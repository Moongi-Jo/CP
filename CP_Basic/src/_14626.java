import java.util.*;

public class _14626 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String ISBN = sc.next();
		int x = ISBN.indexOf("*");
		int sum = 0;
		int m = Integer.valueOf(ISBN.charAt(12))-'0';
		
		for(int i =0;i<ISBN.length()-1;i++) {
			if(i==x) continue;
			if(i%2==0) sum += Integer.valueOf(ISBN.charAt(i))-'0';
			else sum += (Integer.valueOf(ISBN.charAt(i))-'0')*3;
		}
		int dap=0;
		
		if(x%2==0) {
			dap = 10 - (sum+m) % 10;
		}
		else{
			for(int i=0;i<=9;i++) {
				if((sum+i*3+m)%10 == 0) dap = i;
			}
		}
		
		System.out.println(dap);	
	}
}
