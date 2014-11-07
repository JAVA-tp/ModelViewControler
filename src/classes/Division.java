package classes;

public class Division {
	
	//Déclaration des variables
	
	private int code;
	private String libelle;
	
	//Contructeur par défaut
	
	public Division(){
		this.code = 0;
		this.libelle = "";
	}
	
	//Contructeur
	
	public Division(int code, String libelle){
		this.code = code;
		this.libelle = libelle;
	}
	
	//Accesseurs
	
	public int getCode() {
		return this.code;
	}

	public String getLibelle() {
		return this.libelle;
	}
	
	//Mutateurs
	
	public void setCode(int code) {
		this.code = code;
	}
	
	public void setLibelle(String libelle){
		this.libelle = libelle;
	}
	
	//Méthode
	
	public String toString(){
		return "Le code est : " + code + "et le libelle est : " + libelle;
	}
}
