package launcher;

import entities.Student;
import gui.SimplePresentationScreen;

public class Launcher {
	public static void main(String [] args) {
        //Schedule a job for the event-dispatching thread:
        //creating and showing this application's GUI.
        javax.swing.SwingUtilities.invokeLater(new Runnable() {
            public void run() {
            	new SimplePresentationScreen(new Student(
            			126665,
            			"Schmit",
            			"Lucas Gabriel",
            			"l.schmit.2000@gmail.com",
            			"https://github.com/Lucasschmit/tdp-proyecto-1.git",
            			"/images/logo_uns_v1.png"
            			));
            }
        });
    }
}