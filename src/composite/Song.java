package composite;

public class Song extends SongComponent {
    String songName;
    String bandName;
    int releaseYear;

    public Song(String newSongName, String newBandName, int newYearReleased){
        this.songName = newBandName;
        this.bandName = newBandName;
        this.releaseYear = newYearReleased;
    }

    public String getSongName(){
        return songName;
    }

    public String getBandName(){
        return bandName;
    }

    public int getReleaseYear(){
        return this.releaseYear;
    }

    @Override
    public void displaySongInfo(){
        System.out.println(getSongName() + " was recorded by "+getBandName()+" in "+getReleaseYear());
    }
}
