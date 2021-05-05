package Concrete;

import Abstract.*;
import Entities.*;

public class PlayerManager implements IPlayerService {

	IPlayerCheckService playerCheckService;

	public PlayerManager(IPlayerCheckService playerCheckService) {
		this.playerCheckService = playerCheckService;
	}

	@Override
	public void add(Player player) {
		if (this.playerCheckService.CheckIfRealPerson(player)) {
			System.out.println("Kullanýcý kaydedildi");
			
		}else {
			System.out.println("Geçerli bir kullanýcý giriniz.");
		}

	}

	@Override
	public void update(Player player) {
		System.out.println("Kullanýcý bilgileri güncellendi.");

	}

	@Override
	public void delete(Player player) {
		System.out.println("Kullanýcý silindi.");

	}

}
