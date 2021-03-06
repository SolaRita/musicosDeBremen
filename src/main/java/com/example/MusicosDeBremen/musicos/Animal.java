package com.example.MusicosDeBremen.musicos;

abstract public class Animal implements Singers  {
// atributos en private
    private String name;
    private String sound;
    private Boolean isSinging = false;

    //constructor en Public
    public Animal(String name, String sound) {
        this.name = name;
        this.sound = sound;

    }
    //getter y setters en Public
    public String getName() {
        return this.name;
    }

    public String getSound() {
        return this.sound;
    }


    //funciones en protected

    public Boolean isSinging() {
        return isSinging;
    }


    public void startSinging() {
        this.isSinging = true;
    }


    public void stopSinging() {
        this.isSinging = false;
    }

    public String Lyrics () {
        if (isSinging) {
            return "El animal está cantando " + getSound();
        }
        return "El animal " + getName() + " no está cantando";
    }


}
