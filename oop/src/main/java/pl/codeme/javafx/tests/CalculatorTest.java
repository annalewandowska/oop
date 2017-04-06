package pl.codeme.javafx.tests;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import pl.codeme.javafx.Calculator;

//import org.junit.runners.Suite.SuiteClasses;

public class CalculatorTest {
	
	private Calculator calc;
	private TestUserInterface tui;
	
	@BeforeClass
	public static void initClassTest(){
		System.out.println("@BeforeClass");
	}
	
	@AfterClass
	public static void cleanClassTest(){
		System.out.println("@AfterClass");
	}
	
	@Before
	public void initializeCalculator(){
		System.out.println("Inicjalizujê kalkulator");
		
		calc = Calculator.getInstance();
		tui = new TestUserInterface();
		calc.setUpdateUI(tui);
	}
	
	@After
	public void cleanupCalculator(){
		System.out.println("Sprz¹tam po kalkulatorze");
	}
	
	@Test
	public void testNumber(){
		calc.number(1);
		assertEquals("Czy wyœwietlam co trzeba", "1", tui.getLastMessage());
		
		System.out.println("Test number()");
	}
	
	@Test(timeout = 1000)
	public void testAdd(){
		System.out.println("Test add()");
		calc = Calculator.getInstance();
		assertEquals("Proste dodawanie: ", 2, calc.add(1, 1));
	//	assertEquals("Proste dodawanie: ", 1, calc.add(Integer.MAX_VALUE, 1));
	}
	
	@Test(expected = ArithmeticException.class)
	public void testDiv(){
		System.out.println("Test div()");
		//calc = Calculator.getInstance();
		double a = 2;
		a = 2/0;
		
//		try{
//			calc.div(2, 0);
//			assertEquals("Test div", 2, calc.div(2, 0));
//		}catch (ArithmeticException e){
//			assertEquals(e.getMessage(), "/ by zero");
//		}
	}
	
	
}
