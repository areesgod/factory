package com.company;

abstract public class Playlist {
    String name;
    String genre;

    public String getName() {
        return name;
    }
    public void shuffle()
    {
        System.out.println("Shuffling" + name);

    }
    public void replay()
    {
        System.out.println("Replaying" + name);
    }
    public void loop()
    {
        System.out.println("Looping" + name);
    }

    @Override
    public String toString() {
        return "Playlist{" +
                "name='" + name + '\'' +
                ", genre='" + genre + '\'' +
                '}';
    }
}
