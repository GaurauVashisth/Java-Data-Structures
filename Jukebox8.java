import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class Jukebox8 {
    public static void main(String[] args) {
        new Jukebox8().go();
    }
    void  go(){
        List<Song> songList = MockSongs.getSongList();
        System.out.println(songList);
        // System.out.println("sort by title in descending order");
        // songList.sort((song1,song2)-> song1.getTitle().compareTo(song2.getTitle()));
        // System.out.println(songList);
        Set<Song> songSet = new TreeSet<>();
        // songSet.addAll(songList);
        songSet.addAll(songList);
        System.out.println(songSet);
    }
}
class Song implements Comparable<Song>{
    private String title;
    private String artist;
    private int bpm;
        public Song(String title, String artist, int bpm) {
        this.title = title;
        this.artist = artist;
        this.bpm = bpm;
    }
    @Override
    public int compareTo(Song o) {
        
        return title.compareTo(o.getTitle());
    }
    @Override
        public int hashCode() {
            return title.hashCode();
        }

        @Override
        public boolean equals(Object obj) {
            Song otherSong = (Song) obj;

            return title.equals(otherSong.getTitle());
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

    // @Override
    // public int compare(Song o1, Song o2) {
    //     return o1.getTitle().compareTo(o2.getTitle());
    // }
    
}
class MockSongs {
    public static List<Song> getSongList(){
        List<Song> songList = new ArrayList<>(); 
        songList.add(new Song("spmersault", "zero 7", 147));
        songList.add(new Song(new String("cassidy"), "greatfull dead", 158));
        songList.add(new Song("$10", "hitchhiker", 197));
        songList.add(new Song("havana", "cabello", 105));
        songList.add(new Song("Cassidy", "zero 7", 157));
        songList.add(new Song("50 ways", "simon", 104));
        songList.add(new Song("cassidy", "greatfull dead", 158));
        songList.add(new Song(new String("$10"), "hitchhiker", 197));
        return songList;
    }
}

class Title {
    public static String title(){
        return new String();
    }
}