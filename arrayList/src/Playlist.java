import java.util.Arraylist;
import java.util.Collections;
import java.util.Random;

public class Playlist {
    private ArrayList<String> songs; //basically a "playlist"
    private Random random = new Random(); //to shuffle songs

    public Playlist() {
        songs = new ArrayList<>();
        songs.add("Song 1");
        songs.add("Song 2");
        songs.add("Song 3");
        songs.add("Song 4");
    }

    //adds a song to the playlist
    public void addSong(String song) {
        songs.add(song);
        System.out.println(song + " was added to playlist");
    }

    //plays a song
    public void removeSong() {
        songs.remove(song);
        System.out.println(song + " was removed from playlist");
    }

    public void playSong(){
        if(!songs.isEmpty()){
            String currentSong = song.remove(songs.size() - 1);
            System.out.println("Now playing: " + currentSong);
        }
        else{
            System.out.println("Playlist is empty");
        }
    }

    public void skipSong(){
        if(!songs.isEmpty()){
            songs.remove(songs.size() - 1);
            System.out.println("Next Song: " + songs.get(songs.size() - 1));
        }
        else{
            System.out.println("Playlist is empty");
        }
    }

    public void shuffleSongs(){
        Collections.shuffle(songs);
        System.out.println("Songs shuffled: ");
        for (String song : songs){
            System.out.println(song);
        }
    }

    public int findSong(String song){
        int index = songs.indexOf(song);
        if(index != -1){
            System.out.println("Song not found");
        }
        return index; //uh
    }

    public void exit(){
        System.out.println("Closing Playlist. . .");
        System.exit(0);
    }

    public static void main(String[] args){
        Playlist playlist = new Playlist();

        while(true){
            System.out.println("\nPlaylist: ");
            System.out.println("1. Play");
            System.out.println("2. Skip");
            System.out.println("3. Add");
            System.out.println("4. Remove");
            System.out.println("5. Sort");
            System.out.println("6. Sort");
            System.out.println("5. Sort");
            System.out.println("5. Sort");

        }
    }

}