package com.spring_example.builders;
import com.spring_example.beans.music.*;

public class MusicBuilder {
    private Music music;
    private int pos;
    private int volume;

    public MusicBuilder(Music music) {
        this.music = music;
        this.pos = 0;
        this.volume = 33;
    }

    public void setMusic(Music music) {
        this.music = music;
    }

    public void setPos(int pos) {
        this.pos = pos;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }

    public int getPos() {
        return pos;
    }

    public int getVolume() {
        return volume;
    }

    public String playMusic() {
        return music.getGenre() + ": Playing - " + music.getSongList().get(this.pos) + ".";
    }
}
