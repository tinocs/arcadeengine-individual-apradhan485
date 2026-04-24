package breakout;

import engine.Actor;
import javafx.scene.image.Image;

public class Brick extends Actor{

	Image image;
	public Brick() {
		String path = getClass().getClassLoader().getResource("breakoutresources/brick.png").toString();
		image = new Image(path);
		this.setImage(image);
	}
	
	@Override
	public void act(long now) {
		// TODO Auto-generated method stub
		
	}

}
