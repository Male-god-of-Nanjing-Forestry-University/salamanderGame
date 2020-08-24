package entity;
import java.awt.Graphics;
import java.awt.Image;
import javax.swing.ImageIcon;
public class Fighter {
	
	//�ɻ��ĳ����
	public static final int WIDTH = 80;
	public static final int HEIGHT = 80;
	//�ɻ�����
	private int x_gun = 270;
	private int y_gun = 650;
	//ͼƬ
	private Image image = new ImageIcon("image/fighter.png").getImage();
	//�ƶ�ͼƬ����
	private boolean q = false;
	//�ƶ�ͼƬ
	private Image image2 = new ImageIcon("image/fighter2.png").getImage();
	//����ͼƬ
	private Image simage = new ImageIcon("image/skill.gif").getImage();	
	//Ѫ��
	private int hp = 200;
	//����
	private boolean r = false;
	//����
	private int count;

	public int getCount() {
		return count;
	}
	public void setCount(int count) {
		this.count = count;
	}
	
	public void addCount(int count)
	{
		this.count += count;
	}
	//���÷���
	public  int getX_gun() {
		return x_gun;
	}
	public  void setX_gun(int x_gun) {
		this.x_gun = x_gun;
	}
	public  int getY_gun() {
		return y_gun;
	}
	public  void setY_gun(int y_gun) {
		this.y_gun = y_gun;
	}
	public boolean isQ() {
		return q;
	}
	public void setQ(boolean q) {
		this.q = q;
	}

	public boolean isR() {
		return r;
	}

	public void setR(boolean r) {
		this.r = r;
	}

	public int getHP() {
		return hp;
	}


	public void setHP(int hp) {
		this.hp = hp;
	}

	public Image getSimage() {
		return simage;
	}

	public void setSimage(Image simage) {
		this.simage = simage;
	}

	public Image getImage() {
		return image;
	}
	public void setImage(Image image) {
  	this.image = image;
	}
	//�滭����
    public void paintFighter(Graphics g) {
		g.drawImage(image,x_gun,y_gun,80,80,null);
		
	}
	public void paintSkill(Graphics g) {	
		g.drawImage(simage,0,200,600,300,null);
	}
	public void paintfire(Graphics g) {
		g.drawImage(image2,x_gun,y_gun+10,80,80,null);
	}
	
}

