package gamejpanel;

import java.awt.Graphics;
import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JPanel;

import gamejframe.GameJFrame;


public class GameJPanel extends JPanel{

	private Image[] background;
	
	
	
//待定
//	private Image showfield;
//	private Image distancefield;
	
//	Plane plane;   需要实现，玩家操控的飞机

//  四种障碍物（可以是行星、黑洞或者敌机）
//	Barrs_1[] barrs_1;
//	Barrs_2[] barrs_2;
//	Barrs_3[] barrs_3;
//	Barrs_4[] barrs_4;
	
//  Boss 最后的BOSS，打败既通关	
//  Boss boss;

// 金币，也可以换成其他的，比如宝石，燃油
//  Gold[] gold;

    public GameJPanel() {
    	background = new Image[2];
    	background[0] = new ImageIcon("image/background.jpg").getImage();
    	background[1]= new ImageIcon("image/background2.jpg").getImage();

	//  其他内容后期添加
}

    //绘画方法
    int a = 0;
    public void paint(Graphics g)
    {
    	a++;
    	g.drawImage(background[0],0,a,GameJFrame.WIDTH, GameJFrame.HEIGHT,null);
    	g.drawImage(background[1],0,a+GameJFrame.HEIGHT,GameJFrame.WIDTH, GameJFrame.HEIGHT,null);
    	if(a == GameJFrame.HEIGHT) {
    		a = 0;
    	}
    	
    	
    }
    
    
    public void action() {
    	new Thread() {
    		@Override
    		public void run() {
    			super.run();
    			while(true) {
    				repaint();
    				try {
    					Thread.sleep(0);
    				}catch(InterruptedException e)
    				{
    					e.printStackTrace();
    				}
    			}
    		}
    	}.start();
    }
}
