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
    private JButton delete;
    static String inputLabelText = "Last entered text: ";
    static String memoryLabelText = "Everything so far: ";

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

        textField.setBorder(BorderFactory.createLineBorder(Color.black));
        textField.setBackground(Color.pink);
        textField.setMaximumSize(new Dimension(this.getWidth(), 30));

        input = new JLabel(inputLabelText);
        memory = new JLabel(memoryLabelText);
        panel.add(input);
        panel.add(memory);

        delete = new JButton("Delete memory");
        delete.addActionListener(this);
        delete.setEnabled(false);
        panel.add(delete);
    }

    public void setUpPanel() {

        this.setTitle("UI Controls");
        this.setVisible(true);
        this.setSize(400, 400);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setResizable(false);

        Toolkit tk = Toolkit.getDefaultToolkit();
        Dimension dimension = tk.getScreenSize();

        int xPos = (dimension.width/2 - this.getWidth()/2);
        int yPos = (dimension.height/2 - this.getHeight()/2);

        this.setLocation(xPos, yPos);

        panel = new JPanel();
        this.add(panel);

        Box.createRigidArea(new Dimension(0, 20));
        panel.setLayout(new BoxLayout(panel, BoxLayout.Y_AXIS));
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource().equals(textField)) {
            String textFromField = textField.getText();
            input.setText(inputLabelText + textFromField);
            memory.setText(memory.getText() + textFromField + ", ");
            delete.setEnabled(true);
            textField.setText("");
        } else if (e.getSource().equals(delete)) {
            memory.setText(memoryLabelText);
            delete.setEnabled(false);
        }
    }
}
