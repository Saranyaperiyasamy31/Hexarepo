package com.insurance.entity;

public class Policy {
    private int policyId;
    private String policyName;
    private String type;
    private int duration;
    private double premium;

    public Policy(int policyId, String policyName, String type,double premium,double premium2) {
        this.policyId = policyId;
        this.policyName = policyName;
        this.type = type;
        this.premium = premium;
        this.duration = (int) premium2;
    }

	public int getPolicyId() {
		return policyId;
	}

	public void setPolicyId(int policyId) {
		this.policyId = policyId;
	}

	public String getPolicyName() {
		return policyName;
	}

	public void setPolicyName(String policyName) {
		this.policyName = policyName;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public int getDuration() {
		return duration;
	}

	public void setDuration(int duration) {
		this.duration = duration;
	}

	public double getPremium() {
		return premium;
	}

	public void setPremium(double premium) {
		this.premium = premium;
	}

	@Override
	public String toString() {
		return "Policy [policyId=" + policyId + ", policyName=" + policyName + ", type=" + type + ", duration="
				+ duration + ", premium=" + premium + "]";
	}
}

	