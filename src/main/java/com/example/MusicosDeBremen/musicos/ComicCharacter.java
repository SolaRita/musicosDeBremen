package com.example.MusicosDeBremen.musicos;

public class ComicCharacter implements Singers {

    private String name;
    private String sound;
    private Boolean isSinging = false;

    public ComicCharacter(String name, String sound) {
        this.name = name;
        this.sound = sound;

    }

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
            return "El personaje está cantando " + this.sound;
        }
        return "El animal " + this.name + " no está cantando";
    }

    public String getSound() {
        return this.sound;
    }

}
