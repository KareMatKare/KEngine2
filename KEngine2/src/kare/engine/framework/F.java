package kare.engine.framework;

import java.awt.Color;
import java.awt.Frame;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;
import java.awt.image.BufferedImage;

public class F implements Runnable{
	Frame frame;
	final static int x=0,y=0,w=500,h=500;
	BufferedImage bufferedImage;
	
	public F() {
		// TODO Auto-generated constructor stub
		frame=new Frame();
		frame.addWindowListener(new WindowListener() {
			
			@Override
			public void windowOpened(WindowEvent e) {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void windowIconified(WindowEvent e) {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void windowDeiconified(WindowEvent e) {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void windowDeactivated(WindowEvent e) {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void windowClosing(WindowEvent e) {
				// TODO Auto-generated method stub
				System.exit(0);
			}
			
			@Override
			public void windowClosed(WindowEvent e) {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void windowActivated(WindowEvent e) {
				// TODO Auto-generated method stub
				
			}
		});
		frame.setBounds(x,y,w,h);
		frame.setVisible(true);
		bufferedImage=new BufferedImage(w, h, BufferedImage.TYPE_3BYTE_BGR);
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		try {
			draw();
			Thread.sleep(10);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	
	private void draw(){
		Graphics g=bufferedImage.getGraphics();
		g.setColor(Color.WHITE);
		g.fillRect(0, 0, w, h);
		Graphics gf=frame.getGraphics();
		gf.drawImage(bufferedImage, 0, 0, w,h,null);
	}

}
