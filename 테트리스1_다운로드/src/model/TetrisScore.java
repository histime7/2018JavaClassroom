package model;

public class TetrisScore {
	public int score;//���� ����
	
	public TetrisScore(){
		score = 0;
	}
	
	public void scoreUp(){
		score = score + 100;
	}
}
