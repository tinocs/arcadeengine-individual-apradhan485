package breakout;

import engine.Actor;
import javafx.scene.image.Image;

public class Ball extends Actor{

	double dx;
	double dy;
	Image image;
	double width;
	double height;
	
	public Ball() {
		String path = getClass().getClassLoader().getResource("breakoutresources/ball.png").toString();
		image = new Image(path);
		this.setImage(image);
		width = image.getWidth()/2;
		height = image.getHeight()/2;
		dx = 4;
		dy = 4;
		
	}
	
	@Override
	public void act(long now) {
		// TODO Auto-generated method stub
		move(dx, dy);
		if(this.getX() >= getWorld().getWidth() - width) {
			dx = -dx;
		}
		if(this.getX() < width) {
			dx = -dx;
		}
		
		if(this.getY() >= getWorld().getHeight() - height) {
			dy = -dy;
		}
		if(this.getY() < height) {
			dy = -dy;
		}
		
		if(this.getOneIntersectingObject(Paddle.class) != null) {
			dy = -dy;
		}
		
		if(this.getOneIntersectingObject(Brick.class) != null) {
			Brick brick = this.getOneIntersectingObject(Brick.class);
			if(this.getX() >= brick.getX() && this.getX() <= brick.getX() + brick.getImage().getWidth()) {
				dy = -dy;
			}
			if(this.getY() >= brick.getY() && this.getY() <= brick.getY() + brick.getImage().getHeight()) {
				dx = -dx;
			}else {
				dx = -dx;
				dy = -dy;
			}
			getWorld().remove(brick);
			
		
		}
		
	}

}
