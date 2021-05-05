package Entities;

public class Campaign {

	private int id;
	private String name;
	private double campaignRatio;

	public Campaign(int id, String name, double campaignRatio) {
		this.id = id;
		this.name = name;
		this.campaignRatio = campaignRatio;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getCampaignRatio() {
		return campaignRatio;
	}

	public void setCampaignRatio(double campaignRatio) {
		this.campaignRatio = campaignRatio;
	}

}
