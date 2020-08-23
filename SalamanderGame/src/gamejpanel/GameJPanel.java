package gamejpanel;

import java.awt.Graphics;
import java.awt.Image;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.Arrays;
import java.util.Timer;
import java.util.TimerTask;

import javax.swing.ImageIcon;
import javax.swing.JPanel;
import entity.Attack;
import entity.Attack2;
import entity.Fighter;

import entity.BaoShi;
import entity.AirPlane;
import gamejframe.GameJFrame;


public class GameJPanel extends JPanel implements KeyListener{

	private Image[] background;
	private AirPlane[] airplane;
	Fighter fighter;
	Attack[] attack1;
	Attack attack;
	Attack2[] attack2;
	
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
    private BaoShi[] baoshi = new BaoShi[1];
   

    public GameJPanel() {
    	attack = new Attack();
    	attack1 = new Attack[0];
    	fighter = new Fighter();
    	attack2 = new Attack2[0];
    	
    	
        baoshi[0] = new BaoShi();
        airplane =new AirPlane[0];
    	background = new Image[2];
    	background[0] = new ImageIcon("image/background.png").getImage();
    	background[1]= new ImageIcon("image/background2.png").getImage();

	//  �������ݺ������
}

    //�滭����
    int a = 0;
    public void paint(Graphics g)
    {
    	
    	a++;
    	g.drawImage(background[0],0,a,GameJFrame.WIDTH, GameJFrame.HEIGHT,null);
    	g.drawImage(background[1],0,a-GameJFrame.HEIGHT,GameJFrame.WIDTH, GameJFrame.HEIGHT,null);
    	g.drawImage(background[1],0,a-2*GameJFrame.HEIGHT,GameJFrame.WIDTH, GameJFrame.HEIGHT,null);
    	g.drawImage(background[0],0,a-3*GameJFrame.HEIGHT,GameJFrame.WIDTH, GameJFrame.HEIGHT,null);
    	if(a == 3*GameJFrame.HEIGHT) {
    		a = 0;
    	}
    	fighter.paintFighter(g);
	 for(int i = 0;i<attack1.length;i++)
 	    {
 	    	attack1[i].paintAttack(g);
 	    	}
	//����
    	if(fighter.isR()==true) {
    	
    		fighter.paintSkill(g);
    		Timer timer = new Timer();// ʵ����Timer��
            timer.schedule(new TimerTask() {
                public void run() {
                	fighter.setR(false);
                    this.cancel();
                }
            }, 2000);// ����ٺ���
            
            
    	}
	if(fighter.isQ()==true) {
    		fighter.paintfire(g);
    		fighter.setQ(false);
    	}
	


    	for (int i = 0; i < baoshi.length; i++) {
			baoshi[i].paintBaoShi(g);
		}
		
    	for(int i = 0;i < airplane.length;i++) {
    		airplane[i].paintairplane(g);
    	}
    	
    	for(int i = 0;i < attack2.length;i++) {
    		attack2[i].paintAttack2(g);
    	}
    	
    	
	}
    
    
    
    public void action() {
    	new Thread() {
    		@Override
    		public void run() {
    			super.run();
    			while(true) {
    				
    			    //�ƶ�����
    				stepAction();
    				//������������
    				EnterAction();
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
    
    
    
    
    int index = 0;
    protected void EnterAction() {
    	index++;
		if(index%400==0) {
			// �����������л���������Ӷ���
			AirPlane a1 = new AirPlane();
			//����
			airplane = Arrays.copyOf(airplane,airplane.length+1);
			//��Ӷ���
			airplane[airplane.length-1] = a1;
		}
		
		for(int i=0 ;i < airplane.length ; i++ )
		{
			if(index%200==0) {
				// �����������л���������Ӷ���
				Attack2 b2 = new Attack2(airplane[i]); 
				//����
				attack2 = Arrays.copyOf(attack2,attack2.length+1);
				//��Ӷ���
				attack2[attack2.length-1] = b2;
			}
		}
		
		
		
		if(index%150 == 0)
		{
			BaoShi b = new BaoShi();
			baoshi = Arrays.copyOf(baoshi, baoshi.length+1);
		    baoshi[baoshi.length-1] = b;
			
		}
		
		//�л��ӵ�
		if(index % 100 == 0)
		{
			for(int i = 0;i < airplane.length ; i++ )
			{
				Attack2 b2 = new Attack2(airplane[i]);
				attack2 = Arrays.copyOf(attack2,attack2.length+1);
				attack2[attack2.length-1] = b2;
			}
		}
		//�ӵ�
		Attack b1 = new Attack();
	    attack1 = Arrays.copyOf(attack1,attack1.length+1);
	    attack1[attack1.length-1] = b1;
	}

    
    private void stepAction()
    {
    	for(int i = 0;i<attack1.length;i++)
		{
			attack1[i].step();
		}

	
    	for (int i = 0; i <baoshi.length; i++) {
			baoshi[i].step();
		}
    	for(int i = 0;i < airplane.length;i++) {
    		airplane[i].step();
	    }
    	
    	for(int i = 0;i < attack2.length; i++ )
    	{
    		attack2[i].step();
    	}
    }
    public void keyPressed(KeyEvent e) {
		// ��ȡ��ǰ����
		int x = Fighter.getX_gun();
		int y = Fighter.getY_gun();
		//����
		if(e.getKeyCode()==KeyEvent.VK_UP) {

			Fighter.setY_gun(y-20);
			fighter.setQ(true);

		}
		//��������
		if(Fighter.getY_gun()<=0) {
			Fighter.setY_gun(y);
		}
		//����
		if(e.getKeyCode()==KeyEvent.VK_DOWN) {

			Fighter.setY_gun(y+20);
			

		}
		//��������
		if(Fighter.getY_gun()>=GameJFrame.HEIGHT-100) {
			Fighter.setY_gun(y);
		}
		//��
		if(e.getKeyCode()==KeyEvent.VK_RIGHT) {
				Fighter.setX_gun(x+20);
			fighter.setQ(true);
			
		}
		//��������
		if(Fighter.getX_gun()>=GameJFrame.WIDTH-50) {
			Fighter.setX_gun(x);
		}
		//��
		if(e.getKeyCode()==KeyEvent.VK_LEFT) {
			Fighter.setX_gun(x-20);
			fighter.setQ(true);
			
		}
		//��������
		if(Fighter.getX_gun()<=0) {
			Fighter.setX_gun(x);
		}
		//�ż���
		if(e.getKeyCode()==KeyEvent.VK_SPACE) {
			fighter.setR(true);
	}
		//ƽa
		if(e.getKeyCode()==KeyEvent.VK_X) {
			attack.setJ(true);
			
		}

						
				
	}



	@Override
	public void keyTyped(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}



	@Override
	public void keyReleased(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}
		
}

    

				