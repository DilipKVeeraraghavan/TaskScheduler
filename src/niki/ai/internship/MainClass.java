package niki.ai.internship;

import java.awt.Dimension;
import java.awt.Toolkit;
import java.io.File;
import java.io.IOException;
import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.UnsupportedAudioFileException;
import javax.swing.JFrame;

public class MainClass {
    public static void main(String[] args){
        MainFrame maine=new MainFrame();
        maine.setVisible(true);
        Dimension dim = Toolkit.getDefaultToolkit().getScreenSize();
        maine.setLocation(dim.width/2-maine.getSize().width/2, dim.height/2-maine.getSize().height/2);
        maine.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
    }
    
    public static void playSound(String exe) {
    try {
        AudioInputStream audioInputStream = AudioSystem.getAudioInputStream(new File(""+System.getProperty("user.dir")+"/"+exe).getAbsoluteFile());
        Clip clip = AudioSystem.getClip();
        clip.open(audioInputStream);
        clip.start();
         new java.util.Timer().schedule( 
                new java.util.TimerTask(){
                    @Override
                    public void run(){
                    /*2sec wait time*/
                    }   
                }, 
            1000*5
        );
    }
    catch(UnsupportedAudioFileException | IOException | LineUnavailableException ex) {
        System.out.println("Error with playing sound.");
        ex.printStackTrace();
        }
    }
}