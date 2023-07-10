import javax.swing.*; 
import java.awt.*; 
import java.awt.event.*;
class VowelDemo extends JFrame implements ActionListener {
    JLabel one, two; 
    JTextField tstr, tres; 
    JButton b1, b2, b3; 
    VowelDemo() {
        JPanel p1=new JPanel(); 
        p1.setLayout(new GridLayout(2, 2)); 
        FlowLayout layout=new FlowLayout();
        JPanel p2=new JPanel(); 
        p2.setLayout(layout);
        one=new JLabel(" Enter String: ");
        tstr=new JTextField(20); 
        two=new JLabel(" Result"); 
        tres=new JTextField(20); 
        b1=new JButton("CountVowel"); 
        b2=new JButton("Reset"); 
        b3=new JButton("Exit"); 
        p1.add(one);
        p1.add(tstr);
        p1.add(two);
        p1.add(tres);
        p2.add(b1);
        p2.add(b2);
        p2.add(b3); 
        b1.addActionListener(this); 
        b2.addActionListener(this); 
        b3.addActionListener(this); 
        add(p1,"North");
        add(p2,"South"); 
        setVisible(true); 
        this.setSize(300,180);
    }
    public void actionPerformed(ActionEvent ae) {
        String str, vstr;
        char ch;
        int ln, c=0; 
        str=ae.getActionCommand(); 
        try {
            vstr=tstr.getText();
            if(str.equals("CountVowel")) {
                ln=vstr.length();
                for (int i=0; i<ln; i++) {
                    ch=vstr.charAt(i); 
                    ch=Character.toUpperCase(ch); 
                    switch(ch) {
                        case 'A':
                        case 'E':
                        case 'I':
                        case 'O':
                        case 'U': 
                            c++;
                        break;
                    }
                }
                tres.setText(Integer.toString(c));
            }
            else if(str.equals("Reset")) {
                tstr.setText("");
                tres.setText(""); 
                tstr.requestFocus();
            }
            else if(str.equals("Exit"))
                System.exit(0);
        }
        catch(Exception ob){}
    }
}
public class GUIDemo {
    public static void main(String args[]) {
        new VowelDemo();
    }
}