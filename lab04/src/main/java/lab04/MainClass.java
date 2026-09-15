package lab04;

import javafx.application.Application;
import javafx.stage.Stage;

public class MainClass extends Application {
	public static void main(String[] args) {
		  launch();
		}

		public void start1(Stage primaryStage) {
		  try {
		    primaryStage.setTitle("My Project");

		    primaryStage.show();

		  } catch (Exception e) {
		    e.printStackTrace();
		  }
		}

		@Override
		public void start(Stage primaryStage) throws Exception {
			// TODO Auto-generated method stub
			
		}

}
