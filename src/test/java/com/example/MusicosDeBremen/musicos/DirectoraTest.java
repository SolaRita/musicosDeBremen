package com.example.MusicosDeBremen.musicos;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class DirectoraTest {
    @Test
    void directoraOrderToSing () {
        //given
        Directora directora = new Directora();

        ArrayList<Animal> coro = new ArrayList<Animal>();

        coro.add(new Asno("Burret","Rauttt"));
        coro.add(new Gata("Pepita","Remiau"));

        //then
        assertEquals(directora.allAnimalsSing(),"Rauttt");
        assertEquals(directora.allAnimalsSing(),"Remiau");






    }
}



/*

    List<String> animal = new ArrayList<String>();
        animal.add(0, "Pepe");
                animal.add(1,"Antonia");
                animal.add(2, "Romeo");*/
