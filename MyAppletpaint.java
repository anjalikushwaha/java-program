import java.applet.*;
import java.awt.Graphics;
import java.awt.Color;
public class MyAppletpaint extends Applet
{
	public void paint(Graphics g)
	{
		g.setColor(Color.blue);
		g.fillRoundRect(20,60,40,30,0,0);
		g.setColor(Color.red);
		g.fillOval(40,85,10,10);
		g.setColor(Color.red);
		g.fillOval(25,85,10,10);
		g.setColor(Color.red);
		g.fillRoundRect(25,65,10,10,0,0);
		g.setColor(Color.red);
		g.fillRoundRect(40,65,10,10,0,0);
		g.setColor(Color.yellow);
		g.fillRoundRect(20,25,15,10,0,0);
	}
}