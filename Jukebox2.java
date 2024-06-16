import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Jukebox2 {
    public static void main(String[] args) {
        new Jukebox2().go();
    }
    public void go(){
        List<SongV2> songList = MockSongs.getSongV2s();
        System.out.println(songList);
        Collections.sort(songList);
    }
}

class SongV2 {
    private  String title;
    private String artist;
    private int bpm;

    public SongV2(String title, String artist, int bpm) {
        this.title = title;
        this.artist = artist;
        this.bpm = bpm;
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

    public static List<SongV2> getSongV2s(){

        List<SongV2> songList = new ArrayList<>(); 
        songList.add(new SongV2("spmersault", "zero 7", 147));
        songList.add(new SongV2("cassidy", "greatfull dead", 158));
        songList.add(new SongV2("$10", "hitchhiker", 197));
        songList.add(new SongV2("havana", "cabello", 105));
        songList.add(new SongV2("Cassidy", "zero 7", 157));
        songList.add(new SongV2("50 ways", "simon", 104));
        return songList;
    }
   
}