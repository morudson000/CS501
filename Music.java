
/***************************************
 * This class declares variables, getters, and setters
 * for the Music class, which is the parents class of sheetMusic
 * and digitalMusic.
 * 
 * @author Sonya Morud (smm856@drexel.edu)
 **************************************/

public class Music {
    public String composer;
    public String genre;

    // Declare constructor for Music class
    public Music(String composer, String genre) {

        this.composer = composer;
        this.genre = genre;
    }

    // Declare getters and setters for each variable
    public String getComposer() {
        return composer;
    }

    public void setComposer(String composer) {
        this.composer = composer;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

}
