package com.example.MusicosDeBremen.musicos;

abstract public class Animal {
    private String name;
    private String sound;
    private Boolean sing;

    public Animal(String name, String sound, Boolean sing) {
        this.name = name;
        this.sound = sound;
        this.sing = sing;
    }

    public String getName() {
        return this.name;
    }

    public String getSound() {
        return this.sound;
    }

    public boolean gataIsSinging() {
        return this.sing;
    }

}
