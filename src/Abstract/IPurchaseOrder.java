package Abstract;

import Entities.*;

public interface IPurchaseOrder {

	void createPurchaseOrderWithCompaign(Player player, Product[] product, Campaign campaign);

	void createPurchaseOrder(Player player, Game[] game);
	
	void logPurchaseOrder(Order order);
	

}
