package composite;

public class SongListGenerator {
    public static void main(String[] args){
        SongComponent industrialMusic = new SongGroup("Industrial","Industrial");
        SongComponent heavyMetalMusic = new SongGroup("Heavy Metal", "Heavy Metal");
        SongComponent dubstepMusic = new SongGroup("Dubstep","DubStep");

        SongComponent everySong = new SongGroup("Song List","Every Song");

        everySong.add(industrialMusic);
        industrialMusic.add(new Song("Head Like a Hole", "NIN", 1990));
        industrialMusic.add(new Song("Headhunter","Front 242", 1988));
        everySong.add(dubstepMusic);
        dubstepMusic.add(new Song("Centipede", "Knife Party", 2012));
        dubstepMusic.add(new Song("Tetris","Doctor P", 2011));
        everySong.add(heavyMetalMusic);
        heavyMetalMusic.add(new Song("War Pigs", "Black Sabath", 1970));
        heavyMetalMusic.add(new Song("Ace of Spades", "Motorhead", 1980));

        DisJocky crazyLarry = new DisJocky(everySong);

        crazyLarry.getSongList();


    }
}
