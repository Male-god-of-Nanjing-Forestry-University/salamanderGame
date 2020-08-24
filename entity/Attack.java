package entity;

import java.awt.Graphics;
import java.awt.Image;

import javax.swing.ImageIcon;

//����ӵ�
public class Attack {
	
	//����
	private int x;
	private int y;
	//���
	public static final int a = 15; 
	public static final int b = 15; 
	

	//ͼƬ
	private Image image;
	//�ӵ��ٶ�
	private int yspeed;
	//�ӵ��˺�
	public static final int  hurt1=15;
	//��������
	private boolean j = false;
	

	Fighter fighter;
	public Attack(Fighter fighter) {
		x = fighter.getX_gun();
		y = fighter.getY_gun();
		image= new ImageIcon("image/zidan.png").getImage();
		yspeed = 3;
	}



	public void paintAttack(Graphics g) {
		g.drawImage(image,x+33,y,15,15,null);
	}
	public void step() {
		y-=yspeed;

	}


	public int getX() {
		return x;
	}


	public void setX(int x) {
		this.x = x;
	}


	public int getY() {
		return y;
	}


	public void setY(int y) {
		this.y = y;
	}
	
	public boolean isJ() {
		return j;
	}


	public void setJ(boolean j) {
		this.j = j;
	}

	public int getHurt()
	{
		return hurt1;
	}

}