package ru.honeybadger.spring;

import org.springframework.stereotype.Component;

@Component
public class PopMusic implements Music {
    @Override
    public String getSong() {
        return "Miyagi - Marlboro";
    }
}
