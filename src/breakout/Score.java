package breakout;

import javafx.scene.text.Font;
import javafx.scene.text.Text;

public class Score extends Text{
	private int score;
	
	public Score() {
		score = 0;
		this.setFont(new Font(15));
		updateDisplay();
	}
	
	public int getScore() {
		return score;
	}
	
	public void setScore(int score) {
		this.score = score;
		updateDisplay();
	}
	
	
	public void updateDisplay() {
		this.setText(score + "");
	}
	
	
}
