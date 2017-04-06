package pl.codeme.javafx;

import java.util.Scanner;
import java.util.StringTokenizer;

public class Calculator {

	private static Calculator c;
	
	private UpdateUI updateUI;
	
	private Calculator(){
		
	}
	
	private String s = "";
	
	private double firstComp;
	private double secondComp;
	private String operation;
	
	public int add(int v1, int v2){
		return v1 + v2;
	}
	
	public double div(double v1, double v2){
		return v1/v2;
	}
	
	public void calculate(){
		StringTokenizer tokenizer = new StringTokenizer(s);
		while (tokenizer.hasMoreTokens()){
			firstComp = Double.valueOf(tokenizer.nextToken());
			operation = tokenizer.nextToken();
			secondComp = Double.valueOf(tokenizer.nextToken());
		}
		
		switch (operation) {
			case "+": s = String.valueOf(firstComp + secondComp);
				break;
			case "-": s = String.valueOf(firstComp - secondComp);
				break;
			case "*": s = String.valueOf(firstComp * secondComp);
				break;
			case "/": 
				if(secondComp == 0){
					s = "Nie dziel przez 0";
					break;
				}
				s = String.valueOf( firstComp / secondComp);
				break;
		}

		updateUI.update(s);
	}
	
	public void operate(String text){
		if (text.equals("=")){
			calculate();
			s = "";
		}else if (text.equals("C")){
			updateUI.update("");
			s = "";
		} else {
			s = s.concat(" " + text + " ");
			updateUI.update(s);
			}
	}
	
	public void number(int number){
		s = s.concat(""+number);
		updateUI.update(s);
	}
	
	public void setUpdateUI(UpdateUI updateUI){
		this.updateUI = updateUI;
	}
	
	public static Calculator getInstance(){
		if (c == null) {
			c = new Calculator();
		}
		return c;
	}
	
}
