import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;
import java.util.Scanner;

public class Playlist {
    private ArrayList<String> songs; // A list of song names
    private Random random = new Random(); // For shuffling songs

    public Playlist() {
        songs = new ArrayList<>(); //List of available songs to start with
        songs.add("Runway");
        songs.add("On The Radar");
        songs.add("Hey Jane");
        songs.add("American Wedding");
        songs.add("Swim Good");
        songs.add("Add Up My Love");
    }

    //adds a song to the playlist
    public void addSong(String song) {
        songs.add(song);
        System.out.println(song + " was added to playlist");
    }

    //removes a song from the playlist
    public void removeSong(String song) {
        songs.remove(song);
        System.out.println(song + " was removed from playlist");
    }

    //plays a song and displays it
    public void playSong() {
        if (!songs.isEmpty()) {
            String currentSong = songs.removeLast();
            System.out.println("Now playing: " + currentSong);
        } else {
            System.out.println("Playlist empty");
        }
    }

    //skips one song and plays the next one
    public void skipSong() {
        if (!songs.isEmpty()) {
            songs.removeLast();
            System.out.println("Next song: " + songs.getLast()); // Assuming next song to be the last remaining
        } else {
            System.out.println("Playlist empty");
        }
    }

    //sorts the songs
    public void sortSongs() {
        Collections.sort(songs);
        System.out.println("Songs sorted: ");
        for (String song : songs) {
            System.out.println(song);
        }
    }

    //shuffles available songs left in playlist, excluding ones already played
    public void shuffleSongs() {
        Collections.shuffle(songs);
        System.out.println("Songs shuffled: ");
        for (String song : songs) {
            System.out.println(song);
        }
    }

    //finds the song and prints what index it is located at
    public int findSong(String song) {
        int index = songs.indexOf(song);
        if (index != -1) {
            System.out.println("Song found at: " + index);
        } else {
            System.out.println("Song not found");
        }
        return index;
    }

    public void exit() {
        System.out.println("Closing Playlist. . .");
        System.exit(0); // closes the program
    }
}
