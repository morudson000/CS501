import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

/*********************************
 * This program reads a CSV of my parents that catalogues
 * their digital and sheet music collection. The CSV is read into an array
 * and then the user is able to search and print the contents of the CSV, as
 * these are the sole actions that my parents wanted the program to fulfill.
 * 
 * @author Sonya M. Morud (smm856@drexel.edu)
 *********************************/

public class musicLibrary {
    public static void main(String[] args) {

        System.out.println(new File(".").getAbsoluteFile());

        String csvFile = "musicLibrary.csv";
        File myFile;
        Scanner myReader = null;
        String csvSplitBy = ",";
        String line;
        String ID;
        String composer;
        String genre;
        String publisher;
        String workTitle;
        String songName;
        boolean fileFound = true;

        ArrayList<Music> myLibrary = new ArrayList<>();

        // Uses Buffered Reader to read CSV File, error message if file is not found

        try (BufferedReader reader = new BufferedReader(new FileReader(csvFile))) {
            while ((line = reader.readLine()) != null) {
                String[] dataArray = line.split(csvSplitBy);
                String musicType = dataArray[0];
                ID = dataArray[1];
                composer = dataArray[2];
                genre = dataArray[3];
                publisher = dataArray[4];
                workTitle = dataArray[5];
                songName = dataArray[6];

                if (musicType.equals("digitalMusic")) {
                    myLibrary.add(new digitalMusic(ID, composer, genre, songName));
                }
                if (musicType.equals("sheetMusic")) {
                    myLibrary.add(new sheetMusic(composer, genre, publisher, workTitle));
                }
            }
        } catch (IOException e) {
            System.out.println("Sorry, no file found! Please check the file you are loading.");
            fileFound = false;
        }

        // Boolean ensures that if the file isn't found, the menu does not print
        if (fileFound == true) {

            boolean needsToRun = true;
            while (needsToRun) {

                menuOptions(); // method prints out menuOptions

                String searchTerm;
                Scanner scanner = new Scanner(System.in);
                String userAnswer = scanner.nextLine();
                if (userAnswer.equalsIgnoreCase("A")) { // Allows user to search the library
                    System.out.println("Please enter the letter of what you would like to search the library by:");
                    System.out.println("A Composer");
                    System.out.println("B Song name");
                    searchTerm = scanner.nextLine();
                    if (searchTerm.equalsIgnoreCase("A")) { // Allows user to search by composer
                        String composerName;
                        System.out.println("Please type the name of the composer.");
                        composerName = scanner.nextLine();

                        for (int x = 0; x < myLibrary.size(); x++) {
                            if (myLibrary.get(x).getComposer().toLowerCase().contains(composerName.toLowerCase())) {
                                System.out.println(myLibrary.get(x));
                            }
                        }
                    } else if (searchTerm.equalsIgnoreCase("B")) { // Allows user to search by song name, which could be
                                                                   // songName or Work Title
                        String song;
                        System.out.println("Please enter the name of the song");
                        song = scanner.nextLine();

                        for (int x = 0; x < myLibrary.size(); x++) {
                            if (myLibrary.get(x) instanceof digitalMusic) {
                                String songTitle = ((digitalMusic) myLibrary.get(x)).getSongName();
                                if (songTitle != null && songTitle.toLowerCase().contains(song.toLowerCase())) {
                                    System.out.println(myLibrary.get(x));
                                } else if (myLibrary.get(x) instanceof sheetMusic) {
                                    String workName = ((sheetMusic) myLibrary.get(x)).getWorkTitle();
                                    if (workName != null && workName.toLowerCase().contains(song.toLowerCase())) {
                                        System.out.println(myLibrary.get(x));
                                    }
                                }
                            }
                        }

                    } else { // Allows for error handling
                        System.out.println("Input doesn't match available options. Please try again!");
                    }
                } else if (userAnswer.equalsIgnoreCase("B")) { // Prints the CSV library that is loaded into the
                                                               // ArrayList
                    System.out.println(myLibrary);
                } else if (userAnswer.equalsIgnoreCase("C")) { // Allows the user to exit the program
                    System.out.println("Exiting program. Have a great rest of your day!");
                    needsToRun = false;
                } else { // Allows for error handling
                    System.out.println("Input doesn't match available options. Please try again!");
                }
            }
        }
    }

    public static void menuOptions() {
        System.out.println("Welcome to your music library!");
        System.out.println("Please enter the letter of the action you would like to choose:");
        System.out.println("A Search the music library.");
        System.out.println("B Print the contents of the library.");
        System.out.println("C Exit the program.");
    }

}