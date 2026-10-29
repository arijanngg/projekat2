package projekat2;

public class Enemy extends GameObject {

	private String type;
	private int damage;
	private int health;
	
	
	
	public Enemy(int x, int y, int width, int height, String type, int damage, int health) {
		super(x, y, width, height);
		this.setType(type);
		this.setDamage(damage);
		this.setHealth(health);
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		if(type.isEmpty()) {
			System.out.println("Tip enemija ne smije biti prazan");
		}else {
			this.type=type;
		}
	}
	public int getDamage() {
		return damage;
	}
	public void setDamage(int damage) {
		if(damage<0 || damage>100) {
			System.out.println("Damage mora biti izmedju 0 i 100");
		}else {
			this.damage = damage;
		}
	}
	public int getHealth() {
		return health;
	}
	public void setHealth(int health) {
		if(health<0 || health>100) {
			System.out.println("Health mora biti izmedju 0 i 100");
		}else {
			this.health= health;
	}
	
	
	
	
	
	}
	@Override
	public String toString() {
		return "Enemy ["+type+"] @ (" + getX() + ", "+ getY() + ")"+ getWidth() + "X"
				+ getHeight() +  ", DMG=" + damage + ", HP=" + health ;
	}
	
}
