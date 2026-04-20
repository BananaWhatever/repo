import javax.swing.*;
import java.awt.*;

public class JavaGUI extends JFrame {
    public JavaGUI() {
        super("My GUI");
        this.setSize(400, 400);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLocationRelativeTo(null);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            JavaGUI myGUI = new JavaGUI();
            myGUI.setVisible(true);
        });
    }
}