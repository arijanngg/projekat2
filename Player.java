package projekat2;

public class Player extends GameObject {

	private String name;
	private int health;
	
	
	public Player(int x, int y, int width, int height, String name, int health) {
		super(x, y, width, height);
		this.setName(name);
		this.setHealth(health);
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		if(name.isBlank()) {
			System.out.println("Name ne smije biti prazno");
		}else {
			this.name=name;
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
		return "Player ["+name+"] @ ("+ getX() +","+getY()+")" + getWidth() + "X"
				+ getHeight() + "HP=" + health ;
	}
	
	
	
}
