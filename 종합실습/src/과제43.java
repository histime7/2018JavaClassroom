import java.util.Scanner;

public class 과제43 {
	public static void main(String[] args) {
		int nums[], n;
		
		System.out.print("자연수 n: ");
		Scanner sc=new Scanner(System.in);
		
		n=sc.nextInt();
		nums=new int[n+1];
		
		for(int i=0; i<=n; i++)
			nums[i]=i;
		
		for(int i=2; i<=n; i++) {
			for(int j=2; i*j<=n; j++) {
				nums[i*j]=0;
			}
		}
		
		System.out.println("[배열 요소]");
		for(int i=1; i<=n; i++) {
			if(i==1) 
				System.out.printf("%4d", 0);
			else
				System.out.printf("%4d", nums[i]);
		}
	}
}