package entity;

import java.awt.Graphics;
import java.awt.Image;
import java.awt.image.BufferedImage;
import java.util.Random;

public class Obstacles {
    
	//ͼƬ�Ŀ�͸�
	private int WIDTH;
	private int HEIGHT;
	
	//ͼƬ������
	private int x;
	private int y;
	
	protected BufferedImage image;
	private int HP;
	Random rd = new Random();
	
	
	public Obstacles(int width,int height,int hp)
	{
		this.WIDTH = width;
		this.HEIGHT = height;
		this.HP = hp;
		
		this.x = rd.nextInt(580);
		
	}
	
	protected void initObstacles()
	{
		
	}
	
	
	protected void paintObstacles(Graphics g)
	{
		
		g.drawImage(image,x,y,WIDTH,HEIGHT,null );
	}
}
