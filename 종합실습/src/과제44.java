import java.util.Scanner;

public class ����44 {
	public static void main(String[] args) {
		System.out.print("�ڿ��� n: ");
		Scanner sc=new Scanner(System.in);
		
		int n=sc.nextInt();
		int nums[][]=new int[n][n];

		int cnt=1;
		for(int i=0; i<n; i++)
			for(int j=0; j<=i; j++)
				nums[i-j][j]=cnt++;
		
		for(int i=0; i<n; i++) {
			for(int j=0; j<n; j++) {
				if(nums[i][j]!=0)
					System.out.printf("%3d", nums[i][j]);
			}
			System.out.println();
		}
	}
}