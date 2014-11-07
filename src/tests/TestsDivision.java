package tests;

import classes.Division;

public class TestsDivision {
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Division maDivision = new Division();
		
		System.out.println("le code est : " + maDivision.getCode());
		System.out.println("le libelle est : " + maDivision.getLibelle());
		System.out.println(maDivision.toString());
		maDivision.setCode(12);
		System.out.println("le code est : " + maDivision.getCode());
		maDivision.setLibelle("test");
		System.out.println("le libelle est : " + maDivision.getLibelle());
		System.out.print(maDivision.toString());

	}

}
