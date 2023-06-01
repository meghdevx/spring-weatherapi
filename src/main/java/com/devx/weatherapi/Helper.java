package com.devx.weatherapi;

public class Helper {
    public static int getRandomMinMax(int min, int max){
        return (int) (Math.random() * (max - min) + min);
    }
}
