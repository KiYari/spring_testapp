package com.spring_example.beans.music;

import java.util.Arrays;
import java.util.List;

public class RockMusic implements Music{

    List<String> songList = Arrays.asList("Purple Haze", "Hotel California", "Good Vibrations", "Satisfaction");
    @Override
    public List<String> getSongList() {
        return songList;
    }

    @Override
    public String getGenre() {
        return "Rock Music";
    }
}
