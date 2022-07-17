package com.spring_example;

import com.spring_example.beans.music.*;
import com.spring_example.builders.MusicBuilder;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringApp {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("ApplicationContext.xml");
        Music music = context.getBean("musicBean", Music.class);

        MusicBuilder mb = new MusicBuilder(music);
        System.out.println(mb.playMusic());
    }
}
