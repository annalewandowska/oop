package pl.codeme.javafx;

import javafx.scene.control.Label;

public class UpdateUserInterface implements UpdateUI {

	Label lbl;
	
	public UpdateUserInterface(Label lbl) {
		this.lbl = lbl;
	}
	
	@Override
	public void update(String text) {
		lbl.setText(text);
		
	}

}
