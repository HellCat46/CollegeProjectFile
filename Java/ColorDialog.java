import java.awt.*;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.lang.reflect.Field;

public class ColorDialog {
    ColorDialog(){
        Frame frame = new Frame();

        Label lbl = new Label("Text to show changes");
        lbl.setBounds(100,50, 100,20);

        Choice colorSelection = new Choice();
        for(Field field : Color.class.getFields()){
            colorSelection.add(field.getName());
        }
        colorSelection.setBounds(100,100, 100,20);
        colorSelection.addItemListener(new ItemListener() {
            @Override
            public void itemStateChanged(ItemEvent itemEvent) {
                try {
                    Field field = Color.class.getField(colorSelection.getSelectedItem());
                    lbl.setForeground((Color) field.get(null));
                }catch (Exception ignored){}
            }
        });

        frame.add(lbl);
        frame.add(colorSelection);
        frame.setSize(400,400);
        frame.setVisible(true);
        frame.setLayout(null);
    }
    public static void main(String[] args){
        new ColorDialog();
    }
}
