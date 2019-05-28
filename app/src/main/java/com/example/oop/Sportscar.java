package com.example.oop;

import android.util.Log;

public class Sportscar extends Car{
    public Sportscar(String color, String model, int doors, int speed) {
        super(color, model, doors, speed);
    }

    @Override
    public void hoot() {
//        super.hoot();//
        Log.d("Sportscar","Weeeeeeeeeeeeeeew!");
    }
    public void hoot(String sound){
        Log.d("Sportscar", sound);

    }
}
