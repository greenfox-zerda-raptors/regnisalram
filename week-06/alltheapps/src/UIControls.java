import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Created by regnisalram on 11/23/16.
 */
public class UIControls extends JPanel implements ActionListener {

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

        Box.createRigidArea(new Dimension(0, 20));
        this.setLayout(new BoxLayout(this, BoxLayout.Y_AXIS));

        textField = new JTextField(10);
        textField.addActionListener(this);
        this.add(textField);

        textField.setBorder(BorderFactory.createLineBorder(Color.black));
        textField.setBackground(Color.pink);
        textField.setMaximumSize(new Dimension(300, 30));

        input = new JLabel(inputLabelText);
        memory = new JLabel(memoryLabelText);
        this.add(input);
        this.add(memory);

        delete = new JButton("Delete memory");
        delete.addActionListener(this);
        delete.setEnabled(false);
        this.add(delete);
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
