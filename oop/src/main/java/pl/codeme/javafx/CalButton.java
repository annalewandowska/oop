package pl.codeme.javafx;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.control.Button;
import javafx.scene.layout.GridPane;

public class CalButton extends Button{

	CalButton btn;
	
	public CalButton(String text){
		super(text);
	}
	
	public static void initCalBtn(GridPane parent, int posx, int posy, CalButton btn) {
		
		parent.add(btn, posx, posy);
		
		btn.setOnAction(new EventHandler<ActionEvent>() {
			@Override
			public void handle(ActionEvent event){
				btn.action();
			}
		}
		);
	}

	protected void action(){
		System.out.println("tekst");
	}
}


//generateNumber, generateDzialanie
