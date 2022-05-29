package com.model;

public class ATMMachine {
    private String kodeATM;
    private double cash;
    private ActiveEnum status;

    void insertCard(){};

    boolean validatePIN(){return true;};

    double cekSaldo(){return 0;}

    // ga tau void
    double withdrawal(){return 0;}

    // ga tau void
    double transfer(){return 0;}

    void ejectCard(){};


    public ATMMachine(String kodeATM, double cash, ActiveEnum status) {
        this.kodeATM = kodeATM;
        this.cash = cash;
        this.status = status;
    }

    public String getKodeATM() {
        return kodeATM;
    }

    public void setKodeATM(String kodeATM) {
        this.kodeATM = kodeATM;
    }

    public double getCash() {
        return cash;
    }

    public void setCash(double cash) {
        this.cash = cash;
    }

    public ActiveEnum getStatus() {
        return status;
    }

    public void setStatus(ActiveEnum status) {
        this.status = status;
    }
}
