package tppoo;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Main {
     public static void main(String[] args) {
       /*  Phone infinix= new Phone();
         Phone phone=new Phone("Tecno",30000,32);
         System.out.print("La somme retournée est :"+phone.somme());
*/
       JFrame frame = new JFrame();
       JPanel panel =new JPanel();
       panel.setLayout(new BorderLayout());
         JTextField jtl=new JTextField();
         JButton bt=new JButton("Click ici");
         JButton bt2=new JButton("Il me cliquer aussi");
         bt2.addActionListener(new ActionListener() {
             @Override
             public void actionPerformed(ActionEvent actionEvent) {
                 bt.setText("Clic moi aussi");
                 jtl.setText("Bouton 1 cliqué");
             }
         });

         bt.addActionListener(new ActionListener() {
             @Override
             public void actionPerformed(ActionEvent actionEvent) {
                 bt2.setText("Il faut me cliquer");
                 jtl.setText("Bouton 2 cliqué");
             }
         });

         panel.add(bt,BorderLayout.NORTH);
         panel.add(bt2,BorderLayout.SOUTH);
         panel.add(jtl,BorderLayout.CENTER);
         frame.setSize(600,800);

         panel.setBackground(Color.BLUE);
         frame.setContentPane(panel);
         frame.setTitle("Une petite fenetre");
         frame.setLocationRelativeTo(null);
         frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

         frame.setVisible(true);
    }
}
