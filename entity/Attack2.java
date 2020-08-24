package entity;

import java.awt.Graphics;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.Random;

import javax.imageio.ImageIO;
//敌机子弹
public class Attack2 {
    //敌机子弹坐标
	private int a;
	private int b;
	private BufferedImage image;
	//敌机子弹伤害
	public static final int hurt2=25;
	
	
	
	
	//图片的宽高
	public static final int WIDTH = 55;//55
	public static final int HEIGHT = 40;//40
	
	//速度
	private int yspeed;
	
	Random rd = new Random();
	
	public Attack2(AirPlane plane){
		try {
			image = ImageIO.read(new File("image/zidan1.png"));
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		a = plane.getX()+40;
		
		b = plane.getY() + 20;
		
		yspeed = 2;
		
	}
	
	public void step(){
		b+=yspeed;
		
	}
	
	
		
	
	
	//绘制敌机
	public void paintAttack2(Graphics g){
		
		g.drawImage(image,a,b,20,30,null);
		
	}

	public int getX() {
		// TODO Auto-generated method stub
		return a;
	}

	public int getY() {
		// TODO Auto-generated method stub
		return b;
	}

	public int getHurt()
	{
		return this.hurt2;
	}
}