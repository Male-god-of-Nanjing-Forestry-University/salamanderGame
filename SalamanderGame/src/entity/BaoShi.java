package entity;

import java.awt.Graphics;
import java.awt.image.BufferedImage;
import java.io.File;
import java.util.Random;

import javax.imageio.ImageIO;

import gamejframe.GameJFrame;

public class BaoShi {

	//坐标
	private int x1,y1,x2,y2,x3,y3;
	//宝石的长、宽
	public static final int WIDTH = 20;
	public static final int HEIGHT = 20;
	//对应的分数
	private int[] count;
	//宝石的图像
	public BufferedImage imagea,imageb,imagec;
	//存放宝石所有图片
	private BufferedImage image1,image2,image3,image4,image5,image6;
	private BufferedImage[] i1;
	private BufferedImage[] i2;
	private BufferedImage[] i3;
	Random rd = new Random();
	
	
	public int getX1() {
		return x1;
	}

	public int getY1() {
		return y1;
	}

	public int getX2() {
		return x2;
	}

	public int getY2() {
		return y2;
	}

	public int getX3() {
		return x3;
	}

	public int getY3() {
		return y3;
	}

	public int getCount(int index) {
		return count[index];
	}

	
	
	int index = 0;
	//宝石的变换
	public void step(){
		imagea = i1[index++/80%i1.length];
		imageb = i2[index++/80%i2.length];
		imagec = i3[index++/80%i3.length];
		//不同的宝石对应不同的掉落
		y1 += 2;
		y2 += 3;
		y3 += 5;
	}

	
	public BaoShi(){
		
		initBaoShi();	
		//给图片赋值
		
		i1 = new BufferedImage[]{image1,image2};
		i2 = new BufferedImage[]{image3,image4};
		i3 = new BufferedImage[]{image5,image6};
		x1 = rd.nextInt(580);
		y1 = -rd.nextInt(580)-100-GameJFrame.HEIGHT;
		x2 = rd.nextInt(580);
		y2 = -rd.nextInt(580)-100-GameJFrame.HEIGHT;
		x3 = rd.nextInt(580);
		y3 = -rd.nextInt(580)-100-GameJFrame.HEIGHT;
	}
	private void initBaoShi() {
		try {
			image1 = ImageIO.read(new File("image/c2.png"));
			image2 = ImageIO.read(new File("image/c0.png"));
			image3 = ImageIO.read(new File("image/b2.png"));
			image4 = ImageIO.read(new File("image/b0.png"));
			image5 = ImageIO.read(new File("image/a2.png"));
			image6 = ImageIO.read(new File("image/a0.png"));
		} catch (Exception e) {
			e.printStackTrace();
	  }
	}
	
	//绘制
		public void paintBaoShi(Graphics g){
			
			if(x1!=x2+20&&x2!=x3&&x1!=x3&&y1!=y2&&y2!=y3&&y1!=y3){
				g.drawImage(imagea,x1,y1,WIDTH,HEIGHT,null );
				g.drawImage(imageb,x2,y2,WIDTH,HEIGHT,null );
				g.drawImage(imagec,x3,y3,WIDTH,HEIGHT,null );
			
			
			}
		}
}
