package com.company;

public class PlaylistMaker {
    PlaylistFactory factory;
    public PlaylistMaker(PlaylistFactory factory)
    {this.factory = factory;}
    public Playlist playPlaylist(String type){
        Playlist playlist;
        playlist = factory.createPlaylist(type);
        playlist.shuffle();
        playlist.replay();
        playlist.loop();
        return playlist;
    }
}
