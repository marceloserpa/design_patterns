package com.mserpa.bridge.app.monster;

import com.mserpa.bridge.app.weapon.Weapon;

public abstract class Monster {

	protected Weapon weapon;

	public Monster(Weapon weapon) {
		super();
		this.weapon = weapon;
	}
	
	public abstract Integer attack(Monster target);
	
	public abstract Boolean canFly();
	
	public abstract String getMonsterName();
	
}
