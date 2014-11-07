package tests;

import classes.Eleve;

public class TestsEleve {
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Eleve monEleve = new Eleve();
		
		System.out.println("le code est : " + monEleve.getCode());
		System.out.println("le nom est : " + monEleve.getNom());
		System.out.println("le prenom est : " + monEleve.getPrenom());
		System.out.println("la date de naissance : " + monEleve.getDateNaiss());
		System.out.println(monEleve.toString());
		monEleve.setCode(12);
		System.out.println("le code est : " + monEleve.getCode());
		monEleve.setNom("Durandt");
		System.out.println("le nom est : " + monEleve.getNom());
		monEleve.setPrenom("Sarah");
		System.out.println("le prenom est : " + monEleve.getPrenom());
		monEleve.setDateNaiss("14/02/05");
		System.out.println("la date de naissance : " + monEleve.getDateNaiss());
		System.out.println(monEleve.toString());
	}
}
