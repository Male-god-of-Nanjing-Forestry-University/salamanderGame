package entity;

import java.awt.Graphics;
import java.awt.image.BufferedImage;
import java.io.File;
import java.util.Random;

import javax.imageio.ImageIO;

import gamejframe.GameJFrame;

public class BaoShi1 extends BaoShi{

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
	    protected int count = 50;
		
		Random rd = new Random();
	
	
	
	
	
	   int index = 0;
	   //宝石的变换
	   public void step(){
		   image = i[index++/80%i.length];

		   //不同的宝石对应不同的掉落
		   y += 7; 
	   }

	
       public BaoShi1(){
   		
		   initBaoShi();	
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

