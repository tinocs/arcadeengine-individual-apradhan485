package breakout;

import engine.Actor;
import javafx.scene.image.Image;

public class Ball extends Actor{

	double dx;
	double dy;
	Image image;
	double width = image.getWidth()/2;
	double height = image.getHeight()/2;
	
	public Ball() {
		String path = getClass().getClassLoader().getResource("breakoutresources/ball.png").toString();
		image = new Image(path);
		this.setImage(image);
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
	}

}
