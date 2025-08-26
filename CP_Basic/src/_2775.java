import java.util.*;


public class _2775 {

	static int test(int k, int n) {
		int arr[] = new int[n];
		for(int i=0;i<n;i++) {
			arr[i]= i+1;
		}
		
		for(int i=0;i<k;i++) {
			for(int j=1;j<n;j++) {
				arr[j] = arr[j]+arr[j-1];
			}
		}
		return arr[n-1];
		
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int t_case = sc.nextInt();
		
		for(int i=0;i<t_case;i++) {
			System.out.println(test(sc.nextInt(),sc.nextInt()));
			
		}

		
	}
}
