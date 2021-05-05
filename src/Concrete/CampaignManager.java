package Concrete;

import Abstract.*;

public class CampaignManager implements ICampaignService {

	@Override
	public void add() {
		System.out.println("Kampanya eklendi.");

	}

	@Override
	public void update() {
		System.out.println("Kampanya güncellendi.");

	}

	@Override
	public void delete() {
		System.out.println("Kampanya silindi.");

	}

}
