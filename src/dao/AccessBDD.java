package dao;

public class AccessBDD {
	private String user = "t.dabre";
	private String password = "pass123";
	
	public AccessBDD(){
		this.user = "NULL";
		this.password = "NULL";
	}
	
	public AccessBDD(String user, String password){
		this.user = user;
		this.password = password;
	}

	public String getUser() {
		return this.user;
	}
	
	public String getPass() {
		return this.password;
	}

}
