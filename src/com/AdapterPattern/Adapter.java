package com.AdapterPattern;

public class Adapter {

    public static void main(String[] args) {

        AndroidCharger androidCharger = new AndroidCharger();
        AndroidOS androidOS = new SamsungS21();
        androidCharger.charge(androidOS);

        BlackBerryCharger blackBerryCharger = new BlackBerryCharger();
        BlackBerryOS blackBerryOS = new BBPassport();
        blackBerryCharger.charge(blackBerryOS);

        AndroidToBlackBerryAdapter adapter = new AndroidToBlackBerryAdapter(androidOS);
        blackBerryCharger.charge(adapter);

    }
}
