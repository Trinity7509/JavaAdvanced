package advancedJava.onlineDataBase;

public class Song {
    private static String ARTIST_NAME="Artist name should be between 3 and 20 symbols.";
    private static String SONG_NAME="Song name should be between 3 and 30 symbols.";
    private static String MIN_LENGTH ="Song minutes should be between 0 and 14.";
    private static String SEC_LENGTH="Song seconds should be between 0 and 59.";
    private static String SONG_LENGTH="Invalid song length.";


    private String artistName;
    private String songName;
    private long songMin;
    private long songSec;


    public Song( String artistName, String songName,long songMin, long songSec) {

        this.setArtistName(artistName);
        this.setSongName(songName);
        this.setSongMin(songMin);
        this.setSongSec(songSec);
    }
    private void checkSongLength(long songMin, long songSec)
    {
        long totalTime=60*songMin+songSec;
        if(totalTime>889)
        {
            throw new IllegalArgumentException(SONG_LENGTH);
        }

    }
    public String getArtistName() {
        return artistName;
    }

    private void setArtistName(String artistName) throws IllegalArgumentException{
        if(artistName.length()<3||artistName.length()>20)
        {
            throw new IllegalArgumentException(ARTIST_NAME);
        }

    }

    public String getSongName() {
        return songName;
    }

    private void setSongName(String songName) {
        if(songName.length()<3||songName.length()>30)
        {
            throw new IllegalArgumentException(SONG_NAME);
        }

    }



    public long getSongMin() {
        return songMin;
    }

    private void setSongMin(long songMin) {
        if(songMin<0||songMin>14)
        {
            throw new IllegalArgumentException(MIN_LENGTH);
        }

    }

    public long getSongSec() {
        return songSec;
    }

    private void setSongSec(long songSec) throws IllegalArgumentException {
        if(songSec<0||songSec>59)
        {
            throw new IllegalArgumentException(SEC_LENGTH);
        }


    }
}
