package test_fonctionnel;

import java.util.Iterator;

import personnages.Gaulois;
import personnages.Romain; 

public class TestGaulois {

	public static void main(String[] args) {
		Gaulois asterix = new Gaulois("Asterix", 8);
		Gaulois obelix = new Gaulois("Obelix", 16);
		Romain minus = new Romain("Minus", 6);
		
		asterix.parler("Bonjour Obelix.");
		obelix.parler("Bonjour Asterix. Ca te dirais d'aller chasser des sangliers?");
		asterix.parler("Oui très bonne idée.");
		System.out.println("Dans la forêt Astérix et Obélix tombent nez à nez sur le romain Minus.");
		
		for (int i = 0 ;i <3 ;i++) {
			asterix.frapper(minus);
	
			
		}


		
		
		

	}

}
