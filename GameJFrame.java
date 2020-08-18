package gamejframe;

import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JFrame;

public class GameJFrame extends JFrame{

	private static final int DEFAULT_WIDTH = 600;
	private static final int DEFAULT_HEIGHT = 800;
	public static void main(String[] args) {
		GameJFrame frame = new GameJFrame();
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		frame.setTitle("É³ÂÞÂüÉß");
		frame.setVisible(true);
	}
	
	public GameJFrame()
	{
		this.setSize(DEFAULT_WIDTH,DEFAULT_HEIGHT);
		this.setResizable(false);
	    this.setLocationByPlatform(true);
	    
	    Image img = new ImageIcon("image/fengmian.jpg").getImage();
        this.setIconImage(img);	
	}
}
