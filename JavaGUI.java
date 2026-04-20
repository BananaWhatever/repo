import javax.swing.*;

public class JavaGUI extends JFrame {
    public JavaGUI() {
        super("My GUI");
        this.setSize(400, 400);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLocationRelativeTo(null);
        this.setVisible(true);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            JavaGUI frame = new JavaGUI();
        });
    }
}