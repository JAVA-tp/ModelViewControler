package classes;

public class Eleve {
	
	//Déclaration des variables
	
	private int code;
	private String nom, prenom, dateNaiss;
	
	//Contructeur par défaut
	/**
	 * Constructeur par défaut
	 * @param
	 * @param
	 */
	public Eleve(){
		this.code = 0;
		this.nom = "NULL";
		this.prenom = "NULL";
		this.dateNaiss = "NULL";
	}
	
	//Contructeur
	/**
	 * Constructeur avec initialisation
	 * @param code
	 * @param libelle
	 */
	public Eleve(int code, String nom, String prenom, String dateNaiss){
		this.code = 0;
		this.nom = nom;
		this.prenom = prenom;
		this.dateNaiss = dateNaiss;
	}
	//Accesseurs
	
	/**
	 * Accesseur du code
	 * @return code(int)
	 */
	public int getCode() {
		return this.code;
	}
	
	/**
	 * Accesseur du nom
	 * @return nom(string)
	 */
	public String getNom() {
		return this.nom;
	}
	
	/**
	 * Accesseur du prenom
	 * @return prenom(string)
	 */
	public String getPrenom() {
		return this.prenom;
	}
	
	/**
	 * Accesseur de la date de naissance
	 * @return dateNaiss(string)
	 */
	public String getDateNaiss() {
		return this.dateNaiss;
	}
	
	//Mutateurs
	
	/**
	 * Setteur du code
	 * @param code(int)
	 */
	public void setCode(int code) {
		this.code = code;
	}
	
	/**
	 * Setteur du nom
	 * @param nom(String)
	 */
	public void setNom(String nom) {
		this.nom = nom;
	}
	
	/**
	 * Setteur du prenom
	 * @param prenom(String)
	 */
	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}
	
	/**
	 * Setteur de la date de naissance
	 * @param dateNaiss(String)
	 */
	public void setDateNaiss(String dateNaiss) {
		this.dateNaiss = dateNaiss;
	}
	
	//Méthode
	/**
	 * Methode toString
	 * @return le code & le libelle
	 */
	public String toString(){
		return "L'éléve " + this.prenom + " " + this.nom + " né le " + this.dateNaiss + " à pour code : " + this.code;
	}
}
