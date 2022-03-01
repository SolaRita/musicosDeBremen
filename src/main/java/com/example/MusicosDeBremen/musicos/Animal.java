package com.example.MusicosDeBremen.musicos;

abstract public class Animal  {
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

    protected Boolean isSinging() {
        return isSinging;
    }


    protected void startSinging() {
        this.isSinging = true;
    }


    protected void stopSinging() {
        this.isSinging = false;
    }

    protected String Lyrics () {
        if (isSinging) {
            return "El animal está cantando " + getSound();
        }
        return "El animal " + getName() + " no está cantando";
    }

}
