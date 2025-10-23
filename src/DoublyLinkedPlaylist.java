public class DoublyLinkedPlaylist {

    Songs head ;
    Songs tail ;
    Songs currentSong ;

public void addSong(String title){

    Songs newSong = new Songs(title);

    if( head == null){
        head = newSong;
        tail = newSong ;
        currentSong = newSong ; }
    else {
        tail.next = newSong;
        head.prev = tail;
        tail = newSong;
    }
}

public void nextSong(){
    if (tail != null){
    currentSong = currentSong.next ;
    System.out.println("Now playing :" + currentSong.title);
    }else{
        System.out.println("end of the playlist");
    }
}
public void prevSong(){
    if (currentSong.prev != null) {
        currentSong = currentSong.prev;
        System.out.println("now playing :" + currentSong.title);
    }else{
        System.out.println("prev songs");

    }
}

}
