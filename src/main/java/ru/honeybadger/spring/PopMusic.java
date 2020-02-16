package ru.honeybadger.spring;

import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
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
    public List<String> getSongs() {
        return songs;
    }
}
