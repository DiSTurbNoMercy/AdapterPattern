package com.AdapterPattern;

public class AndroidToBlackBerryAdapter implements BlackBerryOS {

    AndroidOS androidOS;

    public AndroidToBlackBerryAdapter(AndroidOS androidOS) {
        this.androidOS = androidOS;
    }

    public void charge(){
        androidOS.charge();
    }
}
