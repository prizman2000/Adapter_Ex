package com.company;

public class KotoPesAdapter extends KisoClass {
    private SobakoClass pes;

    KotoPesAdapter(SobakoClass pes) {
        this.pes = pes;
    }

    @Override
    public String saySomething() {
        return pes.getName() + " говорит МЯУ!";
    }
}
