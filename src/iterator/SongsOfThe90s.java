package iterator;

import java.util.Hashtable;
import java.util.Iterator;

public class SongsOfThe90s implements SongIterator{
    Hashtable<Integer, SongInfo> bestSongs;

    int hashKey = 0;

    int arrayValue = 0;

    public SongsOfThe90s(){
        bestSongs = new Hashtable<Integer, SongInfo>();

        addSong("Room","B52s", 1989);
        addSong("Cruel Summer","Bananarama", 1984);
        addSong("Head Over Heels","Tears for Fears", 1985);
    }

    public void addSong(String songName, String bandName, int yearReleased){
        SongInfo songInfo = new SongInfo(songName, bandName, yearReleased);
        bestSongs.put(hashKey,songInfo);
        hashKey++;
    }

    public Hashtable<Integer, SongInfo> getBestSongs(){
        return bestSongs;
    }

    @Override
    public Iterator createIterator() {
        return bestSongs.values().iterator();
    }
}
