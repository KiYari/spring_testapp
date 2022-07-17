package com.spring_example.builders;
import com.spring_example.beans.music.*;

public class MusicBuilder {
    private Music music;

    public MusicBuilder(Music music) {
        this.music = music;
    }

    public String playMusic() {
        return music.getGenre() + ": Playing - " + music.getSongList().get(0) + ".";
    }
}
