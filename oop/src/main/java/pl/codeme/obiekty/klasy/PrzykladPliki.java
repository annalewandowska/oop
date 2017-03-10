package pl.codeme.obiekty.klasy;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;

public class PrzykladPliki {

	public static void main(String[] args) {
		PrzykladPliki przykladPliki = new PrzykladPliki();
	//	System.out.println(przykladPliki.readFile());
		
		przykladPliki.readLineFromKeyboard();
		
	}

	
	private void readLineFromKeyboard(){
		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(isr);
		try {
			System.out.println("Odczyta³em: " + br.readLine());
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}
	
	private String readFile(){
		
		String readed = "";
		try {
				BufferedReader in = new BufferedReader(new FileReader("przyklad.txt"));
				readed = in.readLine();
				in.close();
		
			} catch (IOException e) {
				e.printStackTrace();
			}
		
		return readed;
	}
	
	private void saveFile(){	
		BufferedWriter out;
		try {
			FileWriter outFile = new FileWriter("przyklad.txt");
			out = new BufferedWriter(outFile);
			try {
				out.write("Witaj œwiecie");
			}finally {
				out.close();
			}	
		} catch (IOException e) {
			e.printStackTrace();
		}finally {
			System.out.print("Zapisa³em");
		}
	}
	
}
