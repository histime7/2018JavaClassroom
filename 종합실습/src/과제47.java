import java.util.Scanner;

public class 과제47 {
	public static void main(String[] args) {
		int[][] arr1=new int[5][5], arr2=new int[5][5];

		for(int i=0; i<5; i++)
			for(int j=0; j<5; j++)
				arr1[i][j]=i*5+(j+1);
		
		for(int i=0; i<5; i++)
			for(int j=0; j<5; j++)
				arr2[4-j][4-i]=arr1[i][j];
		
		System.out.println("[arr1 배열 요소]");
		for(int i=0; i<5; i++) {
			for(int j=0; j<5; j++)
				System.out.printf("%2d ", arr1[i][j]);
			System.out.println();
		}
		
		System.out.println("\n[arr2 배열 요소]");
		for(int i=0; i<5; i++) {
			for(int j=0; j<5; j++)
				System.out.printf("%2d ", arr2[i][j]);
			System.out.println();
		}
	}
}