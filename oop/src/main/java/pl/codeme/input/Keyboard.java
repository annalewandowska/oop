package pl.codeme.input;

import java.io.IOException;

public class Keyboard {

	public static void main(String[] args) {
		
		Keyboard input = new Keyboard();
		
		System.out.print("Proszê podaj imiê: ");
		System.out.println(input.readLine());
		
		System.out.print("Proszê podaj liczbê: ");
		System.out.println(input.readNumber());
	
	}
	
	public String readLine(){
		String inputString = "";
		
		try {
			do {
				char inputChar = (char)System.in.read();
				if (inputChar == 13 || inputChar == 10) continue;
				inputString = inputString + inputChar;
				}		
			while (System.in.available() > 0);
		}catch(IOException a){}
		
		return inputString;	
		}
	
	
	public int readNumber(){	
		return Integer.valueOf(readLine());
	}
}




//zrobiæ w domu//znaleŸæ kod charów i zrobiæ *10+
//public int readNumber(){
//int inputNumber = 0;
//
//try{
//	do{
//		inputNumber = System.in.read();

//		if ((char)inputNumber == 13 || (char)inputNumber == 10) continue;
//	}while(System.in.available() > 0);
//		
//}catch(IOException a){}
//
//return inputNumber;
//}