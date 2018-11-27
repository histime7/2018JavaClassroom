package 피보나치;

import java.util.Scanner;

public class Main2 {
	public static void main(String[] args) {
		int[][] memo=new int[41][3];
		memo[0][0]=1; memo[0][1]=0; memo[0][2]=0;
		memo[1][0]=0; memo[1][1]=1; memo[1][2]=1;
		
		Scanner sc=new Scanner(System.in);
		int cnt=sc.nextInt();
		for(int i=0; i<cnt; i++) {
			int n=sc.nextInt();
			//n번째 피보나치 수
			for(int t=2; t<=n; t++) {
				memo[t][0]=memo[t-2][0]+memo[t-1][0];
				memo[t][1]=memo[t-2][1]+memo[t-1][1];
				memo[t][2]=memo[t-2][2]+memo[t-1][2];
			}
			System.out.println(memo[n][2] + ":" + memo[n][0] + " "  + memo[n][1]);
		}
	}
}
