package it.madlabs.playground.mp3Player;

import it.madlabs.playground.mp3Player.Mp3Player;
import java.io.IOException;

public class Mp3PlayerApp {

    public static void main(String[] args) throws IOException {
        System.out.println("Starting Mp3Player App main... ");

        Mp3Player mp3Player = new Mp3Player();
        mp3Player.memorizeSong("Ciao");
        mp3Player.memorizeSong("Francesco");
        mp3Player.memorizeSong("yeye");
        
        mp3Player.switchOn();
        mp3Player.play();
        mp3Player.stop();
        mp3Player.switchOff();
    }
}
