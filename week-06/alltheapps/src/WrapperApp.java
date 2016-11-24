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
    private JMenu fileMenu, day1, day2;
    private JMenuItem exit, sayHello, counter, uiControls, eventCounter, drawToImage;
    public UpdatedCounter updatedCounter = new UpdatedCounter();

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new WrapperApp();
            }
        });
    }

    public WrapperApp() {

        //getContentPane().setLayout(new FlowLayout());

        setUpPanel();

        this.addWindowListener(updatedCounter);

        menuBar = new JMenuBar();
        this.setJMenuBar(menuBar);

        setJMenuBar(menuBar);

        fileMenu = new JMenu("File");
        menuBar.add(fileMenu);

        exit = new JMenuItem("Exit");
        exit.addActionListener(this);
        fileMenu.add(exit);

        day1 = new JMenu("Day 1");
        menuBar.add(day1);

        sayHello = new JMenuItem("Hello App");
        sayHello.addActionListener(this);
        day1.add(sayHello);

        counter = new JMenuItem("Counter App");
        counter.addActionListener(this);
        day1.add(counter);

        uiControls = new JMenuItem("UI Controls");
        uiControls.addActionListener(this);
        day1.add(uiControls);

        day2 = new JMenu("Day 2");
        menuBar.add(day2);

        eventCounter = new JMenuItem("Event Counter");
        eventCounter.addActionListener(this);
        day2.add(eventCounter);

        drawToImage = new JMenuItem("Draw to Image");
        drawToImage.addActionListener(this);
        day2.add(drawToImage);

        this.setVisible(true);

    }

    private void setUpPanel() {

        this.setTitle("Menu App");
        //this.setVisible(true);
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
        getContentPane().removeAll();
        if (e.getSource().equals(eventCounter)) {
            getContentPane().add(updatedCounter);
        } else if (e.getSource().equals(drawToImage)) {
            getContentPane().add(new ImagePanel());
        } else if (e.getSource().equals(exit)){
            System.exit(0);
        } else if (e.getSource().equals(sayHello)) {
            getContentPane().add(new HelloWorld());
        } else if (e.getSource().equals(counter)) {
            getContentPane().add(new Counter());
        } else if (e.getSource().equals(uiControls)) {
            getContentPane().add(new UIControls());
        }
        this.setVisible(true);

    }
}
