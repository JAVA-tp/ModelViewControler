package vues;

import java.util.List;

import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import classes.Division;
import controleurs.ControleurPrincipal;
import dao.DAO;
import dao.DivisionDAO;


public class Design extends JFrame {

	private JPanel contentPane;
	public JMenuItem mntmFermer = new JMenuItem("Fermer");
	private ControleurPrincipal controleur = new ControleurPrincipal(null, null);

	
	/**
	 * Create the frame.
	 */
	public Design(ControleurPrincipal controleur) {
		this.controleur=controleur;
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		
		JMenuBar menuBar = new JMenuBar();
		setJMenuBar(menuBar);
		
		JMenu mnDivision = new JMenu("Division");
		menuBar.add(mnDivision);
		
		JMenuItem mntmVisualiser = new JMenuItem("Visualiser");
		mnDivision.add(mntmVisualiser);
		JMenuItem mntmModifier = new JMenuItem("Modifier");
		mnDivision.add(mntmModifier);
		JMenuItem mntmAjouter = new JMenuItem("Ajouter");
		mnDivision.add(mntmAjouter);
		JMenuItem mntmSupprimer = new JMenuItem("Supprimer");
		mnDivision.add(mntmSupprimer);
		
		JMenu mnEleves = new JMenu("Élèves");
		menuBar.add(mnEleves);
		DAO<Division> daoDiv = new DivisionDAO();
		List<Division> lesDiv = daoDiv.readAll();
		for (Division uneDiv : lesDiv ) {
			JMenuItem divisionEleve = new JMenuItem(uneDiv.getLibelle());
			mnEleves.add(divisionEleve);
		}
		
		
		mntmFermer.addActionListener(controleur);
		menuBar.add(mntmFermer);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		setVisible(true);
	}
}
