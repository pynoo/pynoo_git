package chapter07.polymophism.section773;

public class SmartPhone {
	private Button[] buttons;
	
	public SmartPhone() {
		buttons = new Button[2];
	}
	
	public void spb(Button button) { //setpowerbutton
		buttons[0]=button;
	}
	
	public void svb(Button button) { //setvolumebutton
		buttons[1]=button;
	}
	
	public void ppb() { //pushpowerbutton
		buttons[0].push();
	}
	
	public void pvb() { //pushvolumebutton
		buttons[1].push();
	}
}
