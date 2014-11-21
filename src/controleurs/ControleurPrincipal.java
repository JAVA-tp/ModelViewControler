package controleurs;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import classes.Division;
import classes.Eleve;

import dao.DAO;
import dao.DivisionDAO;
import dao.EleveDAO;

import vues.Design;

public class ControleurPrincipal implements ActionListener {
	private Design design;
	private DAO<Division> division = new DivisionDAO();
	private DAO<Eleve> eleve = new EleveDAO();

	// Constructeur
	public ControleurPrincipal(DAO<Division> modeleD, DAO<Eleve> modeleE) {
		this.division = modeleD;
		this.eleve = modeleE;
	}

	public void lienVue(Design design) {
		this.design = design;
	}

	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == design.mntmFermer) {
			design.dispose();
		}
	}
}
