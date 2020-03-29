package ru.honeybadger.spring;

import java.util.ArrayList;
import java.util.List;

//@Component
public class PopMusic implements Music {
    private List<String> songs = new ArrayList<>();

    // Блок инициализации объекта (англ. Instance initialization block)
    // Выполняется каждый раз, когда создается объект класса
    {
        songs.add("Diamonds (BLAST BEAT COVER by EUGENE MAZUR)");
        songs.add("Burn");
        songs.add("All the Wiser");
    }

    @Override
    public List<String> getSongs(int i) {
        return songs;
    }
}
