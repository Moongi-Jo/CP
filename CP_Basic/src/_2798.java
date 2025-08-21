import java.util.*;

public class _2798 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n= sc.nextInt();
		int max = sc.nextInt();
		int card[] = new int[n];
		int solve = 0;
		for(int i =0;i<n;i++) {
			card[i] = sc.nextInt();
		}
		Arrays.sort(card);
		
		
		for(int i=0;i<n;i++) {
			if(max<card[i]) continue;
			for(int j=i+1;j<n;j++) {
				if(max<card[i]+card[j]) continue;
				for(int k=j+1;k<n;k++) {
					if(max<card[i]+card[j]+card[k]) continue;
					else if(solve < card[i]+card[j]+card[k])
						solve = card[i]+card[j]+card[k];
					
				}
			}
		}

		System.out.println(solve);
	}

}
