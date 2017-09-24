package com.mserpa.state.app;

public class OffLightState extends LightState{

	@Override
	void turn(Context context) {
		System.out.println("Switch off to on state");
		context.setState(new OnLightState());
	}

}
