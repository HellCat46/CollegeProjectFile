import java.awt.*;
import java.awt.event.*;
import static java.awt.GraphicsEnvironment.*;

public class FontDialog {
    private FontDialog(){
        Frame frame = new Frame();
        Label lbl = new Label("Text to show Font");
        lbl.setSize(400, 100);

        Font[] fonts = getLocalGraphicsEnvironment().getAllFonts();
        Choice fontSelection = new Choice();
        for(Font font : fonts){
            fontSelection.add(font.getName());
        }
        fontSelection.setSize( 10, 10);

        fontSelection.addItemListener(new ItemListener() {
            @Override
            public void itemStateChanged(ItemEvent itemEvent) {
                Font font = fonts[fontSelection.getSelectedIndex()];
                lbl.setFont(new Font(font.getName(), font.getStyle(), 10));
                System.out.println(fonts[fontSelection.getSelectedIndex()].getName()+fontSelection.getItem(fontSelection.getSelectedIndex()));
            }
        });


        frame.setSize(400,400);
        frame.setTitle("Font Tester");


        frame.add(lbl);
        frame.add(fontSelection);
        frame.setVisible(true);
        frame.setLayout(null);
    }
    public static void main(String[] args){
        new FontDialog();
    }
}
