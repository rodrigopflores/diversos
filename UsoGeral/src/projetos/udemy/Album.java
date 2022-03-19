package projetos.udemy;

import java.util.ArrayList;
import java.util.LinkedList;

public class Album {

    private String name;
    private String artist;
    private ArrayList<Song> songs;

    public Album(String name, String artist) {
        this.name = name;
        this.artist = artist;
        this.songs = new ArrayList<>();
    }

    public boolean addSong(String title, double duration) {
        if (findSong(title) != null) return false;
        songs.add(new Song(title, duration));
        return true;
    }

    private Song findSong(String name) {
        if(!songs.isEmpty()) {
            for (int i = 0; i < songs.size(); i++) {
                Song song = songs.get(i);
                if (song.getTitle().equals(name)) return song;
            }
        }
        return null;
    }

    public boolean addToPlayList(int trackNumber, LinkedList<Song> playList) {
        if (trackNumber <= 0 || trackNumber> (songs.size())) return false;

        playList.add(songs.get(trackNumber - 1));
        return true;
    }

    public boolean addToPlayList(String title, LinkedList<Song> playList) {
        Song song = findSong(title);
        if (song == null) return false;
        playList.add(song);
        return true;
    }
}
