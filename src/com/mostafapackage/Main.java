package com.mostafapackage;

import com.mostafapackage.bridge.RemoteControl;
import com.mostafapackage.bridge.SonyTv;

public class Main {

    public static void main(String[] args) {

        var remoteControl = new RemoteControl(new SonyTv());
        remoteControl.turnOff();
    }
}
