import java.awt.*;
public class gridLayout {
    gridLayout(){
        Frame frame = new Frame();

        Label tl = new Label("Top Left");
        tl.setAlignment(Label.CENTER);
        Label tr = new Label("Top Right");
        tr.setAlignment(Label.CENTER);
        Label bl = new Label("Bottom Left");
        bl.setAlignment(Label.CENTER);
        Label br = new Label("Bottom Right");
        br.setAlignment(Label.CENTER);

        frame.add(tl);
        frame.add(tr);
        frame.add(bl);
        frame.add(br);
        frame.setSize(400,400);
        frame.setLayout(new GridLayout(2,2));
        frame.setVisible(true);
    }

    public static void main(String[] args){
        new gridLayout();
    }
}
