package drago;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class DialogFrame extends JDialog implements  ActionListener {
    JPanel  fieldsPanel = new JPanel(new FlowLayout());
    JTextField address = new JTextField(20);
    JLabel addressLabel = new JLabel("دایرکتوری");
    JTextField extention = new JTextField(5);
    JLabel extentionLabel = new JLabel("فرمت");

    JButton delete = new JButton("Delete Files");

    public DialogFrame (){
        add(fieldsPanel,BorderLayout.CENTER);
        fieldsPanel.add(addressLabel);
        fieldsPanel.add(address);
        fieldsPanel.add(extentionLabel);
        fieldsPanel.add(extention);

        add(delete,BorderLayout.SOUTH);
        delete.addActionListener(this);
        this.setResizable(false);
        this.setSize(300,120);
        this.setLocation(500,300);
        this.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent ae) {
            if (ae.getSource() ==  delete){
                SureDialoug del = new SureDialoug(address.getText(),'.' + extention.getText() ) ;
            }

    }

    public static void main(String args[]) throws Exception {
        DialogFrame firstDialog = new DialogFrame();
    }
}
