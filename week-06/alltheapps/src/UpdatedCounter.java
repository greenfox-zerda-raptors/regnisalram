import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

/**
 * Created by regnisalram on 11/24/16.
 */
public class UpdatedCounter extends JPanel implements ActionListener, KeyListener, MouseListener, WindowListener {

    private JLabel clickCounter, mouseCounter, keyCounter, winCounter;
    private JButton buttonToClick, buttonToReset;
    private JTextField textField;
    private int clicksWithButton, mouseClicks, keyClicks, winClicks;
    private String clickText, keyText, mouseText, winText;

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new UpdatedCounter();
            }
        });
    }

    public UpdatedCounter() {

        clicksWithButton = 0;
        keyClicks = 0;
        mouseClicks = 0;
        winClicks = 0;

        keyText = "Key presses so far: ";
        clickText = "So many clicks: ";
        mouseText = "Mouse clicks so far: ";
        winText = "Window actions so far: ";

        clickCounter = new JLabel(clickText + clicksWithButton);
        this.add(clickCounter);

        buttonToClick = new JButton("Click me!");
        buttonToClick.addActionListener(this);
        buttonToClick.addMouseListener(this);
        this.add(buttonToClick);

        buttonToReset = new JButton("Reset");
        buttonToReset.addActionListener(this);
        buttonToReset.addMouseListener(this);
        this.add(buttonToReset);

        textField = new JTextField(10);
        textField.addKeyListener(this);
        textField.addMouseListener(this);
        this.add(textField);

        mouseCounter = new JLabel(mouseText);
        this.add(mouseCounter);
        this.addMouseListener(this);

        keyCounter = new JLabel(keyText);
        this.add(keyCounter);

        winCounter = new JLabel(winText);
        this.add(winCounter);

    }

    private void updateClickCounter() {
        clickCounter.setText(clickText + clicksWithButton);
    }

    private void updateKeyCounter() {
        keyClicks++;
        keyCounter.setText(keyText + keyClicks);
    }

    private void updateMouseCounter() {
        mouseClicks++;
        mouseCounter.setText(mouseText + mouseClicks);
    }

    private void updateWinCounter() {
        winClicks++;
        winCounter.setText(winText + winClicks);
    }

    // ActionListener implementation
    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource().equals(buttonToClick)) {
            clicksWithButton++;
        } else if (e.getSource().equals(buttonToReset)) {
            clicksWithButton = 0;
        }
        updateClickCounter();
    }

    // KeyListener implementation
    @Override
    public void keyTyped(KeyEvent e) {

    }

    @Override
    public void keyPressed(KeyEvent e) {
        updateKeyCounter();
    }

    @Override
    public void keyReleased(KeyEvent e) {
        updateKeyCounter();
    }

    // MouseListener implementation
    @Override
    public void mouseClicked(MouseEvent e) {
        updateMouseCounter();
    }

    @Override
    public void mousePressed(MouseEvent e) {

    }

    @Override
    public void mouseReleased(MouseEvent e) {

    }

    @Override
    public void mouseEntered(MouseEvent e) {

    }

    @Override
    public void mouseExited(MouseEvent e) {

    }

    // WindowListener implementation
    @Override
    public void windowOpened(WindowEvent e) {
        updateWinCounter();
    }

    @Override
    public void windowClosing(WindowEvent e) {

    }

    @Override
    public void windowClosed(WindowEvent e) {
        updateWinCounter();
    }

    @Override
    public void windowIconified(WindowEvent e) {
        updateWinCounter();
    }

    @Override
    public void windowDeiconified(WindowEvent e) {
        updateWinCounter();
    }

    @Override
    public void windowActivated(WindowEvent e) {
        updateWinCounter();
    }

    @Override
    public void windowDeactivated(WindowEvent e) {
        updateWinCounter();
    }
}
