public interface Playlist{
    String getName();
    void setName(String name);

    void addSong(Song song);
    void removeSong(Song song);

    void playAllSongs();

    int getSongCount();

}
