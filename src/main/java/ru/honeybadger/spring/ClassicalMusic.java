package ru.honeybadger.spring;

import java.util.ArrayList;
import java.util.List;

//@Component
//@Scope("prototype")
public class ClassicalMusic implements Music {

    private List<String> songs = new ArrayList<>();
//    @PostConstruct
//    public void doMyInit(){
//        System.out.println("Doing my initialization");
//    }
//
//    @PreDestroy
//    public void doMyDestroy(){
//        System.out.println("Doing my destruction");
//    }
    // Блок инициализации объекта (англ. Instance initialization block)
    // Выполняется каждый раз, когда создается объект класса
    {
        songs.add("Hungarian Rhapsody");
        songs.add("Symphony no. 5 in C Minor, op. 67");
        songs.add("Night on Bald Mountain");
    }

    @Override
    public List<String> getSongs(int i) {
        return songs;
    }
}
