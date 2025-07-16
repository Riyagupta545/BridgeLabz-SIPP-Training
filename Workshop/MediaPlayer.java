package Workshop;
import java.util.LinkedList;
import java.util.Queue;

// Base class for Media - demonstrating Polymorphism
class MediaPlayer {
    public void play(String mediaName) {
        System.out.println("Playing: " + mediaName);
    }
}

class MusicPlayer extends MediaPlayer {
    private Queue<String> playlist = new LinkedList<>();

    public void addSong(String song) {
        playlist.add(song);
        System.out.println("Added to playlist: " + song);
    }

    public void playNext() {
        if (!playlist.isEmpty()) {
            String song = playlist.poll();
            play(song); // Polymorphic behavior from MediaPlayer
        } else {
            System.out.println("Playlist is empty.");
        }
    }

    public void viewPlaylist() {
        System.out.println("Current Playlist: " + playlist);
    }

    public static void main(String[] args) {
        MusicPlayer player = new MusicPlayer();
        player.addSong("Song A");
        player.addSong("Song B");
        player.viewPlaylist();
        player.playNext();
        player.playNext();
        player.playNext(); // Playlist empty case
    }
}
