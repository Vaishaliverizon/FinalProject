package org.verizon.CSP_B1Api.model;

public class Servicemodel {
	private int planid;
	private String provision;
	private String test_qos;
	private String activity;
	
	public Servicemodel() {
		super();
	}
	
	public int getPlanid() {
		return planid;
	}
	
	public void setPlanid(int planid) {
		this.planid = planid;
	}

	public String getProvision() {
		return provision;
	}

	public void setProvision(String provision) {
		this.provision = provision;
	}

	public String getTest_qos() {
		return test_qos;
	}

	public void setTest_qos(String test_qos) {
		this.test_qos = test_qos;
	}

	public String getActivity() {
		return activity;
	}

	public void setActivity(String activity) {
		this.activity = activity;
	}

}
