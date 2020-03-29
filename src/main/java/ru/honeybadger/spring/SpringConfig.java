package ru.honeybadger.spring;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

import java.util.ArrayList;
import java.util.List;

@Configuration
//@ComponentScan("ru.honeybadger.spring")
@PropertySource("classpath:musicPlayer.properties")
public class SpringConfig {

    @Bean
    public ClassicalMusic classicalMusic(){
        return new ClassicalMusic();
    }

    @Bean
    public RockMusic rockMusic(){
        return new RockMusic();
    }

    @Bean
    public PopMusic popMusic(){
        return new PopMusic();
    }

    @Bean
    public List list(){
        List list = new ArrayList<>();
        list.add(classicalMusic().getSongs(0));
        list.add(popMusic().getSongs(0));
        list.add(rockMusic().getSongs(0));
        return list;
    }

    @Bean
    public MusicPlayer musicPlayer(List list){
        return new MusicPlayer(list());
    }
}
