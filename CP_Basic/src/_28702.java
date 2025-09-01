import java.util.*;

public class _28702 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String s[] = new String[3];
		int number=0;
		
		
		for(int i=0;i<3;i++) {
			s[i] = sc.next();
		}
		
		for(int i=0;i<3;i++) {
			if(s[i].charAt(0)!='F'&&s[i].charAt(0)!='B') {
				number = Integer.parseInt(s[i]);
				number += 3-i;
				break;
			}
		}
		String end="";
		if(number%3==0) {
			end +="Fizz";
		}
		if(number%5==0) {
			end +="Buzz";
		}
		if(end=="") {
			System.out.println(number);
		}
		else {
			System.out.println(end);
		}
		
		
	}

}
