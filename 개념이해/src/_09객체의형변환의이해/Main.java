package _09객체의형변환의이해;

public class Main {

	public static void main(String[] args) {
		자식 myS1 = new 자식();
		부모 myF1 = new 부모();

		myS1.cry();
		
		myF1=myS1;
		myF1.cry();
		
		자식 myS2;
		부모 myF2;
		myS1=(자식)myF1;
		
		//myS1=(자식)myF2;
	}

}
