import org.w3c.dom.Text;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class IsOddorEven {
    IsOddorEven(){
        Frame frame = new Frame();

        Dialog alert = new Dialog(frame);
        alert.setTitle("Is Odd or Even?");

        TextField input = new TextField();
        input.setBounds(100,100,100,25);

        Button btn = new Button("Check");
        btn.setBounds(100,150, 100, 25);
        btn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                Label lbl= new Label();

                if(Integer.parseInt(input.getText()) % 2 == 0) lbl.setText("Even!!!");
                else lbl.setText("Odd!!!");
                alert.setSize(100,100);
                alert.add(lbl);
                alert.setVisible(true);
            }
        });

        frame.add(input);
        frame.add(btn);
        frame.setSize(400,400);
        frame.setVisible(true);
        frame.setLayout(null);
    }
    public static void main(String[] args) {
        new IsOddorEven();
    }
}
