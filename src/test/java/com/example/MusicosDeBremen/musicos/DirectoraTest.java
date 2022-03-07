package com.example.MusicosDeBremen.musicos;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class DirectoraTest {
    @Test
    void directoraOrderToSing() {
        //given
        ArrayList<Animal> coro = new ArrayList<>();
        coro.add(new Asno("Burret", "Rauttt"));
        coro.add(new Gata("Pepita", "Remiau"));
        //when
        Directora directora = new Directora(coro);
        directora.allAnimalsSing();
        //then
        assertThat(coro.get(1).getSound(), equalTo("Remiau"));
        assertTrue(coro.get(0).isSinging());
    }

    @Test
    void whatLyricsAreAnimalsSinging() {
        ArrayList<Animal> coro = new ArrayList<>();
        coro.add(new Asno("Burret", "Rauttt"));
        coro.add(new Gata("Pepita", "Remiau"));
        //when
        Directora directora = new Directora(coro);
        directora.allAnimalsSing();
        //then
        assertThat(coro.get(0).Lyrics(), equalTo("El asno está cantando Rauttt"));
    }

    @Test
    void directoraMakeAnimalsStopSinging() {
        ArrayList<Animal> coro = new ArrayList<>();
        coro.add(new Asno("Burret", "Rauttt"));
        coro.add(new Gata("Pepita", "Remiau"));
        //when
        Directora directora = new Directora(coro);
        directora.allAnimalsSing();
        directora.allAnimalsStopSinging();
        assertFalse(coro.get(0).isSinging());

    }

    @Test
    void whenChoreIsNotSingingDoTheySaySomething() {
        ArrayList<Animal> coro = new ArrayList<>();
        coro.add(new Asno("Burret", "Rauttt"));
        coro.add(new Gata("Pepita", "Remiau"));
        //when
        Directora directora = new Directora(coro);
        directora.allAnimalsStopSinging();
        assertThat(coro.get(0).Lyrics(), equalTo("El asno Burret no está cantando"));


    }

}




/*

    List<String> animal = new ArrayList<String>();
        animal.add(0, "Pepe");
                animal.add(1,"Antonia");
                animal.add(2, "Romeo");*/
