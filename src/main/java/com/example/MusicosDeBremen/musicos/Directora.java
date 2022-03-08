package com.example.MusicosDeBremen.musicos;

import java.util.ArrayList;

public class Directora {
    ArrayList<Singers> coro = new ArrayList();
    public Directora(ArrayList<Singers>coro) {
        this.coro = coro;
    }

    public void allSing() {
    for (Singers singer : coro) {
        singer.startSinging();
        singer.isSinging();
        }
    }

    public void allStopSinging() {
        for (Singers singer : coro) {
            singer.stopSinging();
            singer.isSinging();
        }
    }
}
