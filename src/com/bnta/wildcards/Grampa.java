package com.bnta.wildcards;

public class Grampa {
    private String name;

    public Grampa(String name) {
    }

    @Override
    public String toString() {
        return getClass().getSimpleName() + "{" +
                "name='" + name + '\'' +
                '}';
    }

}
