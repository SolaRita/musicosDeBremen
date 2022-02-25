package com.example.MusicosDeBremen.musicos;

import org.junit.jupiter.api.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;
import static org.junit.jupiter.api.Assertions.*;

class AsnoTest {

    @Test
    void asnoLyricsSinging() {
        Asno asno = new Asno("Pepe","tarari",true);
        assertEquals("El asno está cantando tarari", asno.Lyrics());
    }

    @Test
    void asnoLyricsQuiet(){
        Asno asno = new Asno ("Flor","silencio",false);
        assertEquals("El asno Flor no está cantando", asno.asnoLyrics());
    }

    @Test
    void asnoHasName () {
        Asno asno = new Asno ("Florecilla","silencio",false);
        assertThat(asno.getName(),equalTo("Florecilla"));
    }

    @Test
    void asnoHasSound(){
        Asno asno = new Asno ("Flor","sfiuuu",false);
        assertThat(asno.getSound(), equalTo("sfiuuu"));
    }
}