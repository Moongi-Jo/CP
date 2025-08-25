import java.util.*;

public class _15829 {
	
	public static long power(int base, int ex) {
		if(ex == 0) return 1;
	return base*power(base, ex-1)%M;
	}
	
	static int r = 31;
	static int M = 1234567891;
	
	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	
	int n = sc.nextInt();
	String s = sc.next();
	long x = 0;
	
	for(int i =0;i < s.length(); i++) {
		x += (s.charAt(i)-'a'+1)*power(r,i);
	}
		System.out.println(x%M);
	}

}
