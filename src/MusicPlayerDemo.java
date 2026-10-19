//Yusuf Enes Düz
//240444043
//19.10.2026

public class MusicPlayerDemo {

    public static void main(String[] args) {

        MusicPlaylist playlist = new MusicPlaylist();

        playlist.addSong("Kalite - Organize");
        playlist.addSong("Burada Sokaklar - Eray,Mansur");
        playlist.addSong("24/7 - Alizade,Berkcan Güven");
        playlist.addSong("Outro - UZI");

        System.out.println("=== PLAYLIST ===");
        playlist.displayPlaylist();


        System.out.println("\n=== CURRENT SONG PLAYING ===");
        playlist.displayCurrentSong();

        System.out.println("\n=== NEXT SONG TO PLAY ===");
        playlist.nextSong();


        System.out.println("\n=== NEXT SONG TO PLAY ===");
        playlist.nextSong();


        System.out.println("\n=== PREVIOUS SONG TO PLAY ===");
        playlist.previousSong();


        System.out.println("\n=== AFTER REMOVING Kalite SONG ===");
        playlist.removeSong("Kalite - Organize");
        playlist.displayPlaylist();


        System.out.println("\n=== AFTER REMOVING Burada Sokaklar SONG ===");
        playlist.removeSong("Burada Sokaklar - Eray,Mansur");
        playlist.displayPlaylist();

    }
}