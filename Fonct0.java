package org.formation.fonctionnelle;

import java.util.Scanner;

public class Fonct0 {

	public static void main(String[] args) {

		// TODO partie 1: opérations sur des variables de type entier et type
		// double
		int x = 8, y = 10;

		// TODO opérations sur les entiers
		int somme = x + y;
		int difference = x - y;
		int produit = x * y;
		int division = x / y;
		int modulo = x % y;

		System.out.println("int x = " + x + " int y= " + y + ".");
		System.out.println("Somme = " + somme + ", différence = " + difference + ", produit = " + produit
				+ ", division = " + division + ", modulo x%y = " + modulo + ".");

		// TODO déclaration et assignation des variables de type double.
		double a = 8.0, b = 10.0;

		// TODO opérations sur les doubles
		double sommeDeAB = a + b;
		double differenceDeAB = a - b;
		double produitDeAB = a * b;
		double divisionDeAB = a / b;
		double moduloDeAB = a % b;

		System.out.println("double a = " + a + " double b= " + b + ".");
		System.out.println("Somme = " + sommeDeAB + ", différence = " + differenceDeAB + ", produit = " + produitDeAB
				+ ", division = " + divisionDeAB + ", modulo a%b = " + moduloDeAB + ".");

		// TODO Partie 2 application prenant un nombre entre 0 et 1000 puis
		// faisant la somme digit du nombre entré.

		// Création d'une instance de la classe Scanner afin de récupérer les
		// données depuis le clavier
		Scanner sc = new Scanner(System.in);

		// déclaration des variables utilisées.
		int nombre = -1;

		// Je fais une boucle pour demander à l'utilisateur de l'application, un
		// nombre entre 0 et 1000
		// compris.
		do {
			System.out.println("Entrez un nombre entre 0 et 1000");
			nombre = sc.nextInt();
		} while (nombre < 0 || nombre > 1000);

		String nombreCastString = "" + nombre;
		int resultatModulo = nombre;
		int nombreRestant = nombre;
		int sommeChiffres = 0;

		// Je fais une boucle pour récupérer la valeur des chiffres afin de les
		// additionner.
		for (int i = 0; i < nombreCastString.length(); i++) {
			resultatModulo = nombreRestant % 10;
			sommeChiffres += resultatModulo;
			System.out.println(
					"Le chiffre n°" + (i + 1) + " = " + resultatModulo + ", la somme des chiffres = " + sommeChiffres);
			nombreRestant = nombreRestant / 10;
		}

		// j'affiche le résultat final
		System.out.println("La somme des chiffres dans " + nombre + " = " + sommeChiffres);

		
		sc.close();
		
	}

}
