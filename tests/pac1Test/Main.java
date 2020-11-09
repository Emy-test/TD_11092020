package pac1Test;

import java.util.ArrayList;

import org.junit.Test;

import pac1.Orange;
import pac1.Panier;

public class Main {
	private static Orange o1, o2, o3, o4, o5;
	private static ArrayList<Orange> panier1;
	private static Panier panier;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		o1= new Orange(0.5, "France");
		o2= new Orange(0.6, "France");
		o3= new Orange(0.7, "Espagne");
		o4= new Orange(0.5, "Floride");
		o5= new Orange(0.8, "USA");
		panier1 = new ArrayList<Orange>();
		panier= new Panier(panier1, 10);
	
		panier.ajoute(o1);
		panier.ajoute(o2);
		panier.ajoute(o3);
		panier.ajoute(o4);
		panier.ajoute(o5);
		System.out.println(panier.toString());
		
		panier.boycottOrigine("USA");
		
		System.out.println(panier.toString());
		
		System.out.println(panier.estPlein());
		System.out.println(panier.estVide());
		panier.retire();
		System.out.println(panier);
		
	} 
	}


