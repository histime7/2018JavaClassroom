import java.util.Scanner;

public class ����49 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		System.out.print("�迭ũ�� n: ");
		int n=sc.nextInt();
		int nums[][]=new int[n][n];

		int r=0, c=-1;
		int ����=-1, cnt=1;
		
		for(int i=n-1; i>=0; i--) {
			����*=-1;
			for(int j=0; j<=i; j++) {
				c+=����;
				nums[r][c]=cnt++;
			}
			
			for(int j=0; j<i; j++) {
				r+=����;
				nums[r][c]=cnt++;
			}
		}
		
		System.out.println("[������ �迭]");
		for(int i=0; i<n; i++) {
			for(int j=0; j<n; j++)
				System.out.printf("%3d ", nums[i][j]);
			System.out.println();
		}
	}
}