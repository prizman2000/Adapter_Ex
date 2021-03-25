package com.company;

public class Main {

    public static void main(String[] args) {

        ShelterForCats shelter = new ShelterForCats();
        KisoClass kisa = new KisoClass("Мурзик");
        System.out.println(kisa.saySomething());

        if(shelter.securityAccess(kisa)){
            System.out.println(kisa.saySomething() + " Допуск получен!");
        }

        SobakoClass pes = new SobakoClass("Шарик");
        System.out.println(pes.saySomething());

        //shelter.securityAccess(pes);

        KotoPesAdapter kotoPes = new KotoPesAdapter(pes);

        if(shelter.securityAccess(kotoPes)){
            System.out.println(kotoPes.saySomething() + " Допуск получен!");
        }
    }
}
