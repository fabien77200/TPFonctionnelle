package org.formation.fonctionnelle;

public class StringvsBuilder {

	public static void main(String[] args) {

		StringBuilder lievre = new StringBuilder();
		String tortue = "";
		int timeTortue, timeTortueStart, timeTortueFinish;
		int timeLievre, timeLievreStart, timeLievreFinish;

		// Calcul du temps �coul� pour un String
		timeTortueStart = (int) System.currentTimeMillis();
		for (int i = 0; i < 10_000; i++) {
			tortue += "" + i;
		}
		timeTortueFinish = (int) System.currentTimeMillis();
		timeTortue = timeTortueFinish - timeTortueStart;
		System.out.println("temps �coul� pour la \"Torutue\" = " + timeTortue+" millisecondes");

		// Calcul du temps �coul� avec un StringBuilder
		timeLievreStart = (int) System.currentTimeMillis();
		for (int i = 0; i < 10_000; i++) {
			lievre.append("" + i);
		}
		timeLievreFinish = (int) System.currentTimeMillis();
		timeLievre = timeLievreFinish - timeLievreStart;
		System.out.println("temps �coul� pour le \"Li�vre\" = " + timeLievre+" millisecondes");

		//Test pour connaitre le vainqueur String vs Builder
		if (timeLievre < timeTortue)
			System.out.println(
					"Le li�vre vainqueur ! \nl'utilisation de la m�thode .append() d'un StringBuilder est plus efficace que la conocat�nation sur objet String");
		else
			System.out.println(
					"La tortue vainqueur ! \nl'utilisation de la concat�nation sur un objet String est plus objet String est plus efficace que la m�thode append() d'un objet StringBuuilder");

	}

}
