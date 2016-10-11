package com.justin;

/**
 * Created by justinwells on 10/11/16.
 */
public class Car {
    String mColor, mBrand;
    int mTopSpeed;

    public Car (String color, String brand, int speed) {
        mBrand = brand;
        mColor = color;
        mTopSpeed = speed;
    }

    public String getBrand() {
        return mBrand;
    }

    public int getTopSpeed() {
        return mTopSpeed;
    }

    public String getColor() {
        return mColor;
    }

    public void setColor (String color) {
        mColor = color;
    }

    public void setBrand (String brand) {
        mBrand = brand;
    }

    public void setTopSpeed (int speed) {
        mTopSpeed = speed;
    }

    public void go () {
        System.out.println("The " + mColor + " " + mBrand + " is accelerating!");
    }

    public void slow () {
        System.out.println("The " + mColor + " " + mBrand + " is slowing down!");
    }

    public void stop () {
        System.out.println("The " + mColor + " " + mBrand + " stopped.");
    }
}
