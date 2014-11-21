package vues;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.SwingConstants;
import javax.swing.KeyStroke;

import classes.Division;
import start.PointEntree;

import java.awt.event.KeyEvent;
import java.awt.event.InputEvent;
import java.util.List;

import dao.DAO;
import dao.DivisionDAO;
import dao.EleveDAO;
import javax.swing.JTable;
import javax.swing.JLabel;

import controleurs.ControleurPrincipal;
import javax.swing.JButton;


public class Design extends JFrame {

	private JPanel contentPane;
	public JMenuItem mntmFermer = new JMenuItem("Fermer");
	protected static ControleurPrincipal controleur;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					PointEntree.interfaceGraph.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public Design(ControleurPrincipal unControleur) {
		this.controleur=unControleur;
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
	}
}
