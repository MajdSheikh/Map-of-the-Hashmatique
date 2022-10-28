import java.util.Set;
import java.util.HashMap;

public class MapofTheHashmatique {

    public static void main(String[] args) {

        HashMap<String, String> trackList  = new HashMap<String, String>();
        trackList .put("song1 title", "song1 lyrics");
        trackList .put("song2 title", "song2 lyrics");
        trackList .put("song3 title", "song3 lyrics");
        trackList .put("song4 title", "song4 lyrics");

        // get the keys by using the keySet method
        Set<String> Lyrics = trackList.keySet();
        for(String Track: Lyrics) {
            // System.out.println(Track);
            // System.out.println(trackList.get(Track));   
            System.out.println(Track + " : " + trackList.get(Track)); 

        }
    }
}

