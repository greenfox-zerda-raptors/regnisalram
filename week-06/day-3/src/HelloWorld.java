import javax.swing.*;

/**
 * Created by regnisalram on 11/23/16.
 */
public class HelloWorld extends JFrame{

    private JPanel panel;

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new HelloWorld();
            }
        });
    }

    public HelloWorld() {

        this.setTitle("Main Frame Title Goes Here");
        this.setVisible(true);
        this.setSize(300, 300);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);

        panel = new JPanel();
        this.add(panel);
        panel.add(new JLabel("Hello User!"));
        greetings();

    }

    public void greetings() {

        String[] hellos = {"Mirëdita", "Ahalan", "Parev", "Zdravei", "Nei Ho", "Dobrý den", "Ahoj", "Goddag", "Goede dag, Hallo", "Hello", "Saluton", "Hei", "Bonjour",
                "Guten Tag", "Gia'sou", "Aloha", "Shalom", "Namaste", "Namaste", "Jó napot", "Halló", "Helló", "Góðan daginn", "Halo", "Aksunai", "Qanuipit", "Dia dhuit",
                "Salve", "Ciao", "Kon-nichiwa", "An-nyong Ha-se-yo", "Salvëte", "Ni hao", "Dzien' dobry", "Olá", "Bunã ziua", "Zdravstvuyte", "Hola", "Jambo", "Hujambo", "Hej",
                "Sa-wat-dee", "Merhaba", "Selam", "Vitayu", "Xin chào", "Hylo", "Sut Mae", "Sholem Aleychem", "Sawubona"};


        for (String hello : hellos) {
            panel.add(new JLabel(hello));
        }
    }

}


