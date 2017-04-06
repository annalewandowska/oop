package pl.codeme.javafx.tests;

import pl.codeme.javafx.UpdateUI;

public class TestUserInterface implements UpdateUI {

	private String lastMessage = "";
	
	@Override
	public void update(String text) {
		lastMessage = text;
	}

	public String getLastMessage(){
		return lastMessage;
	}
}
