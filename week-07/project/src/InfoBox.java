import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;

/**
 * Created by regnisalram on 12/8/16.
 */
public class InfoBox extends JComponent {

    ArrayList<String> messages;

    public InfoBox() {
        messages = new ArrayList<>();
        messages.add("blabla");
        setPreferredSize(new Dimension(100, 792));
        setVisible(true);
    }

    @Override
    public void paint(Graphics graphics) {
        for (String message : messages) {
            graphics.drawString(message, 720, 10);
        }
    }
}

