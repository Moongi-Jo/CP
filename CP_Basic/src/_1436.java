import java.util.*;

public class _1436 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int t = 0;
		String s = "666";
		int i = 1;
		while(n!=t) {
			i++;
			if(Integer.toString(i).indexOf(s)>=0) {
				t++;

			}
		}
		System.out.println(i);
	}

}
