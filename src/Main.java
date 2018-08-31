import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        JFrame fram = new JFrame();
        Login loginPannel = new Login();
        fram.setContentPane(new Login().getMainPanel());
        fram.pack();
        fram.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        fram.setVisible(true);

    }
}
