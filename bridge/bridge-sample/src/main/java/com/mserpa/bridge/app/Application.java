package com.mserpa.bridge.app;

import com.mserpa.bridge.app.monster.Elf;
import com.mserpa.bridge.app.monster.Monster;
import com.mserpa.bridge.app.monster.Ogre;
import com.mserpa.bridge.app.weapon.BigAxe;
import com.mserpa.bridge.app.weapon.BowArrow;

public class Application {

	public static void main(String[] args) {
		
		Monster ogreWithAxe = new Ogre(new BigAxe());
		Monster ogreWithBow = new Ogre(new BowArrow());
		Monster elfWithAxe = new Elf(new BigAxe());
		Monster elfWithBow = new Elf(new BowArrow());
		
		System.out.println("Damage: " + ogreWithAxe.attack(elfWithAxe) + "\n");
		
		System.out.println("Damage: " + ogreWithBow.attack(elfWithBow)+"\n");
		
		System.out.println("Damage: " + elfWithAxe.attack(elfWithBow) + "\n");
				
		
	}
	
}
