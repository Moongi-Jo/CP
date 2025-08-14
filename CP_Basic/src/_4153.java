import java.util.*;
class Constants{
	public static int THREE = 3;
}

public class _4153 {
	
	public static String triangle(int a[]) {
		int max=a[0];
		int num=0;
		
		for(int i=1;i<Constants.THREE;i++) {
			if (max<a[i]) {
				num += max;
				max = a[i];
			}
			else {num += a[i];}	
		}
		
		if (max == num){return "right";}
		else return "wrong";
	}
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		while(true) {
			int a[] = new int[Constants.THREE];
			int Non = 0;
			
			for(int i=0;i<Constants.THREE;i++) {
			 a[i] = sc.nextInt();
			 a[i] *= a[i];
			 if(a[i]==0) Non++;
			}
			if(Non == Constants.THREE) {break;}
			else {System.out.println(triangle(a));}	
			}

	}
}

