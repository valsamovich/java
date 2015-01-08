package com.samovich.java.specialized.annotations.override;

public class OverrideSubClass extends OverrideSuperClass {

    @Override
    public void hello() {
        System.out.println("Hello from OverrideSubClass!");
    }
}
