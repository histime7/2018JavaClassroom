import java.util.Scanner;

public class 과제49 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		System.out.print("배열크기 n: ");
		int n=sc.nextInt();
		int nums[][]=new int[n][n];

		int r=0, c=-1;
		int 방향=-1, cnt=1;
		
		for(int i=n-1; i>=0; i--) {
			방향*=-1;
			for(int j=0; j<=i; j++) {
				c+=방향;
				nums[r][c]=cnt++;
			}
			
			for(int j=0; j<i; j++) {
				r+=방향;
				nums[r][c]=cnt++;;
			}
		}
		
		System.out.println("[달팽이 배열]");
		for(int i=0; i<n; i++) {
			for(int j=0; j<n; j++)
				System.out.printf("%3d ", nums[i][j]);
			System.out.println();
		}
	}
}