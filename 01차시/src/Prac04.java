import java.io.IOException;

public class Prac04 {
	public static void main(String[] args) {
		int a;
		try {
			while((a=System.in.read()) != '\r') {
				System.out.print((char)a);
			}
		} catch (IOException e) {
			e.printStackTrace();
		} 
		System.out.print("\nÃâ·Â ³¡");
	}
}
