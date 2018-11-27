package 피보나치;

import java.util.Scanner;

public class Main1 {
	int[][] memo=new int[41][3];
	
	public static void main(String[] args) {
		Main1 m=new Main1();
		m.start();
	}
	
	void start() {
		memo[0][0]=memo[1][1]=1;
		memo[1][2]=1;
		
		Scanner sc=new Scanner(System.in);
		int cnt=sc.nextInt();
		for(int i=0; i<cnt; i++) {
			int n=sc.nextInt();
			int result=fibo(n);
			System.out.println(memo[n][2] + ":" + memo[n][0] + " "  + memo[n][1]);
		}
	}
	
	int fibo(int k) {
		if(memo[k][0]+memo[k][1]>0) return memo[k][2];
		
		memo[k][2]=fibo(k-1)+fibo(k-2);
		memo[k][0]=memo[k-1][0]+memo[k-2][0];
		memo[k][1]=memo[k-1][1]+memo[k-2][1];
		return memo[k][2];
	}
}
