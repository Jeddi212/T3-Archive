package com.Adapter;

import com.Adapter.AnotherClass.PilotPen;

public class School {

    public static void main(String[] args) {

//        PilotPen pp = new PilotPen();

        Pen p = new PenAdapter();

        Assignment aw = new Assignment();
        aw.setP(p);
        aw.writeAssignment("I'm a bit tired !");

    }

}
