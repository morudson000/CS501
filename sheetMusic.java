import src.com.project2.music.Music;

/*********************************************
 * This class declare variables, getters, setters, constructor, 
 * and toString for the class sheetMusic which is a child of Music. 
 * 
 * @author Sonya Morud (smm856@drexel.edu)
 *********************************************/

public class sheetMusic extends Music {
    
    public String publisher; 
    public String workTitle; 

    //Declare constructor 
    public sheetMusic (String composer, String genre, String publisher, String workTitle){
        super(composer, genre);
        this.publisher = publisher; 
        this.workTitle = workTitle; 
    }

    //Declare getters and setters 
    public String getPublisher(){
        return publisher; 
    }
    public void setPublisher(String publisher){
        this.publisher = publisher; 
    }

    public String getWorkTitle(){
        return workTitle; 
    }
    public void setWorkTitle(String workTitle){
        this.workTitle = workTitle; 
    }

    //toString to make information more readable 
    public String toString() {
        return "Sheet Music{ Composer: " + composer + ", Title: " + workTitle + ", Genre: "
            + genre + ", Publisher: " + publisher + "}\n"; 
    }
}