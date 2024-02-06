package view;

import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;
import java.beans.PropertyChangeSupport;
import java.util.HashMap;
import java.util.Map;
import java.awt.Dimension;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;
import java.beans.PropertyChangeSupport;
import java.io.File;
import java.io.IOException;
import java.io.Serial;
import java.util.HashMap;
import java.util.Map;
import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.UnsupportedAudioFileException;
import javax.swing.Box;
import javax.swing.BoxLayout;
import javax.swing.JFrame;
import javax.swing.JMenuBar;
import javax.swing.JOptionPane;
import javax.swing.Timer;

import static com.sun.java.accessibility.util.AWTEventMonitor.addKeyListener;

public class MasterFrame extends JFrame implements PropertyChangeListener {

    private static final int FRAME_WIDTH = 650;
    private static final int FRAME_HEIGHT = 750;
    private static final int PANEL_WIDTH = 100;
    private static final int PANEL_HEIGHT = 250;
    private static final int DEFAULT_DELAY = 1000;
    private static final String WINDOW_TITLE = "Deliverit";


    public MasterFrame() {
        super(WINDOW_TITLE);
        final Dimension preferredFrameSize = new Dimension(FRAME_WIDTH, FRAME_HEIGHT);
        setPreferredSize(preferredFrameSize);
        setSize(FRAME_WIDTH, FRAME_HEIGHT);
        setResizable(true);

        JPanel mainPanel = new JPanel();
        mainPanel.setPreferredSize(new Dimension(PANEL_WIDTH, PANEL_HEIGHT));

        mainPanel.setBackground(new Color(0, 102, 204));

        // Set layout manager to center the panel
        mainPanel.setLayout(new GridBagLayout());
        GridBagConstraints gbc = new GridBagConstraints();
        gbc.gridx = (FRAME_WIDTH - PANEL_WIDTH) / 10;
        gbc.gridy = (FRAME_HEIGHT - PANEL_HEIGHT) / 10;

        // Add your components to the panel
        // For example:
        // mainPanel.add(new JLabel("Hello, World!"), gbc);

        // Add the panel to the frame's content pane
        getContentPane().add(mainPanel);

        //Adding the key listener to the frame.
        addKeyListener(new ControlKeyListener());

        //Focusing this frame.
        setFocusable(true);
        requestFocus();
    }


    /**
     * This method gets called when a bound property is changed.
     *
     * @param evt A PropertyChangeEvent object describing the event source
     *            and the property that has changed.
     */
    @Override
    public void propertyChange(PropertyChangeEvent evt) {

    }

    private void setUpParams() {
    }

    public void setPreferredSize(Dimension preferredFrameSize) {
    }

    /**
     * Helper inner class that facilitates keyboard inputs.
     */
    private class ControlKeyListener extends KeyAdapter {
        /**
         * New Keymap for controls.
         */
        private final Map<Integer, Runnable> myKeyMap;

        ControlKeyListener() {
            this.myKeyMap = new HashMap<>();
            mapKeys();
        }

        private void mapKeys() {
//            //Left
//            myKeyMap.put(KeyEvent.VK_A);
//            myKeyMap.put(KeyEvent.VK_LEFT);
//
//            //Right
//            myKeyMap.put(KeyEvent.VK_D);
//            myKeyMap.put(KeyEvent.VK_RIGHT);
//
//            //Down
//            myKeyMap.put(KeyEvent.VK_S);
//            myKeyMap.put(KeyEvent.VK_DOWN);
//
//            //Drop
//            myKeyMap.put(KeyEvent.VK_SPACE);
//
//            //Rotate CW
//            myKeyMap.put(KeyEvent.VK_E);
//
//            //Rotate CCW
//            myKeyMap.put(KeyEvent.VK_Q);
//
//            //Pause/UnPause
//            myKeyMap.put(KeyEvent.VK_P);

            //View Controls
            myKeyMap.put(KeyEvent.VK_F1, () -> {
                //Pause the app
                //pause();
                JOptionPane.showMessageDialog(MasterFrame.this, """
                        Controls:
                        Left: A, a, LeftArrow
                        Right: D, d, RightArrow
                        Down: S, s, DownArrow
                        Drop: Spacebar
                        Rotate Clockwise: E, e
                        Rotate Counter Clockwise: Q, q
                        Pause/Unpause: P, p
                        Controls: F1""");

            });
        }
    }
}
