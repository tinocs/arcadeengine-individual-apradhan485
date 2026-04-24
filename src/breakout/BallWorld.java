package breakout;

import engine.World;

public class BallWorld extends World{

	Paddle paddle;
	Score score;
	public BallWorld() {
		this.setPrefSize(400, 600);
	}
	
	@Override
	public void act(long now) {
		// TODO Auto-generated method stub
		this.setOnMouseMoved(e -> {
		    
			paddle.setX(e.getX() - paddle.getWidth()/2);
		});
		
		
		
	}

	@Override
	public void onDimensionsInitialized() {
		// TODO Auto-generated method stub
		Ball ball = new Ball();
		ball.setX(this.getWidth()/2);
		ball.setY(this.getHeight()/2);
		this.add(ball);
		
		paddle = new Paddle();
		paddle.setX(getWidth()/2);
		paddle.setY(getHeight() - 4 * paddle.getImage().getHeight());
		this.add(paddle);
		
		score = new Score();
		score.setX(50);
		score.setY(50);
		getChildren().add(score);
		
		
	}
	
	public Score getScore() {
		return score;
	}

}
