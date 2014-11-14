package classes;

public class Eleve {
	
	//Déclaration des variables
	
	private int code;
	private String nom, prenom, dateNaiss;
	Division div;
	
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
		this.div = null;
	}
	
	//Contructeur
	/**
	 * Constructeur avec initialisation
	 * @param code
	 * @param libelle
	 */
	public Eleve(int code, String nom, String prenom, String dateNaiss, Division div){
		this.code = code;
		this.nom = nom;
		this.prenom = prenom;
		this.dateNaiss = dateNaiss;
		this.div = div;
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
	
	/**
	 * Accesseur de la division
	 * 
	 * @return div (Division)
	 */
	public Division getDivision() {
		return this.div;
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

	/**
	 * Setteur de la division
	 */
	public void setDiv(Division obj) {
		this.div = obj;
	}
	
	//Méthode
	/**
	 * Methode toString
	 * @return le code & le libelle
	 */
	public String ToString(){
		return "L'éléve " + this.prenom + " " + this.nom + " né le " + this.dateNaiss + " à pour code : " + this.code;
	}
}
