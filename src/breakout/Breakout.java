package breakout;

import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;

public class Breakout extends Application{

	
	public static void main(String[] args) {
		launch(args);
	}
	
	
	@Override
	public void start(Stage stage) throws Exception {
		// TODO Auto-generated method stub
		stage.setTitle("Breakout");
		BorderPane root = new BorderPane();
		BallWorld world = new BallWorld();
		root.setCenter(world);
		
		
		
		Scene scene = new Scene(root, 800, 600);
		world.start();
		
		stage.setScene(scene);
		stage.show();
	}

}
