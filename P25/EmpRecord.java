import javax.swing.*; 
import java.awt.*; 
import java.awt.event.*; 
import java.sql.*;
class GridLayoutDemo extends JFrame implements ActionListener {
    JLabel one, two, three, four;
    JTextField tname, tsalary, tcode, tdesig; 
    JButton buttonSave, buttonExit, buttonReset; 
    GridLayoutDemo() {
        JPanel p1=new JPanel(); 
        p1.setLayout(new GridLayout(4,2)); 
        FlowLayout layout=new FlowLayout(); 
        JPanel p2=new JPanel(); 
        p2.setLayout(layout);
        one=new JLabel("NAME"); 
        tname=new JTextField(20); 
        two=new JLabel("CODE"); 
        tcode=new JTextField(20); 
        three=new JLabel("DESIGNATION"); 
        tdesig=new JTextField(20); 
        four=new JLabel("SALARY"); 
        tsalary=new JTextField(20); 
        buttonSave=new JButton("SAVE");
        buttonReset=new JButton("RESET"); 
        buttonExit=new JButton("EXIT"); 
        p1.add(one);
        p1.add(tname);
        p1.add(two); 
        p1.add(tcode);
        p1.add(three); 
        p1.add(tdesig);
        p1.add(four); 
        p1.add(tsalary);
        buttonSave.addActionListener(this); 
        buttonReset.addActionListener(this); 
        buttonExit.addActionListener(this); 
        p2.add(buttonSave); 
        p2.add(buttonReset); 
        p2.add(buttonExit);
        add(p1,"North");
        add(p2,"South"); 
        setVisible(true); 
        this.setSize(400,180);
    }
    public void actionPerformed(ActionEvent ae) {
        String str, mname, mdesig;
        int mcode, msal; 
        str=ae.getActionCommand(); 
        if(str.equals("RESET")) {
            tname.setText("");
            tcode.setText("");
            tdesig.setText(""); 
            tsalary.setText(""); 
            tname.requestFocus();
        }
        if(str.equals("EXIT"))
            System.exit(0);
        try {
            mname=tname.getText(); 
            mcode=Integer.parseInt(tcode.getText()); 
            mdesig=tdesig.getText(); 
            msal=Integer.parseInt(tsalary.getText()); 
            if(str.equals("SAVE")) {
                try {
                    PreparedStatement inst; 
                    Connection conn;
                    Class.forName("com.mysql.jdbc.Driver"); 
                    conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/","root","root");
                    inst=conn.prepareStatement("INSERT INTO emp VALUES(?,?,?,?)"); 
                    inst.setString(1,mname);
                    inst.setInt(2,mcode); 
                    inst.setString(3,mdesig); 
                    inst.setInt(4,msal);
                    int n=inst.executeUpdate();
                    if(n>0)
                        System.out.println("Record Inserted");
                    else
                        System.out.println("Record Not Inserted"); 
                    inst.close();
                    conn.close();
                }
                catch(ClassNotFoundException e) {
                    e.printStackTrace();
                }
                catch(SQLException w) {
                    w.printStackTrace();
                }
            }
        }
        catch(Exception ob){}
    }
}
class EmpRecord {
    public static void main(String args[]) {
        new GridLayoutDemo();
    }
}