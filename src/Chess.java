import javax.swing.*;
import java.awt.*;

public class Chess extends JFrame {
      void MyFrame(){
          this.setTitle("JFrame title goes here");
          this.setSize(420,420);
          this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
          this.setResizable(false);
          this.setVisible(true);

          ImageIcon image = new ImageIcon("cloud profile.jpg");
          this.setIconImage(image.getImage());
          this.getContentPane().setBackground(Color.WHITE);
      }
}
