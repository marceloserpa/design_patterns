package com.mserpa.bridge.app.monster;

import com.mserpa.bridge.app.weapon.Weapon;

public class Elf extends Monster {

	private static final Integer POWER = 1;
	private static final Boolean CAN_FLY = true;
	
	public Elf(Weapon weapon) {
		super(weapon);
	}

	@Override
	public Integer attack(Monster target) {
		System.out.println(target.getMonsterName() + " was attacked from " + getMonsterName());
		return POWER + this.weapon.power();
	}

	@Override
	public Boolean canFly() {
		return CAN_FLY;
	}

	@Override
	public String getMonsterName() {
		return "Flying elf";
	}

}
