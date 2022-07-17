package com.spring_example;

import com.spring_example.beans.music.*;
import com.spring_example.builders.MusicBuilder;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringApp {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("ApplicationContext.xml");
        MusicBuilder mb = context.getBean("musicBuilder", MusicBuilder.class);
        System.out.println(mb.playMusic() + "\nvolume: " + mb.getVolume());
    }
}
