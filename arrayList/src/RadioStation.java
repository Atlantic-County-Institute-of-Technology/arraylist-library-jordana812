import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;
import java.util.Scanner;

public class RadioStation {
    private ArrayList<String> songs; // A list of song names
    private Random random = new Random(); // For shuffling songs

    public RadioStation() {
        songs = new ArrayList<>(); // Initializing our song list
        songs.add("Song 1");
        songs.add("Song 2");
        songs.add("Song 3");
        songs.add("Song 4");
    }

    public void addSong(String song) {
        songs.add(song);
        System.out.println("Song added to the library: " + song);
    }

    public void removeSong(String song) {
        songs.remove(song);
        System.out.println("Song removed from the library: " + song);
    }

    public void playSong() {
        if (!songs.isEmpty()) {
            String currentSong = songs.removeLast();
            System.out.println("Now playing: " + currentSong);
        } else {
            System.out.println("Library is empty.");
        }
    }

    public void skipSong() {
        if (!songs.isEmpty()) {
            songs.removeLast();
            System.out.println("Next song: " + songs.getLast()); // Assuming next song to be the last remaining
        } else {
            System.out.println("Library is empty.");
        }
    }

    public void sortSongsAlphabetically() {
        Collections.sort(songs);
        System.out.println("Songs sorted alphabetically:");
        for (String song : songs) {
            System.out.println(song);
        }
    }

    public void shuffleSongs() {
        Collections.shuffle(songs);
        System.out.println("Songs shuffled:");
        for (String song : songs) {
            System.out.println(song);
        }
    }

    public int findSongPosition(String song) {
        int index = songs.indexOf(song);
        if (index != -1) {
            System.out.println("This song is at index: " + index);
        } else {
            System.out.println("Song not found in the library.");
        }
        return index;
    }

    public void exit() {
        System.out.println("Exiting radio station...");
        System.exit(0); // Exiting the program
    }

    public static void main(String[] args) {
        RadioStation radioStation = new RadioStation();
        Scanner scanner = new Scanner(System.in) {
            // Main menu
            while(true)

            {

                System.out.println("\nRadio Station Menu:");
                System.out.println("1. Play a song");
                System.out.println("2. Skip a song");
                System.out.println("3. Add a song");
                System.out.println("4. Remove a song");
                System.out.println("5. Sort songs alphabetically");
                System.out.println("6. Shuffle songs");
                System.out.println("7. Find a song's position");
                System.out.println("8. Exit");
                System.out.println("Enter your choice: ");

                int choice = Integer.parseInt(System.in.nextLine());

                switch (choice) {
                    case 1:
                        radioStation.playSong();
                        break;
                    case 2:
                        radioStation.skipSong();
                        break;
                    case 3:
                        System.out.println("Enter the song you want to add: ");
                        String newSong = System.in.nextLine();
                        radioStation.addSong(newSong);
                        break;
                    case 4:
                        System.out.println("Enter the song you want to remove: ");
                        String songToRemove = System.in.nextLine();
                        radioStation.removeSong(songToRemove);
                        break;
                    case 5:
                        radioStation.sortSongsAlphabetically();
                        break;
                    case 6:
                        radioStation.shuffleSongs();
                        break;
                    case 7:
                        System.out.println("Enter the song you want to find: ");
                        String targetSong = System.in.readLine();
                        radioStation.findSongPosition(targetSong);
                        break;
                    case 8:
                        radioStation.exit();
                        return; // Exiting the main loop

                    default:
                        System.out.println("Invalid choice. Please try again.");
                        break;
                }
            }
        }
    }
}