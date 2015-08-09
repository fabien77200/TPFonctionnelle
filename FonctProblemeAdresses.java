package org.formation.fonctionnelle;

import java.util.*;

public class FonctProblemeAdresses {

	public static void main(String[] args) {

		// TODO cr�er et remplir le tableau adresses.

		String[] adresses = new String[10];
		adresses[0] = "pierre@gmail.com";
		adresses[1] = "luc@orange.fr";
		adresses[2] = "jean@orange.fr";
		adresses[3] = "mathieu@outlook.fr";
		adresses[4] = "simon@yahoo.fr";
		adresses[5] = "moise@gmail.com";
		adresses[6] = "jesus@gmail.com";
		adresses[7] = "abraham@orange.fr";
		adresses[8] = "judas@yahoo.fr";
		adresses[9] = "salomon@laposte.fr";

		// TODO cr�er et remplir le tableau listeFournisseurs.
		String[] listeFournisseurs = new String[10];
		char at = '@';// caract�re recherch� par la m�thode IndexOf().
		char pt = '.';

		for (int i = 0; i < adresses.length; i++) {
			listeFournisseurs[i] = adresses[i].substring(adresses[i].indexOf(at) + 1, adresses[i].indexOf(pt));
			System.out.println("listeFournisseur [" + i + "] = " + listeFournisseurs[i]);
		}

		// TODO cr�er et remplir des listes nomsFournisseurs et nbClients
		ArrayList<String> listeSsDoublons = new ArrayList<>();
		ArrayList<Integer> nbClients = new ArrayList<>();

		for (int i = 0; i < listeFournisseurs.length; i++) {
			int indice = rechercheFournisseur(listeFournisseurs[i], listeSsDoublons);
			if (indice == -1)
				listeSsDoublons.add(listeFournisseurs[i]);
		}

		for (int i = 0; i < listeSsDoublons.size(); i++) {
			System.out.println("listeSsDoublons [" + i + "] = " + listeSsDoublons.get(i));
			int c = 0;
			for (int j = 0; j < listeFournisseurs.length; j++) {
				if (listeFournisseurs[j].equals(listeSsDoublons.get(i))) {
					c++;
				}
			}
			nbClients.add(c);
		}

		// TODO calculer les parts de march�, et afficher les r�sultats pour
		// chaque fournisseur.
		double sum = 0.0;
		for (double value : nbClients) {
			sum += value;
		}
		for (int i = 0; i < nbClients.size(); i++) {
			System.out.println("nbClients par fournisseur : " + listeSsDoublons.get(i) + " = " + nbClients.get(i)
					+ " client(s).\n soit : " + nbClients.get(i) * 100 / sum + " %");
		}
	}

	// TODO cr�er une fonction static permettant d'analyser le tableau
	// listeFournisseurs.

	public static int rechercheFournisseur(String fournisseur, ArrayList<String> nomsFourn) {
		int indice = -1;
		for (String value : nomsFourn) {
			if (fournisseur.equals(value)) {
				indice = 1;
			}
		}
		return indice;
	}

}
