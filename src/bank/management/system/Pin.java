package bank.management.system;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Pin extends JFrame implements ActionListener{
    JTextField pin,repin;
    JButton change,back;
    String pinnumber;
    Pin(String pinnumber){
        this.pinnumber=pinnumber;
        setSize(800,800);
        setLocation(300,0);
        setLayout(null);
        setVisible(true);
        
        ImageIcon i1=new ImageIcon(ClassLoader.getSystemResource("icons/atm.jpg"));
        Image i2=i1.getImage().getScaledInstance(800,800,Image.SCALE_DEFAULT);
        ImageIcon i3=new ImageIcon(i2);
        JLabel image=new JLabel(i3);
        image.setBounds(0,0,800,800);
        add(image);
        
        JLabel text=new JLabel("Change Your Pin");
        text.setForeground(Color.WHITE);
        text.setFont(new Font("System",Font.BOLD,16));
        text.setBounds(210,280,500,35);
        image.add(text);
        
         JLabel pintext=new JLabel("New PIN: ");
        pintext.setForeground(Color.WHITE);
        pintext.setFont(new Font("System",Font.BOLD,16));
        pintext.setBounds(165,320,180,25);
        image.add(pintext);
        
        pin=new JTextField();
        pin.setFont(new Font("Raleway",Font.BOLD,25));
        pin.setBounds(320,320,100,25);
        image.add(pin);
        
         JLabel repintext=new JLabel("Re-Enter New PIN: ");
        repintext.setForeground(Color.WHITE);
        repintext.setFont(new Font("System",Font.BOLD,16));
        repintext.setBounds(165,360,180,25);
        image.add(repintext);
        
        repin=new JTextField();
        repin.setFont(new Font("Raleway",Font.BOLD,25));
        repin.setBounds(320,360,100,25);
        image.add(repin);
        
        change=new JButton("Change");
        change.setBounds(300,400,150,30);
        image.add(change);
        change.addActionListener(this);
        
        back=new JButton("Back");
        back.setBounds(300,440,150,30);
        image.add(back);
        back.addActionListener(this);
        
       
    }
        public void actionPerformed(ActionEvent ae){
            if(ae.getSource()==change){
                 try{
                String npin=pin.getText();
                String nrepin=repin.getText();
                    if(!npin.equals(nrepin)){
                        JOptionPane.showMessageDialog(null,"Entered PIN does not match");
                        return;
                    }
                    
                    if(npin.equals("")){
                         JOptionPane.showMessageDialog(null,"Please Enter PIN");
                        return;
                    }
                     if(nrepin.equals("")){
                         JOptionPane.showMessageDialog(null,"Please Re-Enter PIN");
                        return;
                    }
                     
                     conn c=new conn();
                     String query1="update bank set pin= '"+nrepin+"' where pin='"+pinnumber+"'";
                     String query3="update signupthree set pinnumber= '"+nrepin+"' where pinnumber='"+pinnumber+"'";
                     String query2="update login set pinnumber= '"+nrepin+"' where pinnumber='"+pinnumber+"'";
                     
                     c.s.executeUpdate(query1);
                     c.s.executeUpdate(query2);
                     c.s.executeUpdate(query3);
                     JOptionPane.showMessageDialog(null," PIN Updated Succesfully");
                     
                     setVisible(false);
                     new Transactions(nrepin).setVisible(true);
                 }catch(Exception  e){
                    System.out.println(e);
                }
                
            }else{
                setVisible(false);
                new Transactions(pinnumber).setVisible(true);
            }
           
        }
    public static void main(String args[]){
        new Pin("").setVisible(true);
    }
}
