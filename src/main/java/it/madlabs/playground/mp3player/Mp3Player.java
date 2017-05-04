package it.madlabs.playground.mp3Player;

public class Mp3Player {

    private final int MAX_SONGS = 2;
    private boolean on = false;
    private int memorizedSongs = 0;
    private String[] songs = new String[MAX_SONGS];

    public void switchOn() {
        this.on = true;
        System.out.println("wheunwehunwheun..");
    }

    public void switchOff() {
        this.on = false;
        System.out.println("uwheuwheuwhe..");
    }

    public void play() {
        if (on) {
            for (int i = 0; i < songs.length; i++) {
                System.out.println("Play : " + songs[i]);
            }
        }
    }

    public void stop() {
        if (on) {
            System.out.println("stop");
        }
    }

    public void memorizeSong(String song) {
        boolean fullMemory = memorizedSongs == songs.length;
        if (fullMemory) {
            System.out.println("Full memory, EXPLOSION!!!!");
        } else {
            songs[memorizedSongs] = song;
            memorizedSongs++;
        }

    }
}
