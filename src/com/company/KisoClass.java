package com.company;

public class KisoClass {
    private String name;

    public KisoClass(){}

    public KisoClass(String name){
        this.name = name;
    }

    public String getName(){
        return this.name;
    }

    public String saySomething(){
        return this.name + " говорит МЯУ!";
    }
}