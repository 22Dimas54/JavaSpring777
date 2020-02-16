package ru.honeybadger.spring;

import org.springframework.stereotype.Component;

import java.util.ArrayList;

@Component
public class PopMusic implements Music {

    private PopMusic() {
    }

    @Override
    public String getSong() {
        ArrayList<String> listSong = new ArrayList<String>();
        listSong.add("PopMusic song 1");
        listSong.add("PopMusic song 2");
        listSong.add("PopMusic song 3");
        return listSong.get((int) (Math.random() * 3));
    }

}
