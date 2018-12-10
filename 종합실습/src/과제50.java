import java.util.Scanner;

public class 과제50 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		System.out.print("마방진크기(홀수) n: ");
		int n=sc.nextInt();
		int nums[][]=new int[n][n];

		int r=0, c=n/2;
		
		for(int i=1; i<=n*n; i++) {
			nums[r][c]=i;
			r--; c++;			
			if(r>=0 && c==n) c=0;
			if(r==-1 && c<n) r=n-1;
			if((r==-1 && c==n)) {
				r+=2;
				c-=1;
			}
		}
		
		System.out.println("[홀수마방진]");
		for(int i=0; i<n; i++) {
			for(int j=0; j<n; j++)
				System.out.printf("%3d ", nums[i][j]);
			System.out.println();
		}
	}
}