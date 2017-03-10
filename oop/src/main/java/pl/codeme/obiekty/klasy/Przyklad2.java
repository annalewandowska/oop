package pl.codeme.obiekty.klasy;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.HashSet;
import java.util.Properties;
import java.util.Set;

import org.json.simple.JSONObject;

import pl.codeme.output.Screen;

public class Przyklad2 {

	public static void main(String[] args) {
		
		JSONObject myJson = new JSONObject();
				myJson.put("name", "Anka");
				myJson.put("age", "not specified");
				myJson.put("sth", "whatever");
		System.out.println(myJson.toJSONString());
				
			
		
	//	Properties props = System.getProperties();
	//	props.list(System.out);
	//	System.out.println(props.getProperty("user.home"));
		
		createProperties();
	
		
		listProperties(loadProperties());
		
	//	saveCzlowiek();
		
	//	Czlowiek cz = loadCzlowiek();
	//	System.out.println(cz.getWiek());
	//	try(FileInputStream fis = new FileInputStream("czlowiek.serialized")){
		//	jakiœ kod
	//	}catch (Exception e){}
	}
	
	private static Czlowiek loadCzlowiek(){
		Czlowiek czlowiek = null;
		try{
			ObjectInputStream ois = new ObjectInputStream(new FileInputStream("czlowiek.serialized"));
			czlowiek = (Czlowiek)ois.readObject();
			ois.close();
		} catch (Exception e){}
		return czlowiek;
	}

	private static void saveCzlowiek(){
		try {
			ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("czlowiek.serialized"));
			oos.writeObject(new Czlowiek());
			oos.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	private static void createProperties(){
		Properties myProp = new Properties();
		myProp.setProperty("user.number", "1");
		myProp.setProperty("user.name", "Anka");
		myProp.setProperty("user.age", "not specified");
		try {
			myProp.store(new FileOutputStream("myProperties.properties"), "Komentarz");
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	private static Properties loadProperties(){
		Properties props = new Properties();
		try {
			props.load(new FileInputStream("myProperties.properties"));
		}catch (Exception e){}
		return props;
	}
	
	//kluczem string xxy wartoœci¹ point
	
	private static void uglyScreen(Screen screen){
		
	}
	
	private static void listProperties(Properties props){
	//	Set<Object> keySet = props.keySet();
		//Object[] keys = keySet.toArray();
		
		
	//	Set<Object> keySet = props.keySet();
		Object[] keys = props.keySet().toArray();
		
		for(int i=0; i<keys.length; i++){
			String key = (String)keys[i];
			System.out.println(i + ":" + key + ": " + props.getProperty(key));
		}
		
		//props.list(System.out);
	}
}
