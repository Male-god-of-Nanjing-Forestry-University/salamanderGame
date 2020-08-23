package gamejframe;

import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JFrame;


import gamejpanel.GameJPanel;


public class GameJFrame extends JFrame{

	public static final int WIDTH = 600;
	public static final int HEIGHT = 800;
	
    private GameJPanel panel;
	
	public GameJFrame()
	{
		panel = new GameJPanel();
		this.add(panel);
		panel.action();
		//����
		this.addKeyListener(panel);
		this.setSize(WIDTH,HEIGHT);
		this.setResizable(false);
	    this.setLocationRelativeTo(null);
	    Image img = new ImageIcon("image/fengmian.jpg").getImage();
        this.setIconImage(img);	
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		this.setTitle("ɳ������");
		this.setVisible(true);
	}
	public static void main(String[] args) {
		new GameJFrame();
		
	}
}
