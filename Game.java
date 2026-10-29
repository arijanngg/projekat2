package projekat2;

import java.util.ArrayList;



public class Game {
	static ArrayList<Enemy> lista = new ArrayList<>();
	public void addEnemy(Enemy e) {
		if(e == null) {
			System.out.println("Enemy ne smije biti null");
		return;
		}else {
			lista.add(e);
		}
	}
	public void findByType(Enemy e, String tekst) {

		e.getType().toLowerCase();
		tekst.toLowerCase();
		
		if(e.getType().contains(tekst)) {
			System.out.println(e);
		}
		
		
	}
	
	

	public static void main(String[] args) {
		
		

		Player p = new Player(10, 5, 32, 32, "Player 1", 85);
		 ArrayList<Enemy> lista = new ArrayList<>();
		lista.add(new BossEnemy(20, 9, 60, 60, "Goblin BOSS", 50, 200));
		lista.add(new MeleeEnemy(12, 4, 32, 32, "Goblin warrior", 10, 50));
		lista.add(new MeleeEnemy(14, 8, 32, 32, "Goblin warrior", 10, 50));
		
		int oldHP = p.getHealth();
		int newHp= p.getHealth();
		
		for(Enemy e:lista) {
			if(p.intersects(e)) {
				System.out.println("Desila se kolizija izmedju " + p + " i " + e);
				if(e instanceof BossEnemy) {
			        
			        newHp =  oldHP -(2* e.getDamage());
			        p.setHealth(newHp);
			} else {

			        
			        newHp =  oldHP -(2* e.getDamage());
			        p.setHealth(newHp);
			
			}
				if(newHp < 0) {
					System.out.println("HP je 0, player je mrtav");
				newHp = 0;
				}
		
	
		}
		}
		
	}

}
