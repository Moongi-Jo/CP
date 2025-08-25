import java.util.*;
import java.lang.*;

public class _1259 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		
		while(true) {
			String s = sc.next();
			if(s.equals("0")) break;
			
			StringBuffer sb = new StringBuffer(s);
			
			String s_re = sb.reverse().toString();
			
			if(s.equals(s_re)) {
				System.out.println("yes");
			}else System.out.println("no");
			
		}

	}

}
