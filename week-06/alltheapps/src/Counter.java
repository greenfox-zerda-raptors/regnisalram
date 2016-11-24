import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Created by regnisalram on 11/23/16.
 */
public class Counter extends JPanel {

    private JLabel clickCounter;
    private JButton buttonToClick, buttonToReset;
    int clicks;
    ActionListener clicksAL = new ClicksAL();

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new Counter();
            }
        });
    }

    public Counter() {

        clicks = 0;

        clickCounter = new JLabel("So many clicks: " + clicks);
        this.add(clickCounter);

        buttonToClick = new JButton("Click me!");
        buttonToClick.addActionListener(clicksAL);
        this.add(buttonToClick);

        buttonToReset = new JButton("Reset");
        buttonToReset.addActionListener(clicksAL);
        this.add(buttonToReset);
    }

    private void updateCounter() {
        clickCounter.setText("So many clicks: " + clicks);
    }

    private class ClicksAL implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            if (e.getSource().equals(buttonToClick)) {
                clicks++;
            } else if (e.getSource().equals(buttonToReset)) {
                clicks = 0;
            }
            updateCounter();
        }
    }
}
