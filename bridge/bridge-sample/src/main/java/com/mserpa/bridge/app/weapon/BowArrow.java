package com.mserpa.bridge.app.weapon;

public class BowArrow implements Weapon{

	@Override
	public Integer power() {
		return 2;
	}

	@Override
	public Boolean reach() {
		return true;
	}

}
