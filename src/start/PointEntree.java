package start;
import vues.Design;
import controleurs.ControleurPrincipal;
import classes.Division;
import classes.Eleve;
import dao.ConnexionPostgreSql;
import dao.DAO;
import dao.DivisionDAO;
import dao.EleveDAO;

public class PointEntree {
	
	public static Design interfaceGraph;

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		DAO<Division> modeleDivision = new DivisionDAO();
		DAO<Eleve> modeleEleve = new EleveDAO();

		ControleurPrincipal controleurPrincipal = new ControleurPrincipal(modeleDivision, modeleEleve);
		interfaceGraph = new Design(controleurPrincipal);
		controleurPrincipal.lienVue(interfaceGraph);
		
		ConnexionPostgreSql.Stop();
	}
}
