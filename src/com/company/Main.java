package com.company;

public class Main {

    public static void main(String[] args) {
	PlaylistFactory factory = new PlaylistFactory();
	PlaylistMaker order = new PlaylistMaker(factory);
	Playlist playlist = order.playPlaylist("Jazz");
        System.out.println(playlist.getName());
    }
}
