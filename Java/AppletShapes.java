import java.applet.Applet;
import java.awt.*;

public class AppletShapes extends Applet {

    public void paint(Graphics g) {
        // Draw a rectangle
        g.setColor(Color.blue);
        g.fillRect(50, 50, 100, 50);

        // Draw an oval
        g.setColor(Color.red);
        g.fillOval(200, 50, 100, 50);

        // Draw a line
        g.setColor(Color.green);
        g.drawLine(50, 150, 300, 150);
    }
}
