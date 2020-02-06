package ru.honeybadger.spring;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestSpring {

    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
                "applicationContext.xml"
        );

//         Music music = context.getBean("rockMusic",Music.class);
//         MusicPlayer musicPlayer =new MusicPlayer(music);
////        MusicPlayer musicPlayer = context.getBean("musicPlayer",MusicPlayer.class);
//        musicPlayer.playMusic();
////
////        System.out.println("Name player: " + musicPlayer.getName());
////        System.out.println("Volume player: " + musicPlayer.getVolume());

        //MusicPlayer musicPlayer = context.getBean("musicPlayer",MusicPlayer.class);
        //musicPlayer.playMusic();

        Computer computer = context.getBean("computer",Computer.class);
        System.out.println(computer);
        context.close();

    }

}
