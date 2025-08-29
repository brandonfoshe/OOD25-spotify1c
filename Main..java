import javax.swing.*;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {

    public static void showGenres(){
        System.out.println("""
                Available genres:
                sad
                upbeat
                slow
                energetic
                dubstep
                metal
                """);
    }

    public static void main(String[] args) {

        //Create a new user and playlist
        ArrayList<Playlist> playlists = new ArrayList<>();
        User user1 = new User("RockMan50", playlists);

        //Create a bunch of songs and add them to a Hash map. Genre is the hash map value to make sorting easy
        Song pop1 = new Song("Super chill song", "Some Guy", 2.86, "sad");
        Song pop2 = new Song("A kind of chill song", "A Band", 3.14, "upbeat");
        Song pop3 = new Song("Relaxing song", "Two Guys In a Garage", 1.86, "slow");
        Song pop4 = new Song("Your favorite song", "Your Favorite Band", 4.03, "energetic");
        Song pop5 = new Song("Slow song #1", "People Who Make Slow Songs", 2.80, "slow");
        Song pop6 = new Song("Slow song #5", "People Who Make Slow Songs", 3.10, "slow");
        Song pop7 = new Song("Slow song #2", "People Who Make Slow Songs", 2.45, "slow");

        Song rock1 = new Song("Heavy Metal", "Radical Band", 3.71, "metal");
        Song rock2 = new Song("Beep Boop", "A Robot", 4.20, "dubstep");
        Song rock3 = new Song("Banging Pots and Pans", "The Chef", 1.11, "metal");
        Song rock4 = new Song("For whom the Bell Tolls", "Metallica", 5.17, "metal");
        Song rock5 = new Song("Super Fast", "Sonic",1.32, "energetic");
        Song rock6 = new Song("TNT", "ACDC", 5.58, "metal");
        Song rock7 = new Song("My Electric Guitar Broke", "Guitar Man", 1.09, "sad");
        Song rock8 = new Song("Turbo music", "", 2.08, "energetic");
        Song rock9 = new Song("World Wide Web", "Internet", 6.71, "dubstep");
        Song rock10 = new Song("Big Drum Song", "This Band has 8 Drummers", 8.21, "upbeat");

        Song jazz1 = new Song("Soothing Jazz", "Cafe Vibes", 8.11, "slow");
        Song jazz2 = new Song("Loss", "Grieving Jazz Artist", 2.29,"sad");
        Song jazz3 = new Song("Not your Typical Song", "Odd Guy", 4.51, "dubstep");
        Song jazz4 = new Song("Classic Jazz", "An Orchestra", 5.12, "upbeat");

        HashMap<Song, String> allSongs = new HashMap<>();
        HashMap<Integer, Song> songIDs = new HashMap<>();

        allSongs.put(pop1, pop1.getGenre());
        allSongs.put(pop2, pop2.getGenre());
        allSongs.put(pop3, pop3.getGenre());
        allSongs.put(pop4, pop4.getGenre());
        allSongs.put(pop5, pop5.getGenre());
        allSongs.put(pop6, pop6.getGenre());
        allSongs.put(pop7, pop7.getGenre());

        allSongs.put(rock1, rock1.getGenre());
        allSongs.put(rock2, rock2.getGenre());
        allSongs.put(rock3, rock3.getGenre());
        allSongs.put(rock4, rock4.getGenre());
        allSongs.put(rock5, rock5.getGenre());
        allSongs.put(rock6, rock6.getGenre());
        allSongs.put(rock7, rock7.getGenre());
        allSongs.put(rock8, rock8.getGenre());
        allSongs.put(rock9, rock9.getGenre());
        allSongs.put(rock10, rock10.getGenre());

        allSongs.put(jazz1, jazz1.getGenre());
        allSongs.put(jazz2, jazz2.getGenre());
        allSongs.put(jazz3, jazz3.getGenre());
        allSongs.put(jazz4, jazz4.getGenre());

        int songIDCounter = 1;
        for(Song song : allSongs.keySet()){
            songIDs.put(songIDCounter++, song);
        }

        //Create a hashmap for playlists with an ID to add and remove easily
        HashMap<Integer, Playlist> allPlaylists = new HashMap<>();
        int id = 1;

        //Create song database with genres
        boolean runner = true;
        String nameHolder;
        int intHolder;
        while (runner) {
            Scanner input = new Scanner(System.in);
            System.out.println("""
                    \nType 'help' to see a list of all commands
                    You may type exit to quit
                    """);

            switch (input.next().toLowerCase()) {
                case "help":
                    System.out.println("""
                            help - Brings you to this menu
                            all - Show the list of all song
                            genres - Show which genres or types are supported to search for
                            exit - Exit the program
                            create - Create a playlist by name
                            delete - Delete a playlist by ID
                            add - Add a song to a created playlist by ID
                            remove - Remove a song from a created playlist by ID
                            view - View all playlists
                            play - Play all songs
                            playlist - Enter a playlist name to view all songs in that playlist
                            type - View all your playlists of a certain type
                            """);
                    break;
                case "genres":
                    showGenres();
                    break;

                case "all":
                    for(Map.Entry<Integer, Song> showAll : songIDs.entrySet()){
                        //I had to make a special print override because it kept printing out the Song@ number thing
                        int songID = showAll.getKey();
                        Song song = showAll.getValue();
                        System.out.println("ID " + songID + " - " + song);
                    }
                    break;

                case "exit":
                    runner = false;
                    break;

                case "sad":
                    // Loop through and find all songs with value 'sad', copy and pasted to all categories
                    for(Map.Entry<Integer, Song> search : songIDs.entrySet()){
                        Song song = search.getValue();
                        if(song.getGenre().equals("sad")){
                            System.out.println("ID " + search.getKey() + " - " + song);
                        }
                    }
                    break;

                case "upbeat":
                    // Loop through and find all songs with value 'sad', copy and pasted to all categories
                    for(Map.Entry<Integer, Song> search : songIDs.entrySet()){
                        Song song = search.getValue();
                        if(song.getGenre().equals("upbeat")){
                            System.out.println("ID " + search.getKey() + " - " + song);
                        }
                    }
                    break;

                case "slow":
                    // Loop through and find all songs with value 'sad', copy and pasted to all categories
                    for(Map.Entry<Integer, Song> search : songIDs.entrySet()){
                        Song song = search.getValue();
                        if(song.getGenre().equals("slow")){
                            System.out.println("ID " + search.getKey() + " - " + song);
                        }
                    }
                    break;

                case "energetic":
                    // Loop through and find all songs with value 'sad', copy and pasted to all categories
                    for(Map.Entry<Integer, Song> search : songIDs.entrySet()){
                        Song song = search.getValue();
                        if(song.getGenre().equals("energetic")){
                            System.out.println("ID " + search.getKey() + " - " + song);
                        }
                    }
                    break;

                case "dubstep":
                    // Loop through and find all songs with value 'sad', copy and pasted to all categories
                    for(Map.Entry<Integer, Song> search : songIDs.entrySet()){
                        Song song = search.getValue();
                        if(song.getGenre().equals("dubstep")){
                            System.out.println("ID " + search.getKey() + " - " + song);
                        }
                    }
                    break;

                case "metal":
                    // Loop through and find all songs with value 'sad', copy and pasted to all categories
                    for(Map.Entry<Integer, Song> search : songIDs.entrySet()){
                        Song song = search.getValue();
                        if(song.getGenre().equals("metal")){
                            System.out.println("ID " + search.getKey() + " - " + song);
                        }
                    }
                    break;

                case "create":
                    Scanner playlistToAdd = new Scanner(System.in);
                    System.out.println("Please enter a name for your playlist");
                    nameHolder = playlistToAdd.nextLine();
                    allPlaylists.put(id, user1.createPlaylist(nameHolder));
                    id++;
                    break;

                case "delete":
                    Scanner playlistToRemove = new Scanner(System.in);
                    System.out.println("Please enter the ID of the playlist you'd like to remove");
                    intHolder = playlistToRemove.nextInt();
                    if(!allPlaylists.containsKey(intHolder)){
                        System.out.println("Playlist not found, please try again");
                        break;
                    }
                    else {allPlaylists.remove(intHolder); break;}

                case "view":
                    if(allPlaylists.isEmpty()){
                        System.out.println("No playlists yet!");
                        break;
                    }
                    else{
                        for (Map.Entry<Integer, Playlist> playlist : allPlaylists.entrySet()){
                            System.out.println("ID " + playlist.getKey() + " - " + playlist.getValue() +
                                    " (" + playlist.getValue().getSongCount() + ") songs");
                        }
                        break;
                    }

                case "play":
                    Scanner toPlay = new Scanner(System.in);
                    System.out.println("Please enter the ID of the playlist you'd like to play from");
                    intHolder = toPlay.nextInt();
                    if(!allPlaylists.containsKey(intHolder)){
                        System.out.println("Playlist not found, please try again");
                        break;
                    }
                    else{allPlaylists.get(intHolder).playAllSongs(); break;}

                case "rename":
                    Scanner IDGetter = new Scanner(System.in);
                    System.out.println("Please enter the ID of the playlist you'd like to rename");
                    intHolder = IDGetter.nextInt();
                    if(!allPlaylists.containsKey(intHolder)){
                        System.out.println("Playlist not found, please try again");
                        break;
                    }
                    else{
                        Scanner rename = new Scanner(System.in);
                        nameHolder = rename.nextLine();
                        allPlaylists.get(intHolder).setName(nameHolder);
                        break;
                    }

                case "add":
                    Scanner addPlaylistPick = new Scanner(System.in);
                    System.out.println("Please enter the ID of the playlist you'd like to add to");
                    intHolder = addPlaylistPick.nextInt();
                    if(!allPlaylists.containsKey(intHolder)){
                        System.out.println("Playlist not found, please try again");
                        break;
                    }
                    else {
                        Playlist addChosen = allPlaylists.get(intHolder);
                        Scanner addSongPick = new Scanner(System.in);
                        System.out.println("Please input the ID of the song you wish to add");
                        intHolder = addSongPick.nextInt();
                        if(!songIDs.containsKey(intHolder)){
                            System.out.println("Song not found, please try again");
                        }
                        else{
                            Song chosenSong = songIDs.get(intHolder);
                            addChosen.addSong(chosenSong);
                        }
                        break;
                    }

                case "remove":
                    Scanner removePlaylistPick = new Scanner(System.in);
                    System.out.println("Please enter the ID of the playlist you'd like to remove from");
                    intHolder = removePlaylistPick.nextInt();
                    if(!allPlaylists.containsKey(intHolder)){
                        System.out.println("Playlist not found, please try again");
                        break;
                    }
                    else {
                        Playlist removeChosen = allPlaylists.get(intHolder);
                        Scanner removeSongPick = new Scanner(System.in);
                        System.out.println("Please input the ID of the song you wish to add");
                        intHolder = removeSongPick.nextInt();
                        if(!songIDs.containsKey(intHolder)){
                            System.out.println("Song not found, please try again");
                        }
                        else {
                            Song chosenSong = songIDs.get(intHolder);
                            removeChosen.addSong(chosenSong);
                        }
                        break;
                    }

                default: System.out.println("Command not understood\n");
            }
        }
    }
}
