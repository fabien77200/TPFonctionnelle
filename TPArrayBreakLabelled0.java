package org.formation.fonctionnelle;

import java.util.Scanner;

//utilisation de tableaux, Break et labels.

public class TPArrayBreakLabelled0 {

	public static void main(String[] args) {

		int compteur = 0;
		int entreeUtilisateur = -1;

		int[] UneDimension = { 32, 87, 3, 589, 12, 1076, 2000, 8, 622, 127 };
		Scanner sc = new Scanner(System.in);

		System.out.println("entrez un entier : (exemple: 12, 87, 622)");
		entreeUtilisateur = sc.nextInt();

		for (int value : UneDimension) {
			if (value == entreeUtilisateur) {
				System.out.println("valeur trouvée à l'indice " + compteur + ", on sort de la boucle par un break.");
				break;
			} else {
				System.out.println("la valeur n'existe pas à l'indice " + compteur + ".");
			}
			compteur++;
		}

		// tableaux à deux dimensions

		int[][] DeuxDimensionsA = { { 12, 16, 334, 543 }, { 3_456, 0, 34, 23 }, { 345, 10_000, 3_555, 2 } };

		int[][] DeuxDimensionsB = new int[3][];
		DeuxDimensionsB[0] = new int[4];
		DeuxDimensionsB[1] = new int[4];
		DeuxDimensionsB[2] = new int[4];
		DeuxDimensionsB[0][0] = 12;
		DeuxDimensionsB[0][1] = 16;
		DeuxDimensionsB[0][2] = 334;
		DeuxDimensionsB[0][3] = 543;
		DeuxDimensionsB[1][0] = 5_785;
		DeuxDimensionsB[1][1] = 0;
		DeuxDimensionsB[1][2] = 9_999;
		DeuxDimensionsB[1][3] = 3_445;
		DeuxDimensionsB[2][0] = 4;
		DeuxDimensionsB[2][1] = 333;
		DeuxDimensionsB[2][2] = 209;
		DeuxDimensionsB[2][3] = 3_456;

		do {
			System.out.println("entrez un entier entre 0 et 10000 (exemple:34 = DeuxDimensions[1][2])");
			entreeUtilisateur = sc.nextInt();
		} while (entreeUtilisateur < 0 || entreeUtilisateur > 10000);

		// utilisation du label outer pour sortir des deux boucles lorsque le
		// résultat est trouvé.
		outer: for (int i = 0; i < DeuxDimensionsA.length; i++) {

			for (int j = 0; j < DeuxDimensionsA.length; j++) {

				if (DeuxDimensionsA[i][j] == entreeUtilisateur) {
					System.out.println("trouvé dans DeuxDimensions [" + i + "][" + j
							+ "].\n je sort des deux boucles imbriquées par un break suivi d'un label");
					break outer;
				} else {
					System.out.println("non trouvé dans DeuxDimensions [" + i + "][" + j + "].");
				}

			}

		}

		do {
			System.out.println("entrez un entier entre 0 et 10000");
			entreeUtilisateur = sc.nextInt();
		} while (entreeUtilisateur < 0 || entreeUtilisateur > 10000);

		for (int i = 0; i < DeuxDimensionsA.length; i++) {

			int compteurPlus = 0, compteurMoins = 0;

			for (int j = 0; j < DeuxDimensionsA.length; j++) {

				if (DeuxDimensionsB[i][j] >= entreeUtilisateur) {
					compteurPlus++;
					System.out.println("DeuxDimensions [" + i + "][" + j + "] = " + DeuxDimensionsB[i][j] + " >= à "
							+ entreeUtilisateur + ".");
				} else {
					compteurMoins++;
					System.out.println("DeuxDimensions [" + i + "][" + j + "] = " + DeuxDimensionsB[i][j] + " < à "
							+ entreeUtilisateur + ".");
				}

			}

			System.out.println(
					"Dans la colonne n°"+(i+1)+" (indice: "+i+")  du tableau,\n il y a " + compteurPlus + " valeurs supérieures ou égales.\n et "
							+ compteurMoins + " valeurs inférieures au nombre entré.");

		}

	}
}
