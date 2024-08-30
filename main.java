import javax.swing.*;
import java.awt.Cursor;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Example {
    public static void main(String[] args){

        JFrame f = new JFrame();

        JTextField ilks = new JTextField();
        ilks.setBounds(50, 50, 100, 30);
        ilks.setCursor(new Cursor(Cursor.HAND_CURSOR));
        JTextField ikincis = new JTextField();
        ikincis.setBounds(200, 50, 100, 30);
        ikincis.setCursor(new Cursor(Cursor.HAND_CURSOR));
        
        JButton button = new JButton("İki sayıyı topla");
        button.setBounds(130, 100, 150, 40);
        button.setCursor(new Cursor(Cursor.HAND_CURSOR));
        button.setFocusable(false);
        
        button.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                showAlert(ilks, ikincis);
            }
        });

        f.add(ilks);
        f.add(ikincis);
        f.add(button);

        f.setSize(400, 500);
        f.setTitle("Toplama Uygulaması");
        f.setLayout(null);
        f.setCursor(new Cursor (Cursor.DEFAULT_CURSOR));
        f.setVisible(true);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setResizable(false);
    }

    public static void showAlert(JTextField ilks, JTextField ikincis){
        try {
            int toplam = Integer.parseInt(ilks.getText()) + Integer.parseInt(ikincis.getText());
            JOptionPane.showMessageDialog(null, "Toplam: " + toplam, "Toplama Sonucu", JOptionPane.INFORMATION_MESSAGE);
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "Lütfen geçerli sayılar girin", "Hata", JOptionPane.ERROR_MESSAGE);
        }
    }
}
