import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);

		int n;
		int h,w,m;
		n=sc.nextInt();

		for(int i=0;i<n;i++){
			h=sc.nextInt();
			w=sc.nextInt();
			m=sc.nextInt();
			
			if(m%h==0){
				System.out.println(h *100 +m/h);
			}else{
				System.out.println(m%h *100 +(m/h+1));
			}
		}		

    }
}
