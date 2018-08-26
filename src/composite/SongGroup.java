package composite;

import java.util.ArrayList;
import java.util.Iterator;

public class SongGroup extends SongComponent{
    ArrayList songComponents = new ArrayList();

    String groupName;
    String groupDescription;

    public SongGroup(String newGroupName, String newGroupDescription){
        this.groupName = newGroupName;
        this.groupDescription = newGroupDescription;
    }

    public String getGroupName(){return groupName;}
    public String getGroupDescription(){return groupDescription;}

    public void add(SongComponent newSongComponent){
        this.songComponents.add(newSongComponent);
    }

    public void remove(SongComponent newSongComponent){
        songComponents.remove(newSongComponent);
    }

    public SongComponent getComponent(int compoentIndex){
        return (SongComponent)songComponents.get(compoentIndex);
    }

    @Override
    public void displaySongInfo(){
        System.out.println(getGroupName()+" "+getGroupDescription()+"\n");
        Iterator songIterator = songComponents.iterator();
        while (songIterator.hasNext()) {
            SongComponent songInfo = (SongComponent)songIterator.next();
            songInfo.displaySongInfo();
        }
    }

}
