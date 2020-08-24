package entity;

import java.awt.Graphics;
import java.awt.image.BufferedImage;
import java.io.File;
import java.util.Random;

import javax.imageio.ImageIO;

import gamejframe.GameJFrame;

public class BaoShi3 extends BaoShi{
	//坐标
		protected int x,y;
		public int getX() {
			return x;
		}


		public void setX(int x) {
			this.x = x;
		}


		public int getY() {
			return y;
		}
		
		//分数
		public int getCount()
		  {
			return count;
			  
		  }

		//宝石的长、宽
		public static final int WIDTH = 20;
		public static final int HEIGHT = 20;
		//宝石的图像
		protected BufferedImage image;
		//存放宝石所有图片
		protected BufferedImage image1,image2;
		protected BufferedImage[] i;
		
		//可得的分数
	    protected int count = 10;
		
		Random tr = new Random();
	
	
	
	
	int index = 0;
	//宝石的变换
	public void step(){
		image = i[index++/50%i.length];

		//不同的宝石对应不同的掉落
		y += 2; 
	}

	
	public BaoShi3(){
		
		initBaoShi();	
		i = new BufferedImage[]{image1,image2};

		x = tr.nextInt(580);
		y = -tr.nextInt(580)-100-GameJFrame.HEIGHT;
	}
	protected void initBaoShi() {
		try {
			image1 = ImageIO.read(new File("image/b2.png"));
			image2 = ImageIO.read(new File("image/b0.png"));
		} catch (Exception e) {
			e.printStackTrace();
	  }
	}
	
	//绘制
		public void paintBaoShi(Graphics g){
			
				g.drawImage(image,x,y,WIDTH,HEIGHT,null );						
			}
		
		
}



