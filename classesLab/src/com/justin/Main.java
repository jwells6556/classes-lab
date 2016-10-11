package com.justin;

public class Main {

    public static void main(String[] args) {
        StopLight myLight = new StopLight("Green");
        Car myCar = new Car ("gold", "corolla", 80);

        for (int i = 0; i < 30 ; i++) {
            if (myLight.isGreen()) {
                myLight.setLightColor("yellow");
                myCar.slow();
            }
            else if (myLight.isYellow()) {
                myLight.setLightColor("red");
                myCar.stop();

            }

            else if (myLight.isRed()) {
                myLight.setLightColor("green");
                myCar.go();
            }
        }
    }
}
