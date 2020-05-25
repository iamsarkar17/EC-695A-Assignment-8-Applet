import java.applet.Applet;
import java.awt.*;
public class HelloWorld extends Applet
{
    // init is like main() for an application.
    // It is invoked automatically when the applet runs
    public void init()
    {
        setBackground( Color.blue );
    }
    // The paint method is invoked automatically whenever
    // the graphics screen needs to be refreshed
    public void paint( Graphics g)
    {
        String s="Hello World";
        super.paint(g);
        g.setColor( Color.blue );
        g.drawString(s, 10, 100);
    }
}
