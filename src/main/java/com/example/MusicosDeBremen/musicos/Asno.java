package com.example.MusicosDeBremen.musicos;

public class Asno extends Animal {

    public Asno (String name, String sound, Boolean sing) { super (name,sound,sing);}

    public String asnoLyrics () {
        if (IsSinging()) {
            return "El asno está cantando " + getSound();
        }
        return "El asno " + getName() + " no está cantando";
    }

    }
