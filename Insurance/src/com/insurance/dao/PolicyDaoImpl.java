package com.insurance.dao;

import com.insurance.entity.Policy;
import com.insurance.util.DBConnectionUtil;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class PolicyDaoImpl implements IPolicyDao {

	Connection connection;

	public boolean addPolicy(Policy policy) {
	    String insertQuery = "INSERT INTO policy (policy_id, policy_name, type, premium,duration) VALUES (?, ?, ?,?, ?)";

	    try (Connection conn = DBConnectionUtil.getConnection();
	         PreparedStatement ps = conn.prepareStatement(insertQuery)) {

	        ps.setInt(1, policy.getPolicyId());
	        ps.setString(2, policy.getPolicyName());
	        ps.setString(3, policy.getType());
	        ps.setDouble(4, policy.getPremium());
	        ps.setInt(5, policy.getDuration());

	        int rowsAffected = ps.executeUpdate();
	        return rowsAffected > 0;

	    } catch (SQLException e) {
	        System.out.println("Error inserting policy: " + e.getMessage());
	    }

	    return false;
	}


	public void updatePolicy(int policyId, double premium) {

	}

	public void deletePolicy(int policyId) {
		connection = DBConnectionUtil.getConnection();
		String sql = "delete from policy where policy_id = ?";
		PreparedStatement statement = null;
		try {
			statement = connection.prepareStatement(sql);
			statement.setInt(1, policyId);
			statement.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				statement.close();
				connection.close();
			} catch (SQLException e) {

			}
		}
		return;
	}

	public Policy getById(int policyId) {
		return null;
	}

	public List<Policy> getAllPolicies() {

		connection = DBConnectionUtil.getConnection();
		String sql = "select * from policy";

		List<Policy> list = new ArrayList<>();

		PreparedStatement statement = null;
		try {
			statement = connection.prepareStatement(sql);
			ResultSet rs = statement.executeQuery();
			while (rs.next()) {
				int policyId = rs.getInt("policy_id");
				String policyName = rs.getString("policy_name");
				String type = rs.getString("type");
				int duration = rs.getInt("duration");
				double premium = rs.getDouble("premium");

				Policy policy = new Policy(policyId, policyName, type, duration, premium);
				System.out.println(policy);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return list;
	}

	public Policy getPolicy(int policyId) {
		// TODO Auto-generated method stub
		return null;
	}

}