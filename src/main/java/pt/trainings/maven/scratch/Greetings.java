package pt.trainings.maven.scratch;

/**
 * Klasa powitalna.
 */
public final class Greetings {

    /**
     * Stała z tekstem powitania.
     */
    private static final String GREETING = "Hello ";

    /**
     * Metoda witająca użytkownika.
     *
     * @param string imię użytkownika
     * @return gotowy tekst powitania
     */
    public String sayHello(final String string) {
        return GREETING + (string != null ? string : "John Doe");
    }
}
