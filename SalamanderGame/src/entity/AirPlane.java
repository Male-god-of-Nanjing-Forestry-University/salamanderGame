package entity;

import java.awt.Graphics;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.Random;

import javax.imageio.ImageIO;

public class AirPlane {
	
	private int x;
	private int y;

	private BufferedImage image;
	
	
	
	
	
	//图片的宽高
	public static final int WIDTH = 100;//55
	public static final int HEIGHT = 80;//40
	
	//速度
	private int yspeed;
	Random rd = new Random();
	
	public AirPlane(){
		try {
			image = ImageIO.read(new File("image/airplane1.png"));
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		x = rd.nextInt(450)+30;
		y = rd.nextInt(10)-HEIGHT;
	
		yspeed = 1;
		
	}
	
	

	public void step(){
		y+=yspeed;
		
	}
	
	//敌机爆炸
	public void boom() {
		try {
			image = ImageIO.read(new File("image/boom.gif") );
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
				
		
	}
	
	//绘制敌机
	public void paintairplane(Graphics g){
		g.drawImage(image,x,y,WIDTH,HEIGHT,null);
		
		
	}

	public  int getX() {
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

}
