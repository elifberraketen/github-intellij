public class TestPlaylist {
    static void main(String[] args) {
        Playlist favSongs= new Playlist("FavSongs");
        favSongs.addSongs("Blink Gone");
        favSongs.addSongs("Nowhere");
        favSongs.addSongs("Black Sarrow");
        favSongs.addSongs("Closer to you");

        favSongs.printSongs();
        favSongs.getSongCount();

        favSongs.removeSong("Closer to you");

        favSongs.printSongs();
    }
}
