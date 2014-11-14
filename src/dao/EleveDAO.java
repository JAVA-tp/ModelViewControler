package dao;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import classes.Division;
import dao.DivisionDAO;
import classes.Eleve;
import dao.DAO;

public class EleveDAO extends DAO<Eleve> {
	private DAO<Division> division = new DivisionDAO();

	public Eleve create(Eleve obj) {
		try {
			PreparedStatement prepare = this.connect
					.prepareStatement("INSERT INTO \"mvc\".Eleve VALUES(?, ?, ?, ?, ?)");
			prepare.setInt(1, obj.getCode());
			prepare.setString(2, obj.getNom());
			prepare.setString(3, obj.getPrenom());
			prepare.setString(4, obj.getDateNaiss());
			prepare.setInt(5, obj.getDivision().getCode());
			prepare.executeUpdate();
			obj = this.read(obj.getCode());
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return obj;
	}

	public Eleve read(int code) {
		Eleve lEleve = new Eleve();
		try {
			ResultSet result = this.connect.createStatement(
					ResultSet.TYPE_SCROLL_INSENSITIVE,
					ResultSet.CONCUR_UPDATABLE).executeQuery(
					"SELECT * FROM \"mvc\".Eleve WHERE code = '" + code + "'");
			if (result.first())
				lEleve = new Eleve(code, result.getString("nom"),
						result.getString("prenom"),
						result.getString("datenaiss"), division.read(result
								.getInt("division")));
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return lEleve;
	}

	public Eleve update(Eleve obj) {
		try {
			this.connect.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE,
					ResultSet.CONCUR_UPDATABLE).executeUpdate(
					"UPDATE \"mvc\".Eleve SET nom = '" + obj.getNom()
							+ "', SET prenom = '" + obj.getPrenom()
							+ "', SET datenaiss = '" + obj.getDateNaiss()
							+ "', SET division = '" + obj.getDivision()
							+ "' WHERE code = '" + obj.getCode() + "'");
			obj = this.read(obj.getCode());
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return obj;
	}

	public void delete(Eleve obj) {
		try {
			this.connect.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE,
					ResultSet.CONCUR_UPDATABLE).executeUpdate(
					"DELETE FROM \"mvc\".Eleve WHERE code = '" + obj.getCode()
							+ "'");
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
}