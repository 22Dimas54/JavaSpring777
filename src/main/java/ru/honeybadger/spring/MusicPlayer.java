package ru.honeybadger.spring;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;
@Component
public class MusicPlayer {
    private ClassicalMusic classicalMusic;
    private RockMusic rockMusic;
    private PopMusic popMusic;

    @Autowired
    public MusicPlayer(ClassicalMusic classicalMusic, RockMusic rockMusic, PopMusic popMusic) {
        this.classicalMusic = classicalMusic;
        this.rockMusic = rockMusic;
        this.popMusic = popMusic;
    }

    public String playMusic() {
        return "Playing: " + classicalMusic.getSong()+" Playing: " + popMusic.getSong()+" Playing: " + rockMusic.getSong();
    }

//    public void playMusic() {
//        System.out.println("Playing: " + classicalMusic.getSong());
//        System.out.println("Playing: " + popMusic.getSong());
//        System.out.println("Playing: " + rockMusic.getSong());
//    }
    //    @Autowired
//    private Music music;
    //private ClassicalMusic classicalMusic;
    //private List<Music> musicList = new ArrayList<>();

//    public List<Music> getMusicList() {
//        return musicList;
//    }
//
//    public void setMusicList(List<Music> musicList) {
//        this.musicList = musicList;
//    }

//    private String name;
//    private int volume;
//
//    public String getName() {
//        return name;
//    }
//
//    public void setName(String name) {
//        this.name = name;
//    }
//
//    public int getVolume() {
//        return volume;
//    }
//
//    public void setVolume(int volume) {
//        this.volume = volume;
//    }
//@Autowired
//    public void setMusic(Music music) {
//        this.music = music;
//    }
//
//    //Ioc
//    public MusicPlayer() {
//    }
//
//
//    public MusicPlayer(Music music) {
//        this.music = music;
//    }
//    public void playMusic() {
//        System.out.println("Playing: " + music.getSong());
//    }

//    public void playMusic() {
////        for (Music music : musicList) {
////            System.out.println("Playing: " + music.getSong());
////        }
//
//        System.out.println("Playing: " + music.getSong());
//    }
}
