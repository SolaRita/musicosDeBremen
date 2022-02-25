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

    public boolean IsSinging() {
        return this.sing;
    }


    public String Lyrics () {
        if (IsSinging()) {
            return "El animal está cantando " + getSound();
        }
        return "El animal " + getName() + " no está cantando";
    }

}
