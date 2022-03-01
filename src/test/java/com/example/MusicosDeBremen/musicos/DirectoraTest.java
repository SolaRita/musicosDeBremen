package com.example.MusicosDeBremen.musicos;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class DirectoraTest {
    @Test
    void directoraOrderToSing () {
        //given


        ArrayList<Animal> coro = new ArrayList<Animal>();
        coro.add(new Asno("Burret","Rauttt"));
        coro.add(new Gata("Pepita","Remiau"));

        Directora directora = new Directora(coro);


        //then
        assertThat(coro.get(1).getSound(), equalTo("Remiau"));







    }
}



/*

    List<String> animal = new ArrayList<String>();
        animal.add(0, "Pepe");
                animal.add(1,"Antonia");
                animal.add(2, "Romeo");*/
