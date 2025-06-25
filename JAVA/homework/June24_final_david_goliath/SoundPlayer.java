import java.io.*;
import javax.sound.sampled.*;

public class SoundPlayer {
    public static void playSound(String fileName) {
        //using try and catch block to handle exceptions
        try {
            File soundFile = new File(fileName);
            //Audio built in class
            AudioInputStream audio = AudioSystem.getAudioInputStream(soundFile);
            Clip clip = AudioSystem.getClip();
            clip.open(audio);
            clip.start();
        } catch (Exception e) {
            System.out.println("Could not play sound: " + fileName);
        }
    }
}

