import java.util.Scanner;

public class ����46 {
	public static void main(String[] args) {
		int arr[][] = { 
						{ 0, 95, 100, 88, 65, 76, 89, 58, 93, 77, 99 }, 
						{ 0, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1 } 
					  };

		for (int i = 1; i <= 10; i++)
			for (int j = 1; j <= 10; j++)
				if (arr[0][i] <= arr[0][j])
					arr[1][j]++;

		System.out.println("[���� �����]");
		for (int i = 1; i <= 10; i++)
			System.out.printf("%2d��: %d��(%d��)\n", i, arr[0][i], arr[1][i]);
	}
}