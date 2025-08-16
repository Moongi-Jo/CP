import java.util.*;
public class _30802 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int size[] = new int[6];
		
		for(int i=0;i<6;i++) {
			size[i]=sc.nextInt();
		}
		int t=sc.nextInt();
		int p = sc.nextInt();
		int t_num =0;
		
		for(int i=0;i<6;i++) {
			t_num += size[i]/t;
			if(size[i]%t!=0)t_num ++ ;
		}
		System.out.println(t_num);
		
		System.out.printf("%d %d",n/p,n%p);
		
		
			

	}

}
