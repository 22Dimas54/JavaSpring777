package ru.honeybadger.spring;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class MusicPlayer {

    @Autowired
    @Qualifier("classicalMusic")
    private Music classicalMusic;

    @Autowired
    @Qualifier("rockMusic")
    private Music rockMusic;

    @Autowired
    @Qualifier("popMusic")
    private Music popMusic;

    public String playMusic(GenerOfMusic generOfMusic) {
        if (generOfMusic == GenerOfMusic.CLASSICAL) {
            return "Playing: " + classicalMusic.getSong();
        } else if (generOfMusic == GenerOfMusic.ROCK) {
            return "Playing: " + rockMusic.getSong();
        } else {
            return "Playing: " + popMusic.getSong();
        }
    }
}
