import java.awt.*;
import java.awt.event.*;

public class Events {
    Events(){
        Frame frame = new Frame();

        Button btn = new Button("Click");
        btn.setBounds(150,150,100, 25);
        frame.add(btn);


        Label mouseLoc = new Label("");
        mouseLoc.setBounds(150,30,200,25);
        frame.add(mouseLoc);

        Label pageLoad = new Label("");
        pageLoad.setBounds(150,60,200,25);
        frame.add(pageLoad);

        Label mouseClick = new Label("");
        mouseClick.setBounds(150,90,200,25);
        frame.add(mouseClick);

        btn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                mouseClick.setText("Button Clicked!!!");
            }
        });
        frame.addMouseMotionListener(new MouseMotionListener() {
            @Override
            public void mouseDragged(MouseEvent mouseEvent) {
            }

            @Override
            public void mouseMoved(MouseEvent mouseEvent) {
                String loc = "Location: ";
                loc +=MouseInfo.getPointerInfo().getLocation().x+", ";
                loc +=MouseInfo.getPointerInfo().getLocation().y;
                mouseLoc.setText(loc);
            }
        });

        frame.addWindowListener(new WindowAdapter(){
            @Override
            public void windowOpened(WindowEvent e) {
                pageLoad.setText("Window Loaded");
            }
        });

        frame.setSize(400,400);
        frame.setVisible(true);
        frame.setLayout(null);
    }
    public static void main(String[] args){
        new Events();
    }
}
