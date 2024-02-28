
import java.awt.*;
import java.awt.event.*;
import java.awt.event.*;
class Sample extends Frame implements ActionListener
{
    Label l1;
    Button b1;
    Sample()
    {
        super("LEGEND");
        setSize(1000,600);
        setLayout(null);

        l1=new Label("---------");
        setBounds(75,75,100,50);
        add(l1);
        b1=new Button("clickme");
        setBounds(75,150,100,50);
        b1.addActionListener(this);
        this.add(b1);


        this.addWindowListener(new WindowAdapter() {

            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }
        });

        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        l1.setText("JOKER");

    }

public class FirstFrame {
    public static void main(String[] args) {
        Sample s1=new Sample();
    }
}
}
