package org.system;

public class Desktop extends Computer {

	public float desktopSize() {
		float size=18.5f;
		return size;
	}
	public static void main(String[] args) {
		Desktop myDesk=new Desktop();
		//from the sub class
		myDesk.desktopSize();
		float myDesksize=myDesk.desktopSize();
		System.out.println("My desktop Size is  " + myDesksize);
		//from super class
		String myDeskModel=myDesk.computerModel();
		System.out.println("My desktop model is  " + myDeskModel); 
			
		}
	}

