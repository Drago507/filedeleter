package drago;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class SureDialoug extends JDialog implements ActionListener{
    JLabel text = new JLabel("فایل های مورد نظر حذف خواهد شد، آیا مطمئن هستید؟");
    JPanel buttonsPanel  = new JPanel(new FlowLayout());

    JButton yes = new JButton("بله");
    JButton no = new JButton("خبر");

    String  address;
    String  extention;
    public  SureDialoug (String address, String extention){
        super.setTitle("fsdf");
        add(text,BorderLayout.NORTH);
        add(buttonsPanel,BorderLayout.SOUTH);

        buttonsPanel.add(yes);
        buttonsPanel.add(no);

        yes.addActionListener(this);
        no.addActionListener(this);

        this.address = address;
        this.extention = extention;
        this.setSize(300,100);
        this.setLocation(500,300);
        this.setModal(true);
        this.setVisible(true);

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == no ){
            this.dispose();
        }else if (e.getSource() == yes){
            Deleter.deleteFiles(address,extention);
            this.dispose();
        }
    }
}