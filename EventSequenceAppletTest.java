package eventSequence;

import javax.swing.*;

public class EventSequenceAppletTest {
    public static void main(String[] args) {
        // Create a JFrame to host the applet
        JFrame frame = new JFrame("Event Sequence Applet");
        
        // Create an instance of your applet
        EventSequenceApplet applet = new EventSequenceApplet();
        
        // Initialize the applet
        applet.init();
        
        // Add the applet to the frame
        frame.getContentPane().add(applet);
        
        // Set frame size and make it visible
        frame.setSize(400, 300);
        frame.setVisible(true);
        
        // Start the applet
        applet.start();
    }
}
