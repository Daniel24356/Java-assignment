import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MyFrame extends JFrame implements ActionListener {
    JButton button;
    MyFrame(){

         button = new JButton();
         button.setBounds(200,100,100,50);
         button.addActionListener(this);
         button.setText("I am coder");
         button.setFocusable(false);
         button.setBounds(100,100,250,100);

        this.setTitle("JFrame title goes here");
        this.setSize(420,420);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLayout(null);
        this.setVisible(true);
        this.add(button);


    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource() == button){
          System.out.println("poo");
        }
    }
}
