import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Created by regnisalram on 11/23/16.
 */
public class UIControls extends JFrame implements ActionListener {

    private JPanel panel;
    private JTextField textField;
    private JLabel input, memory;
    static String inputLabelText = "Last entered text: ";

    public static void main(String[] args) {

        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new UIControls();
            }
        });
    }

    public UIControls() {

        setUpPanel();

        textField = new JTextField(10);
        textField.addActionListener(this);
        panel.add(textField);

        input = new JLabel(inputLabelText);
        memory = new JLabel("Everything so far: ");
        panel.add(input);
        panel.add(memory);
    }

    public void setUpPanel() {

        this.setTitle("UI Controls");
        this.setVisible(true);
        this.setSize(400, 100);
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

    @Override
    public void actionPerformed(ActionEvent e) {
        String textFromField = textField.getText();
        input.setText(inputLabelText + textFromField);
        memory.setText(memory.getText() + textFromField + ", ");
        textField.setText("");
    }
}
