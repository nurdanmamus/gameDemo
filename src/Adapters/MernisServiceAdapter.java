package Adapters;

import Abstract.*;
import Entities.*;
import tr.gov.nvi.tckimlik.WS.*;

public class MernisServiceAdapter implements IPlayerCheckService{

	@Override
	public boolean CheckIfRealPerson(Player player) {
		
          KPSPublicSoap client = new KPSPublicSoapProxy();
		
		try {
			boolean result = client.TCKimlikNoDogrula(Long.parseLong(player.getNationalityId()), player.getFirstName().toUpperCase(),
					player.getLastName().toUpperCase(), player.getDateOfBirth().getYear());
			return result;
			
		} catch (Exception e) {
			e.toString();
			return false;
		}
	}

}
