package com.example.MusicosDeBremen.musicos;

public class Asno extends Animal {

    public Asno (String name, String sound) { super (name,sound);}

 @Override
    public String Lyrics () {
        if (isSinging()) {
            return "El asno está cantando " + getSound();
        }
        return "El asno " + getName() + " no está cantando";
    }

    }
