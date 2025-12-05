import java.util.ArrayList;

public class Playlist {
    private String name ;
    private ArrayList<String> songs ;

    public Playlist(String name){
        this.name=name ;
        this.songs = new ArrayList<>();
    }

    public String getName() {
        return name;
    }
    public void addSongs(String songName){
        songs.add(songName);
    }
    public void removeSong(String songName){
        if (songs.contains(songName)) {
            songs.remove(songName);
        }
    }
    public void printSongs(){
        if(songs.isEmpty()){
            System.out.println("Song list is empty ");
        }
        System.out.println("List name: "+ name);
        for (int i =0;i < songs.size();i++){
            System.out.println((i+1)+"." +songs.get(i));
        }
    }
    public int getSongCount(){
        return songs.size();
    }
}
