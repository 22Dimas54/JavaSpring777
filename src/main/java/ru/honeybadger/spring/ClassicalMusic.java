package ru.honeybadger.spring;

import org.springframework.stereotype.Component;

import java.util.ArrayList;

@Component
public class ClassicalMusic implements Music {

    private ClassicalMusic() {
    }

    @Override
    public String getSong() {
        ArrayList<String> listSong = new ArrayList<String>();
        listSong.add("ClassicalMusic song 1");
        listSong.add("ClassicalMusic song 2");
        listSong.add("ClassicalMusic song 3");
        return listSong.get((int) (Math.random() * 3));
    }
}
