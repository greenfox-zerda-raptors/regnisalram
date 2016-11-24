import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Created by regnisalram on 11/24/16.
 */
public class WrapperApp extends JFrame implements ActionListener {

    private JPanel panel;
    private JMenuBar menuBar;
    private JMenu menu;
    private JMenuItem menuItem;

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new WrapperApp();
            }
        });
    }

    public WrapperApp() {

        setUpPanel();

        panel = new ImagePanel();
        this.add(panel);

        menuBar = new JMenuBar();
        this.setJMenuBar(menuBar);

        setJMenuBar(menuBar);

        menu = new JMenu("File");
        menuBar.add(menu);

        menuItem = new JMenuItem("Exit");
        menuItem.addActionListener(this);
        menu.add(menuItem);

        this.setVisible(true);

    }

    private void setUpPanel() {

        this.setTitle("Menu App");
        this.setVisible(true);
        this.setSize(500, 500);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setResizable(false);

        Toolkit tk = Toolkit.getDefaultToolkit();
        Dimension dimension = tk.getScreenSize();

        int xPos = (dimension.width/2 - this.getWidth()/2);
        int yPos = (dimension.height/2 - this.getHeight()/2);

        this.setLocation(xPos, yPos);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        System.exit(0);
    }
}
