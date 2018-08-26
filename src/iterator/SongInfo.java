package iterator;

public class SongInfo {
    String songName;
    String bandName;
    int yearReleased;

    public SongInfo(String newSongName, String newBandName, int newYearReleased){
        this.songName = newSongName;
        this.bandName = newBandName;
        this.yearReleased = newYearReleased;
    }

    public String getSongName(){return this.songName;}
    public String getBandName(){return this.bandName;}
    public int getYearReleased(){return this.yearReleased;}
}
