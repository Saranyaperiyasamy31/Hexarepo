package com.insurance.main;

import com.insurance.entity.Policy;

import java.util.List;

import com.insurance.dao.IPolicyDao;
import com.insurance.dao.PolicyDaoImpl;



public class MainModule {

	public static void main(String[] args) {
		Policy policy1= new Policy(101, "Senior Health Care", "Health", 9500.00,3);
		Policy policy2 = new Policy(102, "Life Saver Plan", "Life",20000.00,15);
		Policy policy3 = new Policy(103, "Motor Max Cover", "Vehicle", 7200.45,2);
		Policy policy4 = new Policy(104, "Global Travel Secure", "Travel",5000.00,1);
		Policy policy5 = new Policy(105, "Smart Home Cover", "Property",8900.25,5);
		IPolicyDao policie = new PolicyDaoImpl();

		policie.addPolicy(policy1);
		policie.addPolicy(policy2);
		policie.addPolicy(policy3);
		policie.addPolicy(policy4);
		policie.addPolicy(policy5);
		
		policie.deletePolicy(102);
		policie.deletePolicy(104);

		
		
		List<Policy> policie1 = policie.getAllPolicies(); 
        for(Policy policyn : policie1 ) {
        	System.out.println(policyn);


	}

	}}