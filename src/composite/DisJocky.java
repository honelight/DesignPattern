package composite;

public class DisJocky {
    SongComponent songList;
    public DisJocky(SongComponent newSongList){
        songList = newSongList;
    }

    public void getSongList(){
        songList.displaySongInfo();
    }

}
