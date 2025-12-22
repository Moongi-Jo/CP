import java.util.*;
import java.io.*;

class person{
	int age;
	String name;
	
	person(int age, String name){
		this.age = age;
		this.name = name;
	}
}
public class _10814 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
		
		int n = Integer.parseInt(br.readLine());
		person p[] = new person[n];
		for(int i=0;i<n;i++) {
			 String[] input = br.readLine().split(" ");
			 p[i] = new person(Integer.parseInt(input[0]), input[1]);
		}
		
		   Arrays.sort(p, Comparator.comparingInt(o -> o.age));
		
		
	for(int i=0;i<n;i++) {
		System.out.println(p[i].age +" "+p[i].name);
		}	
	}

}
