package gamejpanel;

import java.awt.Graphics;
import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JPanel;

import gamejframe.GameJFrame;


public class GameJPanel extends JPanel{

	private Image[] background;
	
	
//����
//	private Image showfield;
//	private Image distancefield;
	
//	Plane plane;   ��Ҫʵ�֣���Ҳٿصķɻ�

//  �����ϰ�����������ǡ��ڶ����ߵл���
//	Barrs_1[] barrs_1;
//	Barrs_2[] barrs_2;
//	Barrs_3[] barrs_3;
//	Barrs_4[] barrs_4;
	
//  Boss ����BOSS����ܼ�ͨ��	
//  Boss boss;

// ��ң�Ҳ���Ի��������ģ����籦ʯ��ȼ��
//  Gold[] gold;

    public GameJPanel() {
    	background = new Image[2];
    	background[0] = new ImageIcon("image/background.jpg").getImage();
    	background[1] = new ImageIcon("image/background2.jpg").getImage();

	//  �������ݺ������
}

    //�滭����
    int a = 0;
    public void paint(Graphics g)
    {
    	a++;
    	g.drawImage(background[0],0,a,GameJFrame.WIDTH, GameJFrame.HEIGHT,null);
    	g.drawImage(background[1],0,a+GameJFrame.HEIGHT,GameJFrame.WIDTH, GameJFrame.HEIGHT,null);
    	if(a == GameJFrame.HEIGHT) {
    		a=0;
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
    					Thread.sleep(10);
    				}catch(InterruptedException e)
    				{
    					e.printStackTrace();
    				}
    			}
    		}
    	}.start();
    }
}
