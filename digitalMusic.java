import src.com.project2.music.Music;

/*********************************************************
 * This class declare variables, getters, setters and 
 * toString for the digitalMusic class which is a child of 
 * the Music class. 
 * 
 * @author Sonya Morud (smm856@drexel.edu)
 ********************************************************/

public class digitalMusic extends Music {
    
    public String songName; 
    public String ID; 

    //Declare constructor 
    public digitalMusic(String ID, String composer, String genre, String songName){
        super(composer, genre); 
        this.songName = songName; 
        this.ID = ID;
    }

    //Declare getters and setters 
    public String getID(){
        return ID; 
    }
    public void setID(String ID){
        this.ID = ID; 
    }

    public String getSongName(){
        return songName; 
    }
    public void setSongName(String songName){
        this.songName = songName; 
    }

    //toString to make information more readable
    public String toString(){ 
        return "Digital Music{ ID: " + ID + ", Composer: " + composer + ", Song Name: " 
            + songName + ", Genre: " + genre + "}\n";
    }
}

