package org.formation.fonctionnelle;

import java.util.Scanner;

public class GuessNumber {

	public static void main(String[] args) {

		Scanner scn = new Scanner(System.in);
		int entreeUtilisateur, nbAleatoire, solution = -1;

		System.out.println("enter a figure between 0 and 10 :");
		entreeUtilisateur = scn.nextInt();

		nbAleatoire = (int) (Math.random() * 10);
		int tentatives = 0;

		do {

			if (nbAleatoire < entreeUtilisateur) {
				System.out.println("too high, retry:");
				entreeUtilisateur = scn.nextInt();
				tentatives++;
			} else if (nbAleatoire > entreeUtilisateur) {
				System.out.println("too low, retry:");
				entreeUtilisateur = scn.nextInt();
				tentatives++;
			} else {
				System.out.println("found after " + (tentatives + 1));
				solution = 1;
			}

		} while (solution != 1);

		scn.close();
	}

}
