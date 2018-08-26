package iterator;

import org.omg.PortableInterceptor.SYSTEM_EXCEPTION;

import java.util.ArrayList;
import java.util.Iterator;

public class DisJocky {
    SongsOfThe70s songs70s;
    SongsOfThe80s songs80s;
    SongsOfThe90s songs90s;

    SongIterator iter70sSongs;
    SongIterator iter80sSongs;
    SongIterator iter90sSongs;


    public DisJocky(SongIterator iter70sSongs, SongIterator iter80sSongs, SongIterator iter90sSongs){
        this.iter70sSongs = iter70sSongs;
        this.iter80sSongs = iter80sSongs;
        this.iter90sSongs = iter90sSongs;
    }

    public void printTheSongs(Iterator iterator){
        while(iterator.hasNext()){
            SongInfo songInfo = (SongInfo)iterator.next();
            System.out.println(songInfo.getSongName());
            System.out.println(songInfo.getBandName());
            System.out.println(songInfo.getYearReleased());
        }
    }

    public void showTheSongs(){
        Iterator songs70s = iter70sSongs.createIterator();
        Iterator songs80s = iter80sSongs.createIterator();
        Iterator songs90s = iter90sSongs.createIterator();

        System.out.println("Songs of the 70s");
        printTheSongs(songs70s);
        System.out.println("Songs of the 80s");
        printTheSongs(songs80s);
        System.out.println("Songs of the 90s");
        printTheSongs(songs90s);
    }

//    public DisJocky(SongsOfThe70s songs70s, SongsOfThe80s songs80s, SongsOfThe90s songs90s){
//        this.songs70s = songs70s;
//        this.songs80s = songs80s;
//        this.songs90s = songs90s;
//    }

//    public void showTheSongs(){
//        ArrayList aL70sSongs = songs70s.getBestSongs();
//        System.out.println("Songs of the 70s");
//
//        for(int i=0; i<aL70sSongs.size(); i++){
//            SongInfo bestSongs = (SongInfo)aL70sSongs.get(i);
//            System.out.println(bestSongs.getSongName());
//            System.out.println(bestSongs.getBandName());
//            System.out.println(bestSongs.getYearReleased());
//        }
//
//        for(int i=0; i<songs80s.getBestSongs().length; i++){
//            SongInfo bestSongs = songs80s.getBestSongs()[i];
//            System.out.println(bestSongs.getSongName());
//            System.out.println(bestSongs.getBandName());
//            System.out.println(bestSongs.getYearReleased());
//        }
//
//        for(int i:songs90s.getBestSongs().keySet()){
//            SongInfo bestSongs = songs90s.getBestSongs().get(i);
//            System.out.println(bestSongs.getSongName());
//            System.out.println(bestSongs.getBandName());
//            System.out.println(bestSongs.getYearReleased());
//        }
//
//    }
}
