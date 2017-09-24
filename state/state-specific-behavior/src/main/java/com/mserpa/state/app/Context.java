package com.mserpa.state.app;

public class Context {

	private LightState state;
	
	public Context() {
		state = new OnLightState();
	}
	
	public void pressButton() {
		state.turn(this);
	}
	
	public void setState(LightState newState) {
		state = newState;
	}
}
