public class Song {
    public String tile;
    public String artist;
    public double duration;
    public String genre;

    public Song(String title,String artist,double duration, String genre){
        this.tile = title;
        this.artist = artist;
        this.duration = duration;
        this.genre = genre;
    }

    public String getTile() {
        return tile;
    }

    public String getArtist() {
        return artist;
    }

    public double getDuration() {
        return duration;
    }

    public String getGenre(){
        return genre;
    }

    @Override
    public String toString() {
        return (getTile() + " by " + getArtist() + " - " + "(" + getGenre() + ") " + getDuration() + " minutes");
    }

}
