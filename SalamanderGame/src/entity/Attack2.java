package entity;

import java.awt.Graphics;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.Random;

import javax.imageio.ImageIO;

public class Attack2 {
    //�л��ӵ�����
	private int a;
	private int b;
	private BufferedImage image;
	
	
	
	
	
	//ͼƬ�Ŀ��
	public static final int WIDTH = 100;//55
	public static final int HEIGHT = 80;//40
	
	//�ٶ�
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
	
	
		
	
	
	//���Ƶл�
	public void paintAttack2(Graphics g){
		
		g.drawImage(image,a,b,20,30,null);
		
	}

	
}