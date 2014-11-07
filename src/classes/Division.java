package classes;

public class Division {
	
	//Déclaration des variables
	
	private int code;
	private String libelle;
	
	//Contructeur par défaut
	/**
	 * Constructeur par défaut
	 * @param
	 * @param
	 */
	public Division(){
		this.code = 0;
		this.libelle = "";
	}
	
	//Contructeur
	/**
	 * Constructeur avec initialisation
	 * @param code
	 * @param libelle
	 */
	public Division(int code, String libelle){
		this.code = code;
		this.libelle = libelle;
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
	 * Accesseur du libelle
	 * @return libelle(string)
	 */
	public String getLibelle() {
		return this.libelle;
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
	 * Setteur du libelle
	 * @param libelle(string)
	 */
	public void setLibelle(String libelle){
		this.libelle = libelle;
	}
	
	//Méthode
	/**
	 * Methode toString
	 * @return le code & le libelle
	 */
	public String toString(){
		return "Le code est : " + code + "et le libelle est : " + libelle;
	}
}
