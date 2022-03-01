package com.example.MusicosDeBremen.musicos;

public class Gata extends Animal {

    public Gata(String name, String sound) {
        super(name, sound);
    }

@Override
    public String Lyrics (){
        if (isSinging()) {
            return "La gata está cantando "+getSound();
        }
            return "La gata " +getName()+" no esta cantando";


    }

    //aparece un director que que les dice como y cuando cantar a una lista concreta de animales.
    //(la classe abstaracta la tratamos como un intefaz).
    //(le pasaremos una list<animals>)




}
