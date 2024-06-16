import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Jukebox3 {
    public static void main(String[] args) {
        new Jukebox3().go();
    }
    public void go(){
        List<SongV3> songList = MockSongs.getSongV3List();
        System.out.println(songList);
        Collections.sort(songList);
    }
}

class SongV3 implements Comparable<SongV3> {
    private  String title;
    private String artist;
    private int bpm;

    public SongV3(String title, String artist, int bpm) {
        this.title = title;
        this.artist = artist;
        this.bpm = bpm;
    }

    @Override
    public int compareTo(SongV3 o) {
        return title.compareTo(o.getTitle());
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

    @Override
    public String toString() {
        return title;
    }
}

class MockSongs {

    public static List<SongV3> getSongV3List(){

        List<SongV3> songList = new ArrayList<>(); 
        songList.add(new SongV3("spmersault", "zero 7", 147));
        songList.add(new SongV3("cassidy", "greatfull dead", 158));
        songList.add(new SongV3("$10", "hitchhiker", 197));
        songList.add(new SongV3("havana", "cabello", 105));
        songList.add(new SongV3("Cassidy", "zero 7", 157));
        songList.add(new SongV3("50 ways", "simon", 104));
        return songList;
    }
   
}