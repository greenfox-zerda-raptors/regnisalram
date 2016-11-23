import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Created by regnisalram on 11/23/16.
 */
public class Counter extends JFrame {

    private JPanel panel;
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

        this.setTitle("Click counter game");
        this.setVisible(true);
        this.setSize(400, 70);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setResizable(false);

        Toolkit tk = Toolkit.getDefaultToolkit();
        Dimension dimension = tk.getScreenSize();

        int xPos = (dimension.width/2 - this.getWidth()/2);
        int yPos = (dimension.height/2 - this.getHeight()/2);

        this.setLocation(xPos, yPos);

        panel = new JPanel();
        this.add(panel);

        clicks = 0;

        clickCounter = new JLabel("So many clicks: " + clicks);
        panel.add(clickCounter);

        buttonToClick = new JButton("Click me!");
        buttonToClick.addActionListener(clicksAL);
        panel.add(buttonToClick);

        buttonToReset = new JButton("Reset");
        buttonToReset.addActionListener(clicksAL);
        panel.add(buttonToReset);
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
