import java.awt.*;
import java.awt.event.TextEvent;
import java.awt.event.TextListener;
import java.lang.reflect.Field;

public class BgColor {
    BgColor(){
        Frame frame = new Frame();

        TextField colorInput = new TextField();
        colorInput.setBounds(150,150,100, 25);

        colorInput.addTextListener(new TextListener() {
            @Override
            public void textValueChanged(TextEvent textEvent) {
                try {
                    Field field = Color.class.getField(colorInput.getText());
                    frame.setBackground((Color) field.get(null));
                }catch (Exception ignored){}
            }
        });

        frame.add(colorInput);
        frame.setSize(400, 400);
        frame.setLayout(null);
        frame.setVisible(true);
    }
    public static void main(String[] args){
        new BgColor();
    }
}
