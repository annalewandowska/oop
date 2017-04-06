package pl.codeme.javafx;

import javafx.scene.layout.GridPane;

public class CalBtnAction extends CalButton {

	public CalBtnAction(String text) {
		super(text);
	}

	private String str;
	
	public static void generate(GridPane parent, int posx, int posy, String text){
		
		CalBtnAction btn = new CalBtnAction(text);
		btn.str = text;
		initCalBtn(parent, posx, posy, btn);
	}
	
	@Override
	protected void action(){
		Calculator.getInstance().operate(str);
		
	}
	
}
