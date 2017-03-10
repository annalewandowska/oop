package pl.codeme.obiekty;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;

import pl.codeme.obiekty.klasy.Czlowiek;

public class PrzykladKolekcje {

	public static void main(String[] args) {
	//	setExample();
		//arrayListExample();
		hashMapExample();
	}

	public static void hashMapExample(){
		HashMap<String, String> hm = new HashMap<>();
		hm.put("user.login", "marek zegarek");
		System.out.println(hm.get("user.login"));
		
	}
	
	public static void arrayListExample(){
		ArrayList<Integer> al = new ArrayList<Integer>();
		al.add(10);
		al.add(0, 20);
		al.get(0);
		al.size();
	}
	
	public static void setExample(){
		HashSet<String> hs = new HashSet<String>();
		hs.add("addas");
		System.out.println("addas " +hs.contains("addas"));
		System.out.println("dadda " +hs.contains("dadda"));
	}
}
