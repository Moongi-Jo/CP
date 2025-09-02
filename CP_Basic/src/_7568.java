import java.util.*;
import java.io.*;

 class human{
	int x;
	int y;
	human(int x, int y) {
	        this.x = x;
	        this.y = y;
	    }
	int count = 0;
}
 
public class _7568 {

	public static int match(int a, int b, int c, int d) {
		if(a>b&&c>d) return 1;
		if(a<b&&c<d) return -1;
		return 0;
	}
	
	public static void main(String[] args) throws NumberFormatException, IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		
		int n = Integer.parseInt(br.readLine());
		
		human man[] = new human[n];
		
		for(int i=0;i<n;i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			int x = Integer.parseInt(st.nextToken());
			int y = Integer.parseInt(st.nextToken());
			
			man[i] = new human(x,y);
		}
		
		for(int i=0;i<n;i++) {
			for(int j=i+1;j<n;j++) {
				switch(match(man[i].x,man[j].x,man[i].y,man[j].y)) {
				case 1:
					man[j].count++;
					break;
				case -1:
					man[i].count++;
					break;
				default:		
				}
			}
		}
		
		for(int i=0;i<n;i++) {
			bw.write(man[i].count+1+" ");
		}
		
		br.close();
		bw.flush();
		bw.close();
	}

}
