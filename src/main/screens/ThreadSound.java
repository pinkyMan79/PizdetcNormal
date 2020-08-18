package main.screens;

import main.Sound;

public class ThreadSound implements Runnable {



    @Override
    public void run() {
        while ( true ){
            Sound.playSound("src/gameTheme.wav").join();
        }
    }
}
