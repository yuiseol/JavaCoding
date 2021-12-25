package inheritance;

public class VIPCustomer extends Customer {

	private String agentId;
	double salesRatio;

	public VIPCustomer() {

		bonusRatio = 0.05;
		salesRatio = 0.1;
		customerGrade = "VIP";
	}

	public String getAgentId() {
		return agentId;
	}

	public void setAgentId(String agentId) {
		this.agentId = agentId;
	}

}
