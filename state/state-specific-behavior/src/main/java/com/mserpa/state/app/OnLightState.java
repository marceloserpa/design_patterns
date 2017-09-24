package com.mserpa.state.app;

public class OnLightState extends LightState{

	@Override
	void turn(Context context) {
		System.out.println("Switch on to off state");
		context.setState(new OffLightState());
	}

}
