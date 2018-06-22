import java.applet.*;
import java.awt.Graphics;
import java.awt.Color;
public class MyAppletClass3 extends Applet
{
	public void paint(Graphics g)
	{
		g.setColor(Color.red);
		g.fillOval(40,20,100,100);
		g.setColor(Color.yellow);
		g.fillOval(50,30,110,110);
	}
}