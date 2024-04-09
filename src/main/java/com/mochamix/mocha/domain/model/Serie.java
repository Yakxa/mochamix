package com.mochamix.mocha.domain.model;

import jakarta.persistence.Entity;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;

@Entity(name = "tb_serie")
public class Serie extends EntertainmentItem {
    
    @ManyToOne
    @JoinColumn(name = "roulette_id")
    private Roulette roulette;

    public Roulette getRoulette() {
        return roulette;
    }

    public void setRoulette(Roulette roulette) {
        this.roulette = roulette;

    }
}
