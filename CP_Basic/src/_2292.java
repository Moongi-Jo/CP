import java.util.*;

public class _2292 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int line = 0;
		int i = 1;
		while(true) {
			if(n>line*6+i) {
				i += line*6;
				line++;
			}else {
				break;
				
			}
			
		}
		System.out.println(line+1);
	}

}
