package lab6;
import javax.microedition.midlet.*;
import javax.microedition.lcdui.*;

public class KeyCodesMIDlet extends MIDlet{
	private Display  display;
	private KeyCodeCanvas canvas;

	public KeyCodesMIDlet(){
		display = Display.getDisplay(this);
		canvas  = new KeyCodeCanvas(this);
	}

	protected void startApp(){
		display.setCurrent(canvas);
	}

	protected void pauseApp(){}

	protected void destroyApp( boolean unconditional ){
		notifyDestroyed();
	}
}

