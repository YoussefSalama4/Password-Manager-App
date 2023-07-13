package gui.java.project;

import javax.swing.*;
import java.awt.*;

public class Splash extends JFrame {
    Splash(){
       setUndecorated(true);
       setSize(400,400);
       setLocationRelativeTo(null);
       uiInterfaces();
       setVisible(true);
   }

   void uiInterfaces(){

        String logoname="Password Manager";
        JLabel logo =new JLabel("");
        getContentPane().add(
        logo, SwingConstants.CENTER);
        logo.setHorizontalAlignment(JLabel.CENTER);
        logo.setFont(new Font("Arial", Font.BOLD, 40));
        logo.setForeground(Color.white);
        Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();

        getContentPane().setBackground(new Color(41,26,60));
       setVisible(true);
        try {
            for (int i = 0; i < logoname.length(); i++) {
                logo.setText(logoname.substring(0,i+1));
                Thread.sleep(200);
            }

        } catch (InterruptedException e) {
            e.printStackTrace();
        }

    }
}
