package com.justin;

/**
 * Created by justinwells on 10/11/16.
 */
public class StopLight {
    private String mLightColor;

    public StopLight (String lightColor) {
        mLightColor = lightColor;
    }

    public boolean isGreen () {
        return mLightColor.equals("Green");
    }

    public boolean isYellow () {
        return mLightColor.equals("Yellow");
    }

    public boolean isRed () {
        return mLightColor.equals("Red");
    }

    public void setLightColor (String lightColor) {
        if (lightColor.equalsIgnoreCase("green")) {
            mLightColor = "Green";
        } else

        if (lightColor.equalsIgnoreCase("red")) {
            mLightColor = "Red";
        } else

        if (lightColor.equalsIgnoreCase("yellow")) {
            mLightColor = "Yellow";
        }

        else {
            System.out.println("Invalid Color");

        }

        System.out.println("The light is now " + mLightColor);
    }


}
