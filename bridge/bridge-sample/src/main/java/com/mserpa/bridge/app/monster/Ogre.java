package com.mserpa.bridge.app.monster;

import com.mserpa.bridge.app.weapon.Weapon;

public class Ogre extends Monster {
	
	private static final Integer POWER = 3;
	private static final Boolean CAN_FLY = false;

	public Ogre(Weapon weapon) {
		super(weapon);
	}

	@Override
	public Integer attack(Monster target) {
		if(target.canFly() && weapon.reach() == false) {
			System.out.println(target.getMonsterName() + " deviated from the attack");
			return 0;
		}
		System.out.println(target.getMonsterName() + " was attacked from " + getMonsterName());
		return POWER + weapon.power();
	}

	@Override
	public Boolean canFly() {
		return false;
	}

	@Override
	public String getMonsterName() {
		return "Ogre";
	}

}
