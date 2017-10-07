package com.mserpa.bridge.app.weapon;

public class BigAxe implements Weapon{

	@Override
	public Integer power() {
		return 6;
	}

	@Override
	public Boolean reach() {
		return false;
	}

}
