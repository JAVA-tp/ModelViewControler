package tests;

import classes.Division;
import classes.Eleve;
import dao.DAO;
import dao.EleveDAO;

public class TestDAO {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		DAO<Eleve> eleve = new EleveDAO();

		// test de la recherche d'un élève en fonction de son code

		System.out.println(eleve.read(1).ToString());

		Eleve unEleve = new Eleve(24, "TITI", "TOTO", "12/12/2000", new Division(1, "classe bts SIO 1"));

		// test de l'insertion d'un nouvel élève

		unEleve = eleve.create(unEleve);

		System.out.println(eleve.read(1).ToString());

	}

}