package com.valerysamovich.java.annotations.override;

public class OverrideSubClass extends OverrideSuperClass {

    @Override
    public void hello() {
        System.out.println("Hello from OverrideSubClass!");
    }
}
