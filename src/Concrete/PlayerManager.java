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
			System.out.println("Kullan�c� kaydedildi");
			
		}else {
			System.out.println("Ge�erli bir kullan�c� giriniz.");
		}

	}

	@Override
	public void update(Player player) {
		System.out.println("Kullan�c� bilgileri g�ncellendi.");

	}

	@Override
	public void delete(Player player) {
		System.out.println("Kullan�c� silindi.");

	}

}
