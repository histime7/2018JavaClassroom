import java.util.Scanner;

public class 과제45 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		System.out.print("자연수 n: ");
		int n=sc.nextInt();
		int nums[][]=new int[n+1][n+1];
		nums[1][1]=1;
		
		for(int i=2; i<=n; i++)
			for(int j=1; j<=i; j++)
				nums[i][j]=nums[i-1][j-1]+nums[i-1][j];
		
		System.out.println("[파스칼의 삼각형]");
		for(int i=1; i<=n; i++) {
			for(int j=1; j<=i; j++)
				System.out.printf("%2d ", nums[i][j]);
			System.out.println();
		}
	}
}