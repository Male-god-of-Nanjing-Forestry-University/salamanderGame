package entity;
import java.awt.Graphics;
import java.awt.Image;
import javax.swing.ImageIcon;
public class Fighter {
	//飞机坐标
	
	static int x_gun = 270;
	static int y_gun = 650;
	//图片
	private Image image = new ImageIcon("image/fighter.png").getImage();
	//移动图片参数
	private boolean q = false;
	//移动图片
	private Image image2 = new ImageIcon("image/fighter2.png").getImage();
	//技能图片
	private Image simage = new ImageIcon("image/skill.gif").getImage();	
	//血量
	private int z = 100;
	//技能
	private boolean r = false;
	

	//调用方法
	public static int getX_gun() {
		return x_gun;
	}
	public static void setX_gun(int x_gun) {
		Fighter.x_gun = x_gun;
	}
	public static int getY_gun() {
		return y_gun;
	}
	public static void setY_gun(int y_gun) {
		Fighter.y_gun = y_gun;
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

	public int getZ() {
		return z;
	}


	public void setZ(int z) {
		this.z = z;
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
	//绘画方法
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

