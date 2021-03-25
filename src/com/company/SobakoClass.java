package com.company;

public class SobakoClass {
    private String name;

    public SobakoClass(String name){
        this.name = name;
    }

    public String getName(){
        return this.name;
    }

    public String saySomething(){
        return this.name + " говорит ГАВ!";
    }
}