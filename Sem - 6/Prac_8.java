import java.awt.*;
import java.awt.event.*;

public class Prac_8 extends Frame implements ActionListener{

    Button btn1;
    @Override
    public void actionPerformed(ActionEvent e) 
    {
        if(getBackground() == Color.red){
            setBackground(Color.GREEN);
        }
        else if(getBackground() == Color.green){
            setBackground(Color.blue);
        }
        else{
            setBackground(Color.RED);
        }
    }

    Prac_8(){
        setSize(500,500);
        this.setBackground(Color.red);
        setVisible(true);        
        setTitle("Frame 1");
        setLayout(new FlowLayout());
        addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e){
                System.exit(0);
            }
        });
        btn1 = new Button("Click");
        btn1.addActionListener(this);
        add(btn1);
    }


    public static void main(String args[]){
        Prac_8 p_8 = new Prac_8();
    }
}