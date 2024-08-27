package com.phaete;

public class Main {
    public static void main(String[] args) {

        Playable videoPlayer = new VideoPlayer();
        Playable musicPlayer = new MusicPlayer();

        MediaController mediaController = new MediaController();

        mediaController.playMedia(videoPlayer);
        mediaController.playMedia(musicPlayer);
    }
}