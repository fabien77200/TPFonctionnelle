package org.formation.fonctionnelle;


/**
 * @author Fabien
 */

public class FonctAvanceeDoWhile1 {

	public static void main(String[] args) {

		int aModulo = 0, bModulo = 0, cModulo = 0;
		int a, b, c;
		int compteur = 0;
		boolean condition = false;

		do {

			a = (int) (Math.round(Math.random() * 1000));
			aModulo = a % 2;

			b = (int) Math.round(Math.random() * 1000);
			bModulo = b % 2;

			c = (int) Math.round(Math.random() * 1000);
			cModulo = c % 2;

			if (aModulo == 0 && bModulo == 0 && cModulo == 1) {
				condition = true;
				System.out.println("found !");
			} else {
				System.out.println("not found (" + a + " " + b + " " + c + ")");

			}
			compteur++;

		} while (condition != true);

		System.out.println(compteur + " tentative(s) avant d'obtenir la bonne combinaison:\nPaire ET Paire ET Impaire");
		System.out.println(a + " " + b + " " + c);
	}

}
