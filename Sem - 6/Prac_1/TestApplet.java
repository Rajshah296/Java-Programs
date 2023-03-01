import java.applet.*;
import java.awt.*;

public class TestApplet extends Applet
{
    public void paint(Graphics g){
        int x = getHeight();
        int y = getWidth();
        g.drawString("Raj",y/2 , x/2 );
        g.drawOval(y/2 - 100,x/2 - 100,200,200);
    }
}