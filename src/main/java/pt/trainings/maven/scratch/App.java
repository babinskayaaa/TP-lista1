package pt.trainings.maven.scratch;

/**
 * Główna klasa aplikacji.
 */
public final class App {

    private App() {
        // Ukryty konstruktor
    }

    /**
     * Metoda startowa programu.
     *
     * @param args argumenty wywołania
     */
    public static void main(final String[] args) {
        final Playlist myPlaylist = new Playlist("Moje Ulubione");
        final Song song1 = new Song("Blinding Lights", "The Weeknd");
        final Song song2 = new Song("Shape of You", "Ed Sheeran");

        myPlaylist.addSong(song1);
        myPlaylist.addSong(song2);

        myPlaylist.printSongs();
    }
}
