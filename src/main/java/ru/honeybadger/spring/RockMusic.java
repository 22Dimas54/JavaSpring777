package ru.honeybadger.spring;

import org.springframework.stereotype.Component;

import java.util.ArrayList;

@Component
public class RockMusic implements Music {

    private RockMusic() {
    }

    @Override
    public String getSong() {
        ArrayList<String> listSong = new ArrayList<String>();
        listSong.add("RockMusic song 1");
        listSong.add("RockMusic song 2");
        listSong.add("RockMusic song 3");
        return listSong.get((int) (Math.random() * 3));
    }

}
