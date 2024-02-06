package controller;

import view.MasterFrame;

/**
 * Main class to run the Deliverit application.
 *
 * @author Lucas Perry
 */
public class Deliverit {
    private final MasterFrame myFrame;

    public Deliverit(MasterFrame myFrame) {
        this.myFrame = myFrame;
    }

    public void run() {
        // Show the MasterFrame
        myFrame.setVisible(true);
    }

    public static void main(String[] args) {
        javax.swing.SwingUtilities.invokeLater(() -> {
            // Create an instance of MasterFrame
            MasterFrame masterFrame = new MasterFrame();

            // Create an instance of Deliverit with the MasterFrame
            Deliverit deliverit = new Deliverit(masterFrame);

            // Run the application
            deliverit.run();
        });
    }
}