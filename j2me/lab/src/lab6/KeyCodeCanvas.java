package lab6;

import javax.microedition.lcdui.Canvas;
import javax.microedition.lcdui.Command;
import javax.microedition.lcdui.CommandListener;
import javax.microedition.lcdui.Displayable;
import javax.microedition.lcdui.Graphics;

public class KeyCodeCanvas extends Canvas implements CommandListener{
	private Command exit;
	private String keyValue = null;
	private KeyCodesMIDlet midlet;

	public KeyCodeCanvas(KeyCodesMIDlet midlet){
		this.midlet = midlet;

		exit = new Command("Exit", Command.EXIT, 1);
		addCommand(exit);
		setCommandListener(this);
	} 

	protected void paint(Graphics g){
		g.setColor(255, 0, 0);
		g.fillRect(0, 0, getWidth(), getHeight());

		if (keyValue != null){
			g.setColor(0, 0, 255);
			g.drawString(keyValue, getWidth()/2, getHeight()/2, Graphics.TOP | Graphics.HCENTER);
		}
	}

	public void commandAction(Command c, Displayable d){
		String label = c.getLabel();
		if(label.equals("Exit"))
			midlet.destroyApp(true);
	}

	protected void keyPressed(int keyCode){
		keyValue = getKeyName(keyCode);
		repaint();
	}
}