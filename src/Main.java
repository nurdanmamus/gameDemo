import java.time.LocalDate;
import Adapters.*;
import Concrete.*;
import Entities.*;

public class Main {

	public static void main(String[] args) {

		PlayerManager playerManager = new PlayerManager(new MernisServiceAdapter());
		playerManager.add(new Player(1, "ENGÝN", "DEMÝROÐ", LocalDate.of(1985, 01, 06), "28861499108"));

		Campaign campaign1 = new Campaign(1, "Kampanya1", 30);

//		Game[] games = new Game[] { new Game(1, 123, "oyun1"), new Game(2, 123, "oyun2") };

		PurchaseOrderManager purchaseOrderManager = new PurchaseOrderManager(new Order());
		purchaseOrderManager.createPurchaseOrderWithCompaign(
				new Player(1, "ENGÝN", "DEMÝROÐ", LocalDate.of(1985, 01, 06), "28861499108"),
				new Product[] { new Game(1, "oyun1", 100.0), new Game(2, "oyun1", 200.0) }, new Campaign(1, "Kampanya1", 30));

	}

}
