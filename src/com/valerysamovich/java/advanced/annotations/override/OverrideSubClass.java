package com.valerysamovich.java.advanced.annotations.override;

public class OverrideSubClass extends OverrideSuperClass {

    @Override
    public void hello() {
        System.out.println("Hello from OverrideSubClass!");
    }
}
