package com.State;

public class MobileContext {

    private MobileAlertState currentState;

    public MobileContext() {
        currentState = new Ringing(); // defaul state
    }

    public void setState(MobileAlertState state) {
        currentState = state;
    }

    public void alert() {
        currentState.alert();
    }

}
