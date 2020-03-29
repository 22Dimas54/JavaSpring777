package ru.honeybadger.spring;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

//@Component
public class MusicPlayer {

    @Value("${musicPlayer.name}")
    private String name;
    @Value("${musicPlayer.volume}")
    private int volume;

    public String getName() {
        return name;
    }

    public int getVolume() {
        return volume;
    }

    private ClassicalMusic classicalMusic;
    private RockMusic rockMusic;
    private PopMusic popMusic;
    public List<List<Music>> list;

    //@Autowired
    //public MusicPlayer(ClassicalMusic classicalMusic, RockMusic rockMusic,PopMusic popMusic) {
    public MusicPlayer(List<List<Music>> list) {
        this.list = list;
//        this.classicalMusic = classicalMusic;
//        this.rockMusic = rockMusic;
//        this.popMusic = popMusic;
    }

    public void playMusic(GenerOfMusic genre) {
        Random random = new Random();

        // случайное целое число между 0 и 2
        int randomNumber = random.nextInt(3);

        if (genre == GenerOfMusic.CLASSICAL) {
            // случайная классическая песня
            System.out.println(list.get(0).get(randomNumber));
        } else if (genre == GenerOfMusic.POP) {
            // случайная поп песня
            System.out.println(list.get(1).get(randomNumber));
        }else {
            // случайная рок песня
            System.out.println(list.get(2).get(randomNumber));
        }

//        if (genre == GenerOfMusic.CLASSICAL) {
//            // случайная классическая песня
//            System.out.println(classicalMusic.getSongs().get(randomNumber));
//        } if (genre == GenerOfMusic.POP) {
//            // случайная классическая песня
//            System.out.println(popMusic.getSongs().get(randomNumber));
//        }else {
//            // случайная рок песня
//            System.out.println(rockMusic.getSongs().get(randomNumber));
//        }
    }
}
