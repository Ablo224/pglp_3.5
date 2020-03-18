package uvsq21606235;

import java.time.LocalDateTime;

/**
 * 
 * Auteur : Abdoulaye
 * 
 * version 1.1
 */

public class uneClasseMetier {
	
	public uneClasseMetier() {
		
	}
	
	public void uneMethodeMetier() {
		Logger l = new Displays();
		
		l.display(LocalDateTime.now()+ " Début de la methode metier");
		
		/**
		 * 
		 * Traitements
		 */

		l.display(LocalDateTime.now()+ " Fin de méthode métier");
		
		
	}

}
