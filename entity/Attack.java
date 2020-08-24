package entity;

import java.awt.Graphics;
import java.awt.Image;

import javax.swing.ImageIcon;

//玩家子弹
public class Attack {
	
	//坐标
	private int x;
	private int y;
	//宽高
	public static final int a = 15; 
	public static final int b = 15; 
	

	//图片
	private Image image;
	//子弹速度
	private int yspeed;
	//子弹伤害
	public static final int  hurt1=15;
	//攻击参数
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