package pl.codeme.javafx;

import javafx.application.*;
import javafx.event.ActionEvent;
import javafx.event.Event;
import javafx.event.EventHandler;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.text.TextAlignment;
import javafx.stage.Stage;

public class CalculatorApp extends Application{

	public static void main(String[] args) {
		launch();
	}

	@Override
	public void start(Stage primaryStage) throws Exception {

		//Calculator calculator = Calculator.getInstance();
		GridPane cal = new GridPane();
		
		Scene scn = new Scene(cal, 100, 200);
		
		primaryStage.setTitle("Moja pierwsza aplikcja");
		primaryStage.setScene(scn);
		primaryStage.show();
		//	box.getChildren().add(btn);
			
		Label lbl = new Label("0");
	//	lbl.setMinWidth(100);
		lbl.setTextAlignment(TextAlignment.CENTER);
	//	lbl.setAlignment(Pos.BASELINE_CENTER);
		Calculator.getInstance().setUpdateUI(new UpdateUserInterface(lbl));
		
		cal.add(lbl, 0, 0, 4, 1);
		CalBtnNumber.generate(cal, 1, 1, "1");
		CalBtnNumber.generate(cal, 2, 1, "2");
		CalBtnNumber.generate(cal, 3, 1, "3");
		CalBtnAction.generate(cal, 4, 1, "+");
		
		CalBtnNumber.generate(cal, 1, 2, "4");
		CalBtnNumber.generate(cal, 2, 2, "5");
		CalBtnNumber.generate(cal, 3, 2, "6");
		CalBtnAction.generate(cal, 4, 2, "-");
		
		CalBtnNumber.generate(cal, 1, 3, "7");
		CalBtnNumber.generate(cal, 2, 3, "8");
		CalBtnNumber.generate(cal, 3, 3, "9");
		CalBtnAction.generate(cal, 4, 3, "/");
		
		CalBtnNumber.generate(cal, 1, 4, "0");
		CalBtnAction.generate(cal, 2, 4, "C");
		CalBtnAction.generate(cal, 3, 4, "=");
		CalBtnAction.generate(cal, 4, 4, "*");
		
//		cal.add(btn1, 1, 1);
//		cal.add(btn2, 2, 1);
		
		//HBox box1 = new HBox();
	}

}
