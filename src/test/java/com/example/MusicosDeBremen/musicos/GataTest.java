package com.example.MusicosDeBremen.musicos;
import org.junit.jupiter.api.Test;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.junit.jupiter.api.Assertions.*;
import static org.hamcrest.Matchers.equalTo;

class GataTest {
    @Test
    void gataHasName () {
        Gata gata = new Gata("Michi", "Brrrr",false);
        assertThat(gata.getName(),equalTo("Michi"));
    }

    @Test
    void gataHasSound(){
        Gata gata = new Gata("Doraemon","MiauMiau",true);
        assertThat(gata.getSound(), equalTo("MiauMiau"));
    }

   /* @Test
    void catCanSing() {
        Gata gata = new Gata ("Cantarino","Marramiau",false);
        assertTrue(gata.gataIsSinging());
    }*/

    @Test
    void catCanSinging() {
        Gata gata = new Gata ("Lola", "Flups", true);
        assertEquals(true, gata.IsSinging());
    }

    @Test
    void catLyricsSinging() {
        Gata gata = new Gata("Flor", "oleole",true);
        assertEquals("La gata está cantando oleole", gata.gataLyrics());
    }

    @Test
    void catLyricsQuiet() {
        Gata gata = new Gata("Dog", "Ruf",false);
        assertEquals("La gata Dog no esta cantando", gata.gataLyrics());
    }

}