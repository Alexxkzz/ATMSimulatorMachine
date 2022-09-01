package bank.management.system;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.*;

public class SignUpThree extends JFrame implements ActionListener{
    JRadioButton r1,r2,r3,r4;
    JCheckBox c1,c2,c3,c4,c5,c6,c7;
    JButton submit,cancel;
    String formno;
    SignUpThree(String formno){
        this.formno=formno;
        setLayout(null);
        setSize(850,800);
        setLocation(350,0);
        setVisible(true);
        
        JLabel l1=new JLabel("Page 3: Account Details");
        l1.setFont(new Font("Raleway",Font.BOLD,22));
        l1.setBounds(280,10,400,40);
        add(l1);
        
         JLabel type=new JLabel("Account Type");
        type.setFont(new Font("Raleway",Font.BOLD,22));
        type.setBounds(100,50,200,30);
        add(type);
        
        r1=new JRadioButton("Saving Account");
        r1.setFont(new Font("Raleway",Font.BOLD,16));
        r1.setBackground(Color.WHITE);
        r1.setBounds(100,100,250,20);
        add(r1);
        
        r2=new JRadioButton("Fixed Deposit");
        r2.setFont(new Font("Raleway",Font.BOLD,16));
        r2.setBackground(Color.WHITE);
        r2.setBounds(350,100,250,20);
        add(r2);
        
        r3=new JRadioButton("Current Account");
        r3.setFont(new Font("Raleway",Font.BOLD,16));
        r3.setBackground(Color.WHITE);
        r3.setBounds(100,130,250,20);
        add(r3);
        
        r4=new JRadioButton("Recurring Deposit Account");
        r4.setFont(new Font("Raleway",Font.BOLD,16));
        r4.setBackground(Color.WHITE);
        r4.setBounds(350,130,250,20);
        add(r4);
        
        ButtonGroup groupButton=new ButtonGroup();
        groupButton.add(r1);
        groupButton.add(r2);
        groupButton.add(r3);
        groupButton.add(r4);
        
        JLabel card=new JLabel("Card Number");
        card.setFont(new Font("Raleway",Font.BOLD,22));
        card.setBounds(100,180,200,30);
        add(card);
        
        JLabel number=new JLabel("XXXX-XXXX-XXXX-2433");
        number.setFont(new Font("Raleway",Font.BOLD,22));
        number.setBounds(330,180,250,30);
        add(number);
        
        JLabel carddetail=new JLabel("Your 16 Digit Card Number");
        carddetail.setFont(new Font("Raleway",Font.BOLD,12));
        carddetail.setBounds(100,210,300,20);
        add(carddetail);
        
        JLabel pin=new JLabel("PIN");
        pin.setFont(new Font("Raleway",Font.BOLD,22));
        pin.setBounds(100,250,200,30);
        add(pin);
        
        JLabel pdetail=new JLabel("Your 4 Digit PIN Number");
        pdetail.setFont(new Font("Raleway",Font.BOLD,12));
        pdetail.setBounds(100,280,300,20);
        add(pdetail);
        
        JLabel pnumber=new JLabel("XXXX");
        pnumber.setFont(new Font("Raleway",Font.BOLD,22));
        pnumber.setBounds(330,250,200,30);
        add(pnumber);
        
        JLabel service=new JLabel("Services Required:");
        service.setFont(new Font("Raleway",Font.BOLD,18));
        service.setBounds(100,320,400,30);
        add(service);
        
        c1=new JCheckBox("ATM Card");
        c1.setFont(new Font("Raleway",Font.BOLD,16));
        c1.setBackground(Color.WHITE);
        c1.setBounds(100,350,200,30);
        add(c1);
        
        c2=new JCheckBox("Internet Banking");
        c2.setFont(new Font("Raleway",Font.BOLD,16));
        c2.setBackground(Color.WHITE);
        c2.setBounds(350,350,200,30);
        add(c2);
        
        c3=new JCheckBox("Mobile Banking");
        c3.setFont(new Font("Raleway",Font.BOLD,16));
        c3.setBackground(Color.WHITE);
        c3.setBounds(100,380,200,30);
        add(c3);
        
        c4=new JCheckBox("Email and SMS Alerts");
        c4.setFont(new Font("Raleway",Font.BOLD,16));
        c4.setBackground(Color.WHITE);
        c4.setBounds(350,380,200,30);
        add(c4);
        
        c5=new JCheckBox("Cheque Book");
        c5.setFont(new Font("Raleway",Font.BOLD,16));
        c5.setBackground(Color.WHITE);
        c5.setBounds(100,410,200,30);
        add(c5);
        
        c6=new JCheckBox("E-Statement");
        c6.setFont(new Font("Raleway",Font.BOLD,16));
        c6.setBackground(Color.WHITE);
        c6.setBounds(350,410,200,30);
        add(c6);
        
        c7=new JCheckBox("I hereby declared that above details are correct to the best of my knowledge");
        c7.setFont(new Font("Raleway",Font.BOLD,12));
        c7.setBackground(Color.WHITE);
        c7.setBounds(100,450,600,30);
        add(c7);
        
        submit=new JButton("Submit");
        submit.setBackground(Color.BLACK);
        submit.setForeground(Color.WHITE);
        submit.setFont(new Font("Raleway",Font.BOLD,14));
        submit.setBounds(250,500,100,30);
        add(submit);
        submit.addActionListener(this);
        
        cancel=new JButton("Cancel");
        cancel.setBackground(Color.BLACK);
        cancel.setForeground(Color.WHITE);
        cancel.setFont(new Font("Raleway",Font.BOLD,14));
        cancel.setBounds(420,500,100,30);
        add(cancel);
        cancel.addActionListener(this);
        
        getContentPane().setBackground(Color.WHITE);
        
    }
    public void actionPerformed(ActionEvent ae){
        if(ae.getSource()== submit){
            String accountType=null;
            if(r1.isSelected()){
                accountType="Saving Account";
            }else if(r2.isSelected()){
                accountType="Fixed Deposit Account";
            }else if(r3.isSelected()){
                accountType="Current Account";
            }else if(r4.isSelected()){
                accountType="Recurring Deposit Account";
            }
            
            Random random=new Random();
            String cardNumber="" +Math.abs((random.nextLong() %90000000L)+504096000000000L);
            String pinNumber="" +Math.abs((random.nextLong() %9000L)+1000L);
            
            String facility="";
            if(c1.isSelected()){
                facility=facility+"ATM Card";
            }else  if(c2.isSelected()){
                facility=facility+"Internet Banking";
            }else  if(c3.isSelected()){
                facility=facility+"Mobile Banking";
            }else  if(c4.isSelected()){
                facility=facility+"EMAILS AND SMS Alerts";
            }else  if(c5.isSelected()){
                facility=facility+"Cheque Book";
            }else  if(c6.isSelected()){
                facility=facility+"E-Statement";
            }
            
            try{
                if(accountType.equals("")){
                    JOptionPane.showMessageDialog(null,"Account Type is Required");
                }else{
                    conn c=new conn();
                    String q1 = "insert into signupthree values('"+formno+"','"+accountType+"','"+cardNumber+"','"+pinNumber+"','"+facility+"')";
                     String q2 = "insert into login values('"+formno+"','"+cardNumber+"','"+pinNumber+"')";
                    c.s.executeUpdate(q1);
                    c.s.executeUpdate(q2);
                    JOptionPane.showMessageDialog(null,"Card Number: "+ cardNumber+"\nPin:"+pinNumber);
                    setVisible(false);
                    new Deposite(pinNumber).setVisible(true);
                }
            }catch(Exception e){
                System.out.println(e);
            }
        }else if(ae.getSource()==cancel){
            setVisible(false);
            new Login().setVisible(true);
        }
    }
    public static void main(String args[]){
        new SignUpThree("");
    }
}
