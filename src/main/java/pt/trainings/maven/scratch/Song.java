package pt.trainings.maven.scratch;

/**
 * Klasa reprezentująca piosenkę.
 */
public class Song {

    /** Tytuł piosenki. */
    private final String title;

    /** Wykonawca piosenki. */
    private final String artist;

    /**
     * Konstruktor klasy Song.
     *
     * @param songTitle  tytuł piosenki
     * @param songArtist wykonawca piosenki
     */
    public Song(final String songTitle, final String songArtist) {
        this.title = songTitle;
        this.artist = songArtist;
    }

    /**
     * Zwraca tytuł piosenki.
     *
     * @return tytuł
     */
    public String getTitle() {
        return title;
    }

    /**
     * Zwraca wykonawcę piosenki.
     *
     * @return wykonawca
     */
    public String getArtist() {
        return artist;
    }
}
