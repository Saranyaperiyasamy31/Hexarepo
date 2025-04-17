package com.insurance.dao;

import java.util.List;

import com.insurance.entity.Policy;

public interface IPolicyDao {
    boolean addPolicy(Policy policy);
    void deletePolicy(int policyId);
    List<Policy> getAllPolicies();
}


