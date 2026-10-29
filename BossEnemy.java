package projekat2;

public class BossEnemy extends Enemy {

	public BossEnemy(int x, int y, int width, int height, String type, int damage, int health) {
		super(x, y, width, height, type, 2*damage, health);
	}

	@Override
	public String toString() {
		return "BossEnemy [" + getType() + "] @ (" + getX() + ", " + getY() + ") " 
				+ getWidth() + "X" + getHeight() + " DMG=2X" + getDamage() + ", HP="
				+ getHealth();
	}

	
	
}
