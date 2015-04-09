package kare.drawer.drawer;

import java.awt.Graphics;

public class Drawer {
	private static Drawer drawer;
	private Graphics g;
	private Painter painter;
	
	
	private Drawer(){}
	public static Drawer getDrawer(){
		if(drawer==null)drawer=new Drawer();
		return drawer;
	}
	public void setGraphics(Graphics g) {
		this.g = g;
	}
	
	
	public void drawRect(){
	
	}
	
	
	public Painter getPainter() {
		return painter;
	}
	public void setPainter(Painter painter) {
		this.painter = painter;
	}
	
	

}
