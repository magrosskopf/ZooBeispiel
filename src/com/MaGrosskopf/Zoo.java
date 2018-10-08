package com.MaGrosskopf;

public class Zoo {

    public Zoo(){
        System.out.println(((System.currentTimeMillis()/1000/60/60)%24+2) + ":" + ((System.currentTimeMillis()/1000/60)%60));
    }

}
