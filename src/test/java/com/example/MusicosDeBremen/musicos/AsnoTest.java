package com.example.MusicosDeBremen.musicos;

import org.junit.jupiter.api.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;
import static org.junit.jupiter.api.Assertions.*;

class AsnoTest {

    @Test
    void asnoLyricsSinging() {
        Asno asno = new Asno("Pepe","tarari");
        asno.startSinging();
        assertEquals("El asno está cantando tarari", asno.Lyrics());
    }

    @Test
    void asnoLyricsQuiet(){
        Asno asno = new Asno ("Flor","silencio");
        assertEquals("El asno Flor no está cantando", asno.Lyrics());
    }

    @Test
    void asnoHasName () {
        Asno asno = new Asno ("Florecilla","silencio");
        assertThat(asno.getName(),equalTo("Florecilla"));
    }

    @Test
    void asnoHasSound(){
        Asno asno = new Asno ("Flor","sfiuuu");
        assertThat(asno.getSound(), equalTo("sfiuuu"));
    }
}