package calculator;

import javax.swing.JFrame;

public class CalculatorAppletTest {
    public static void main(String[] args) {
    	JFrame frame = new JFrame("Calculator");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        // Create an instance of CalculatorApplet
        CalculatorApplet applet = new CalculatorApplet();
        
        // Initialize the applet
        applet.init();
        
        // Add the applet to the frame
        frame.getContentPane().add(applet);
        
        // Set frame size and make it visible
        frame.setSize(300, 400);
        frame.setVisible(true);
    }
}