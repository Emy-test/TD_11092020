package pac1Test;

import static org.junit.Assert.*;

import java.util.ArrayList;

import org.junit.BeforeClass;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import org.junit.runners.Parameterized.BeforeParam;

import pac1.Orange;
import pac1.Panier;

public class PanierTest {
	private static Orange o1, o2, o3, o4, o5;
	private static ArrayList<Orange> liste, liste1;
	private static Panier panier, panier1;

	
	@BeforeClass
	public static void init() {
		o1= new Orange(0.5, "France");
		o2= new Orange(0.6, "France");
		o3= new Orange(0.7, "Espagne");
		o4= new Orange(0.5, "Floride");
		o5= new Orange(0.8, "USA");
		liste = new ArrayList<Orange>();
		liste1 = new ArrayList<Orange>();
		panier= new Panier(liste, 10);
		panier1= new Panier(liste1, 5);
		
	}


	@Test
	public void test() {
		
		System.out.println("Panier 1: ");
		System.out.println(panier1.toString());
		
		panier.ajoute(o1);
		panier.ajoute(o2);
		panier.ajoute(o3);
		panier.ajoute(o4);
		panier.ajoute(o5);
		panier.ajoute(o5);
		
		panier1.ajoute(o1);
		panier1.ajoute(o2);
		panier1.ajoute(o5);
		panier1.ajoute(o4);
		panier1.ajoute(o5);
		
					
		System.out.println(panier1.getPanier());
		System.out.println(panier.getPanier());
		
		System.out.println(panier.toString());
		System.out.println("Panier 1: ");
		System.out.println(panier1.toString());
		
		assertEquals(false, panier.estPlein());
		assertEquals(true, panier1.estPlein());
		assertEquals(false, panier.estVide());
		assertEquals(3.9, panier.getPrix(), 0.01);
		assertEquals(false, panier1.equals(panier1, panier));
		
		panier.boycottOrigine("Espagne");
	}

//	@Test( expected = RuntimeException.class)
//	public void testadd() {
//
//		
//		panier1.ajoute(o3);
//	}
}
