package com.spring_example.beans.music;

import java.util.Arrays;
import java.util.List;

public class KpopMusic implements Music{

    List<String> songList = Arrays.asList("Gangnam Stryle", "DDU-Du-DDU-Du", "Dynamite", "Boy with luv");
    @Override
    public List<String> getSongList() {
        return songList;
    }

    @Override
    public String getGenre() {
        return "K-Pop Music";
    }
}
