import java.util.ArrayList;

/**********************************
 * This program tests getters, setters, and constructors
 * for Music, sheetMusic, and digitalMusic classes.
 * 
 * @author Sonya M. Morud (smm856@drexel.edu)
 ********************************/

public class catalogTester {
    public static void main(String[] args) {

        ArrayList<Music> myLibrary = new ArrayList<>();

        // Tests Music class constructor

        Music musicTest = new Music("Bach", "Ballet");
        if (musicTest.getComposer() == "Bach" && musicTest.getGenre() == "Ballet") {
            System.out.println("Default Music class constructor passed.");
        } else {
            System.out.println("Default Music class constructor failed.");
        }

        // Tests Music class setters

        musicTest.setComposer("Tchaikovsky");
        musicTest.setGenre("Instrumental");
        if ((musicTest.getComposer() == "Tchaikovsky") && (musicTest.getGenre() == "Instrumental")) {
            System.out.println("Music class setters passed.");
        } else {
            System.out.println("Music class setters failed.");
        }

        // Tests digitalMusic class constructor

        digitalMusic digitalMusicTest = new digitalMusic("15", "Rachmaninoff",
                "Instrumental", "The Bells");

        if ((digitalMusicTest.getID() == "15") && (digitalMusicTest.getComposer() == "Rachmaninoff") &&
                (digitalMusicTest.getGenre() == "Instrumental") && (digitalMusicTest.getSongName() == "The Bells")) {
            System.out.println("Default digitalMusic class constructor passed.");
        } else {
            System.out.println("Default digitalMusic class constructor failed.");
        }

        // Tests digitalMusic setters

        digitalMusicTest.setID("20");
        digitalMusicTest.setSongName("Vocalise");

        if ((digitalMusicTest.getID() == "20") && (digitalMusicTest.getSongName() == "Vocalise")) {
            System.out.println("digitalMusic class setters passed.");
        }

        // Tests sheetMusic class constructor

        sheetMusic sheetMusicTest = new sheetMusic("Debussy", "Classical", "Stringer", "Nocturnes");
        if ((sheetMusicTest.getComposer() == "Debussy") && (sheetMusicTest.getGenre() == "Classical") &&
                (sheetMusicTest.getPublisher() == "Stringer") && (sheetMusicTest.getWorkTitle() == "Nocturnes")) {
            System.out.println("Default sheetMusic class constructor passed.");
        } else {
            System.out.println("Default sheetMusic class constructor failed.");
        }

        // Tests sheetMusic class setters

        sheetMusicTest.setPublisher("Hawkes");
        sheetMusicTest.setWorkTitle("La Mer");

        if ((sheetMusicTest.getPublisher() == "Hawkes") && (sheetMusicTest.getWorkTitle() == "La Mer")) {
            System.out.println("sheetMusic class setters passed.");
        } else {
            System.out.println("sheetMusic class setters failed.");
        }
    }
}
