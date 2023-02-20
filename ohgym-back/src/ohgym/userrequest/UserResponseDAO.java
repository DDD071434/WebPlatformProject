package ohgym.userrequest;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import ohgym.dbutil.ConnectionProvider;

public class UserResponseDAO {
	// ī�װ� 
	public String categoryName(String str) {
		String sql = "SELECT exercise FROM exercise_type WHERE no = " + str;
		try (Connection conn = ConnectionProvider.getConnection();
				PreparedStatement stmt = conn.prepareStatement(sql)){
			ResultSet rs = stmt.executeQuery();
			if (rs.next()) {
				return rs.getString("exercise");
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return null;
	}
	
	// ����
	public String scoreNum(String str) {
		String sql = "SELECT avg(score) FROM comment WHERE teacher_id IN (SELECT id FROM teacher_exercise WHERE exercise_type = " + str + ")";
		try (Connection conn = ConnectionProvider.getConnection();
				PreparedStatement stmt = conn.prepareStatement(sql)){
			ResultSet rs = stmt.executeQuery();
			if (rs.next()) {
				return String.valueOf(rs.getDouble("avg(score)"));
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return null;
	}
	
	// ��û�� ��
	public String requestNum(String str) {
		String sql = "SELECT count(*) FROM request WHERE exercise_type = " + str;
		try (Connection conn = ConnectionProvider.getConnection();
				PreparedStatement stmt = conn.prepareStatement(sql)){
			ResultSet rs = stmt.executeQuery();
			if (rs.next()) {
				return String.valueOf(rs.getInt("count(*)"));
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return null;
	}
	
	// ���� ��
	public String activeNum(String str) {
		String sql = "SELECT count(*) FROM teacher_exercise WHERE exercise_type = " + str;
		try (Connection conn = ConnectionProvider.getConnection();
				PreparedStatement stmt = conn.prepareStatement(sql)){
			ResultSet rs = stmt.executeQuery();
			if (rs.next()) {
				return String.valueOf(rs.getInt("count(*)"));
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return null;
	}
	
	// ���� ��
	public String reviewNum(String str) {
		String sql = "SELECT count(*) FROM comment WHERE teacher_id IN (SELECT id FROM teacher_exercise WHERE exercise_type = " + str + ")";
		try (Connection conn = ConnectionProvider.getConnection();
				PreparedStatement stmt = conn.prepareStatement(sql)){
			ResultSet rs = stmt.executeQuery();
			if (rs.next()) {
				return String.valueOf(rs.getInt("count(*)"));
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return null;
	}
}
