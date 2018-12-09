package 자바코드를통한UI설계;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;

public class Main01 extends Application {
	
	@Override
	public void start(Stage primaryStage) throws Exception {
		HBox hbox = new HBox();
		hbox.setPadding(new Insets(10));
		hbox.setSpacing(10);

		TextField textField = new TextField();
		textField.setPrefWidth(200);

		Button button = new Button();
		button.setText("확인");

		// 방법1
		hbox.getChildren().add(textField);
		hbox.getChildren().add(button);

		// 방법2
//		ObservableList list=hbox.getChildren();
//		list.add(textField);
//		list.add(button);

		Scene scene = new Scene(hbox);

		primaryStage.setTitle("AppMain");
		primaryStage.setScene(scene);
		primaryStage.show();
	}

	public static void main(String[] args) {
		launch(args);
	}
}
