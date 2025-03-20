//name: Jordan Arrington
//project name: Arraylist Library
//date: 3/20/25
//desc: uses Array lists to create a 'Playlist' that contains a library of 'songs'

import java.util.Scanner;

//Displays menu of actions to do with "playlist" and goes through all the available cases/actions
//calls the methods from Playlist.java
public class Main {
    public static void main(String[] args) {
        //Easily puts all options together using triple quotations for a neater look
        System.out.print("""
                Playlist Menu:
                1. Play
                2. Skip
                3. Add
                4. Remove
                5. Sort
                6. Shuffle
                7. Find
                8. Exit
                """);

        Playlist Playlist = new Playlist();
        Scanner scanner = new Scanner(System.in);
        // Main menu
        boolean Name = true; //uses a boolean to create a true statement for a while loop
        while(Name == true) {

            System.out.println("\nchoose an action: ");

            int choice = Integer.parseInt(scanner.nextLine()); //Ensures the string turns into an int to be able to choose an option

            //necessary to easily go through all available functions of the playlist
            switch (choice) {
                case 1:
                    Playlist.playSong();
                    break;
                case 2:
                    Playlist.skipSong();
                    break;
                case 3:
                    System.out.println("Enter song name: ");
                    String newSong = scanner.nextLine();
                    Playlist.addSong(newSong);
                    break;
                case 4:
                    System.out.println("Remove song: ");
                    String removedSong = scanner.nextLine();
                    Playlist.removeSong(removedSong);
                    break;
                case 5:
                    Playlist.sortSongs();
                    break;
                case 6:
                    Playlist.shuffleSongs();
                    break;
                case 7:
                    System.out.println("Enter song name: ");
                    String targetSong = scanner.nextLine();
                    Playlist.findSong(targetSong);
                    break;
                case 8:
                    Playlist.exit();
                    Name = false;
                    break; // Exiting the main loop

                default: //In place of an else statement
                    System.out.println("Invalid command");
                    break;
            }
        }
    }
}
