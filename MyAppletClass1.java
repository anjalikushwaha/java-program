import java.applet.*;
import java.awt.Graphics;
import java.awt.Color;
public class MyAppletClass1 extends Applet
{
	public void paint(Graphics g)
	{
		g.setColor(Color.red);
		g.fillOval(40,40,100,100);
		g.setColor(Color.yellow);
		g.fillOval(50,50,80,80);
		g.setColor(Color.green);
		g.fillOval(60,60,60,60);
	}
}