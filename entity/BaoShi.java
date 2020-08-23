package entity;

import java.awt.Graphics;
import java.awt.image.BufferedImage;
import java.io.File;
import java.util.Random;

import javax.imageio.ImageIO;

import gamejframe.GameJFrame;

public class BaoShi {

	//坐标
	protected int x,y;
	//宝石的长、宽
	public static final int WIDTH = 20;
	public static final int HEIGHT = 20;
	//宝石的图像
	protected BufferedImage image;
	//存放宝石所有图片
	protected BufferedImage image1,image2;
	protected BufferedImage[] i;
	
	//可得的分数
    protected int count;
	
	Random rd = new Random();
	
	
	public int getX() {
		return x;
	}

	public int getY() {
		return y;
	}

	public int getCount() {
		return count;
	}

	
	
	int index = 0;
	//宝石的变换
	public void step(){
		
	}

	
	public BaoShi(){
		
		initBaoShi();	
		//给图片赋值
		
		i = new BufferedImage[]{image1,image2};

		x = rd.nextInt(580);
		y = -rd.nextInt(580)-100-GameJFrame.HEIGHT;
	}
	protected void initBaoShi() {
		try {
			image1 = ImageIO.read(new File("image/c2.png"));
			image2 = ImageIO.read(new File("image/c0.png"));
		} catch (Exception e) {
			e.printStackTrace();
	  }
	}
	
	//绘制
		public void paintBaoShi(Graphics g){
			
				g.drawImage(image,x,y,WIDTH,HEIGHT,null );						
			}
}

