package entity;

import java.awt.Graphics;
import java.awt.image.BufferedImage;
import java.io.File;
import java.util.Random;

import javax.imageio.ImageIO;

import gamejframe.GameJFrame;

public class BaoShi2 extends BaoShi{

	//����
		protected int x,y;
		//��ʯ�ĳ�����
		public static final int WIDTH = 20;
		public static final int HEIGHT = 20;
		//��ʯ��ͼ��
		protected BufferedImage image;
		//��ű�ʯ����ͼƬ
		protected BufferedImage image1,image2;
		protected BufferedImage[] i;
		
		//�ɵõķ���
	    protected int count = 30;
		
		Random df = new Random();
	
	

	
	
	int index = 0;
	//��ʯ�ı任
	public void step(){
		image = i[index++/80%i.length];

		//��ͬ�ı�ʯ��Ӧ��ͬ�ĵ���
		y += 3; 
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
	
	//����
		public void paintBaoShi(Graphics g){
			
				g.drawImage(image,x,y,WIDTH,HEIGHT,null );						
			}
}

