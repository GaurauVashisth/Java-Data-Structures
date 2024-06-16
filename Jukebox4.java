
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Jukebox4 {
 public static void main(String[] args) {
    new Jukebox4().go();
 }  
 public void go(){
    List<SongV4> songList = MockSongs.getSongV4List();
    System.out.println(songList);
    System.out.println("Soretd by artis songs");
    ArtistComparator artistComparator = new ArtistComparator();
    songList.sort(artistComparator);
    System.out.println(songList);
 } 
}

class SongV4 implements Comparable<SongV4>{
    private String title;
    private String artist;
    private int bpm;
    public SongV4(String title, String artist, int bpm) {
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

    @Override
    public String toString() {
        return "Song [title=" + title + ", artist=" + artist + ", bpm=" + bpm + "]";
    }

    public int getBpm() {
        return bpm;
    }

    @Override
    public int compareTo(SongV4 o) {
        return title.compareTo(o.getTitle());
    }
    
}

class MockSongs {

    public static List<SongV4> getSongV4List(){

        List<SongV4> songList = new ArrayList<>(); 
        songList.add(new SongV4("spmersault", "zero 7", 147));
        songList.add(new SongV4("cassidy", "greatfull dead", 158));
        songList.add(new SongV4("$10", "hitchhiker", 197));
        songList.add(new SongV4("havana", "cabello", 105));
        songList.add(new SongV4("Cassidy", "zero 7", 157));
        songList.add(new SongV4("50 ways", "simon", 104));
        return songList;
    }
}
   
class ArtistComparator implements Comparator<SongV4> {

    @Override
    public int compare(SongV4 o1, SongV4 o2) {
        return o1.getArtist().compareTo(o2.getArtist());
    }

}