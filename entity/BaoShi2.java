package entity;

import java.awt.Graphics;
import java.awt.image.BufferedImage;
import java.io.File;
import java.util.Random;

import javax.imageio.ImageIO;

import gamejframe.GameJFrame;

public class BaoShi2 extends BaoShi{

	//坐标
		protected int x,y;
		public int getX() {
			return x;
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
	    protected int count = 30;
		
		Random df = new Random();
	
	

	
	
	int index = 0;
	//宝石的变换
	public void step(){
		image = i[index++/50%i.length];

		//不同的宝石对应不同的掉落
		y += 4; 
	}

	
	public BaoShi2(){
		
		initBaoShi();	
		i = new BufferedImage[]{image1,image2};

		x = df.nextInt(580);
		y = -df.nextInt(580)-100-GameJFrame.HEIGHT;
	}
	protected void initBaoShi() {
		try {
			image1 = ImageIO.read(new File("image/a2.png"));
			image2 = ImageIO.read(new File("image/a0.png"));
		} catch (Exception e) {
			e.printStackTrace();
	  }
	}
	
	//绘制
		public void paintBaoShi(Graphics g){
			
				g.drawImage(image,x,y,WIDTH,HEIGHT,null );						
			}
}

