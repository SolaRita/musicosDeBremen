package com.example.MusicosDeBremen.musicos;

import java.util.ArrayList;

public class Directora {
    ArrayList<Animal> coro = new ArrayList();
    public Directora(ArrayList<Animal>coro) {
        this.coro = coro;
    }

    public void allAnimalsSing() {
    for (Animal animal : coro) {
        animal.startSinging();
        animal.isSinging();

        }
    }
}
