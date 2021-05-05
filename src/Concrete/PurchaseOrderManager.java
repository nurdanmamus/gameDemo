package Concrete;

import Abstract.*;
import Entities.*;

public class PurchaseOrderManager implements IPurchaseOrder {

	Order order;

	public PurchaseOrderManager(Order order) {
		this.order = order;
	}

	@Override
	public void createPurchaseOrderWithCompaign(Player player, Product[] products, Campaign campaign) {
		double price = 0;
		
		for (Product product : products) {
			price = price + (product.getPrice() - (product.getPrice() * campaign.getCampaignRatio() / 100));
		}
		
		order.setPrice(price);
		order.setProduct(products);
		order.setCustomerid(player.getId());
		
		System.out.println("Sipariþ baþarýyla oluþturulmuþtur.");
		this.logPurchaseOrder(order);
		
	}

	@Override
	public void createPurchaseOrder(Player player, Game[] games) {

		double price = 0;

		for (Game game : games) {
			price = price + (game.getPrice());
		}

		order.setPrice(price);
		order.setProduct(games);
		order.setCustomerid(player.getId());
		
		System.out.println("Sipariþ baþarýyla oluþturulmuþtur.");
		
		this.logPurchaseOrder(order);

	}

	@Override
	public void logPurchaseOrder(Order order) {
		
		System.out.println("Sipariþ veritabanýna kaydedilmiþtir.");
		
	}


}
