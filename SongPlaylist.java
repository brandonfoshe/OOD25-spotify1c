import java.util.ArrayList;

public class SongPlaylist implements Playlist{

    public String name;
    public ArrayList<Song> songs;

    public SongPlaylist (String name){
        this.name = name;
        this.songs = new ArrayList<>();
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public void setName(String name) {
        this.name = name;
    }

    @Override
    public void addSong(Song song) {
        songs.add(song);
    }

    @Override
    public void removeSong(Song song) {
        songs.remove(song);
    }

    @Override
    public void playAllSongs() {
        int i = 1;
        for (Song song : songs){
            System.out.println("Playing song " + i++ + " of " + songs.size() + ": \n"
                    + song.getTile() + " by " + song.getArtist() + ": " + song.getDuration() + " minutes");
        }
    }

    @Override
    public int getSongCount() {
        return songs.size();
    }

    @Override
    public String toString() {
        return name;
    }

}
