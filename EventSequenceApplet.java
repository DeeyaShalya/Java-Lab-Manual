package eventSequence;


import java.applet.Applet;
import java.awt.Graphics;


@SuppressWarnings("removal")
public class EventSequenceApplet extends Applet {
    public void init() {
        // This method is called when the applet is initialized
        System.out.println("Initializing applet...");
    }
    
    public void start() {
        // This method is called when the applet is started or restarted
        System.out.println("Starting applet...");
    }
    
    public void stop() {
        // This method is called when the applet is stopped
        System.out.println("Stopping applet...");
    }
    
    public void destroy() {
        // This method is called when the applet is destroyed
        System.out.println("Destroying applet...");
    }
    
    public void paint(Graphics g) {
        // Draw a message on the applet's surface
        g.drawString("Welcome to the Event Sequence Applet!", 20, 20);
    }
}
