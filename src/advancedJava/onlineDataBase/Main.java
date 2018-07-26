package advancedJava.onlineDataBase;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(reader.readLine());
        int counter = 0;
        int totalTime = 0;
        for (int i = 0; i < n; i++) {

            try {
                String[] listSongs = reader.readLine().split(";");
                String nameArtist = listSongs[0];
                String nameSong = listSongs[1];
                String lengthSong = listSongs[2];

                String[] detailsSong = lengthSong.split(":");
                int minSong = Integer.parseInt(detailsSong[0]);
                int secSong = Integer.parseInt(detailsSong[1]);
                //SongLength songLength = new SongLength(minSong, secSong);
                //Song song = new Song(nameArtist, nameSong, songLength);
                Song song = new Song(nameArtist, nameSong, minSong, secSong);
                counter++;
                totalTime+=minSong*60+secSong;
                System.out.println("Song added.");

            } catch (IllegalArgumentException e) {
                System.out.println(e.getMessage());
            }
        }
        Integer leftHours=totalTime/3600;
        Integer leftMin=(totalTime%3600)/60;
        Integer leftSec=totalTime%60;

        System.out.printf("Songs added: %d%n",counter);
        System.out.printf("Playlist length: %dh %dm %ds",leftHours,leftMin,leftSec);

    }
}
