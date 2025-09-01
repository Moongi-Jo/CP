import java.util.*;
public class _1181 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		String word[] = new String[N];
		
		Comparator<String> c =  new Comparator<String>() {
			
			@Override
			public int compare(String s1, String s2) {
				if(s1.length()==s2.length()) {
					return s1.compareTo(s2);
				}
				return s1.length() - s2.length();
				
			}
		
		};
		for(int i =0;i<N;i++) word[i] = sc.next();
		
		Arrays.sort(word, c);
		
		
		for(int i=0;i<N;i++) {
			if(i!=N-1) {
				if(word[i].equals(word[i+1])) {
					continue;
				}
			}
			
			System.out.println(word[i]);
		}
	}

}
