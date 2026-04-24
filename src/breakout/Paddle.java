package breakout;

import engine.Actor;
import javafx.scene.image.Image;
import javafx.scene.input.KeyCode;

public class Paddle extends Actor{
	
	Image image;
	
	public Paddle() {
		String path = getClass().getClassLoader().getResource("breakoutresources/paddle.png").toString();
		image = new Image(path);
		this.setImage(image);
	}

	@Override
	public void act(long now) {
		// TODO Auto-generated method stub
		if(getWorld().isKeyPressed(KeyCode.RIGHT)) {
			this.setX(this.getX() + 4);
		}
		if(getWorld().isKeyPressed(KeyCode.LEFT)) {
			this.setX(this.getX() - 4);
		}
	}

}
