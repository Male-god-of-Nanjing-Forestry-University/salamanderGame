package entity;

import java.awt.Graphics;
import java.awt.image.BufferedImage;
import java.io.File;
import java.util.Random;

import javax.imageio.ImageIO;

import gamejframe.GameJFrame;

public class BaoShi {

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
	//��ʯ�ı任
	public void step(){
		
	}

	
	public BaoShi(){
		
		initBaoShi();	
		//��ͼƬ��ֵ
		
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
	
	//����
		public void paintBaoShi(Graphics g){
			
				g.drawImage(image,x,y,WIDTH,HEIGHT,null );						
			}
}

