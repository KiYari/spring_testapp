package com.spring_example.beans.music;

import java.util.Arrays;
import java.util.List;

public class ClassicalMusic implements Music{

    List<String> songList = Arrays.asList("Suite No. 1 in G major for unaccompanied cello, BWV 1007", "Symphony No. 5 in C Minor, Op. 67",
            "Du bist die Ruh", "Piano Quartet No. 1, Op. 25");
    @Override
    public List<String> getSongList() {
        return songList;
    }

    @Override
    public String getGenre() {
        return "Classical Music";
    }
}
