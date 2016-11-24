import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

/**
 * Created by regnisalram on 11/24/16.
 */
public class UpdatedCounter extends JFrame implements ActionListener, KeyListener, MouseListener, WindowListener {

    private JPanel panel;
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

        setUpPanel();

        clicksWithButton = 0;
        keyClicks = 0;
        mouseClicks = 0;
        winClicks = 0;

        keyText = "Key presses so far: ";
        clickText = "So many clicks: ";
        mouseText = "Mouse clicks so far: ";
        winText = "Window actions so far: ";

        clickCounter = new JLabel(clickText + clicksWithButton);
        panel.add(clickCounter);

        buttonToClick = new JButton("Click me!");
        buttonToClick.addActionListener(this);
        buttonToClick.addMouseListener(this);
        panel.add(buttonToClick);

        buttonToReset = new JButton("Reset");
        buttonToReset.addActionListener(this);
        buttonToReset.addMouseListener(this);
        panel.add(buttonToReset);

        textField = new JTextField(10);
        textField.addKeyListener(this);
        textField.addMouseListener(this);
        panel.add(textField);

        mouseCounter = new JLabel(mouseText);
        panel.add(mouseCounter);
        this.addMouseListener(this);

        keyCounter = new JLabel(keyText);
        panel.add(keyCounter);

        winCounter = new JLabel(winText);
        panel.add(winCounter);
        this.addWindowListener(this);

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

    private void setUpPanel() {

        this.setTitle("Let's count all the things!");
        this.setVisible(true);
        this.setSize(400, 200);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setResizable(false);

        Toolkit tk = Toolkit.getDefaultToolkit();
        Dimension dimension = tk.getScreenSize();

        int xPos = (dimension.width/2 - this.getWidth()/2);
        int yPos = (dimension.height/2 - this.getHeight()/2);

        this.setLocation(xPos, yPos);

        panel = new JPanel();
        this.add(panel);

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
