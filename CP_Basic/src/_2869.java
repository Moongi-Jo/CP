import java.util.*;

public class _2869 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int increase = sc.nextInt();
		int decrease = sc.nextInt();
		int finish = sc.nextInt();
		int high_de = increase-decrease;
		int day = 0;
		
		
		
		day = (finish - increase + high_de - 1) / high_de + 1;
			
		
		System.out.println(day);
	}

}
