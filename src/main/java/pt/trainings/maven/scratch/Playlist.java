package pt.trainings.maven.scratch;

import java.util.ArrayList;
import java.util.List;

/**
 * Klasa reprezentująca playlistę.
 */
public class Playlist {

    /** Nazwa playlisty. */
    private final String name;

    /** Lista piosenek. */
    private final List<Song> songs;

    /**
     * Konstruktor klasy Playlist.
     *
     * @param playlistName nazwa playlisty
     */
    public Playlist(final String playlistName) {
        this.name = playlistName;
        this.songs = new ArrayList<>();
    }

    /**
     * Dodaje piosenkę do playlisty.
     *
     * @param song obiekt piosenki
     */
    public void addSong(final Song song) {
        if (song != null) {
            this.songs.add(song);
        }
    }

    /**
     * Wypisuje wszystkie piosenki z playlisty.
     */
    public void printSongs() {
        System.out.println("Playlista: " + this.name);
        for (final Song song : this.songs) {
            System.out.println(song.getTitle() + " - " + song.getArtist());
        }
    }
}
