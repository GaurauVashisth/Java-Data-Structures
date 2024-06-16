import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Jukebox6 {
    public static void main(String[] args) {
        new Jukebox6().go();
    }
    void  go(){
        List<Song> songList = MockSongs.getSongList();
        System.out.println(songList);
        System.out.println("sort by title in descending order");
        songList.sort((song1,song2)-> song1.getTitle().compareTo(song2.getTitle()));
        System.out.println(songList);
        Set<Song> songSet = new HashSet<>();
        songSet.addAll(songList);
        System.out.println(songSet);
    }
}
class Song{
    private String title;
    private String artist;
    private int bpm;
        public Song(String title, String artist, int bpm) {
        this.title = title;
        this.artist = artist;
        this.bpm = bpm;
    }
    @Override
    public String toString() {
        return " " + title + " ";
    }
    public String getTitle() {
        return title;
    }
    public String getArtist() {
        return artist;
    }
    public int getBpm() {
        return bpm;
    }
    
}
class MockSongs {
    public static List<Song> getSongList(){

        List<Song> songList = new ArrayList<>(); 
        songList.add(new Song("spmersault", "zero 7", 147));
        songList.add(new Song("cassidy", "greatfull dead", 158));
        songList.add(new Song("$10", "hitchhiker", 197));
        songList.add(new Song("havana", "cabello", 105));
        songList.add(new Song("Cassidy", "zero 7", 157));
        songList.add(new Song("50 ways", "simon", 104));
        songList.add(new Song("cassidy", "greatfull dead", 158));
        songList.add(new Song("$10", "hitchhiker", 197));
        return songList;
    }
}