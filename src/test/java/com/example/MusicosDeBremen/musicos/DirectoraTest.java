package com.example.MusicosDeBremen.musicos;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class DirectoraTest {
    @Test
    void directoraOrderToSing () {
        Asno asno = new Asno("Pepe","tarari",true);
        Directora directora = new Directora ();
        assertEquals("tarari", directora.StartSing());

    }
}



/*

    List<String> animal = new ArrayList<String>();
        animal.add(0, "Pepe");
                animal.add(1,"Antonia");
                animal.add(2, "Romeo");*/
