package org.formation.fonctionnelle;

public class FonctFor {

	public static void main(String[] args) {

		int compteur = 0;

		int[] entiers = new int[12];
		String[] villesBretagne = { "Lorient", "Laval", "Rennes", "Brest", "Vannes", "Saint-Nazaire", "Guingamp",
				"AutreVille", "Nantes", "Londres", "Paris", "Créteil", "Nanterre","Gennevilliers", "Versailles" };

		final String Home = "Nantes";

		// utilisation de la boucle for à partir de la longueur du table
		// "entiers"
		System.out.println("décrémentation de l'indice d'une boucle for : ");
		for (int i = entiers.length; i > -1; i--) {
			System.out.println("indice = " + i);
		}

		// utilisation d'une boucle for each à partir du tableau villesBretagne:
		System.out.println("boucle for each sur un tableau contenant des noms de villes");
		for(String value : villesBretagne) {
			compteur += 1;
			System.out.println("ville n°" + compteur + " : " + value);
		}

		
		for(int i=0; i<villesBretagne.length; i++){
			if(villesBretagne[i]==Home){
				System.out.println(villesBretagne[i]+" Capitale des ducs de Bretagne");
			}else{
				System.out.println(villesBretagne[i]+" ...");
			}
		}
		
	}

}
