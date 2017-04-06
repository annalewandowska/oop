package pl.codeme.javafx;

import javafx.scene.control.Button;
import javafx.scene.layout.GridPane;

public class CalBtnNumber extends CalButton{

	public CalBtnNumber(String text) {
		super(text);
	}
	
	private int number;
	
	public static void generate(GridPane parent, int posx, int posy, String text){
		
		CalBtnNumber btn = new CalBtnNumber(text);
		btn.number = Integer.valueOf(text);
		initCalBtn(parent, posx, posy, btn);
	}
	
	@Override
	protected void action(){
		Calculator.getInstance().number(number);
		
	}
}
