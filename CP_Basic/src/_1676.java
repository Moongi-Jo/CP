import java.util.*;

public class _1676 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int x=0;
		
		while(n/5!=0) {
			x += n/5;
			n = n/5;
		}
		System.out.println(x);

	}
}
