package com.company;

public class PlaylistFactory {
    public Playlist createPlaylist(String type){
        Playlist playlist = null;
        if(type.equals("Jazz")){
            playlist = new JazzPlaylist();
        }
        else if(type.equals("Mac Miller")){
            playlist = new MacMillerPlaylist();
        }
        return playlist;
    }
}
