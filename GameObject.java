package projekat2;

public abstract class GameObject {

	private int x;
	private int y;
	private int width;
	private int height;
	
	
	public GameObject(int x, int y, int width, int height) {
		super();
		this.setX(x);
		this.setY(y);
		this.setWidth(width);
		this.setHeight(height);
	}
	public int getX() {
		return x;
	}
	public void setX(int x) {
		this.x = x;
	}
	public int getY() {
		return y;
	}
	public void setY(int y) {
		this.y = y;
	}
	public int getWidth() {
		return width;
	}
	public void setWidth(int width) {
		if(width < 0) {
			System.out.println("Dimenzije moraju biti vece od nule");
		}else {
			this.width = width;
			}
	}
	public int getHeight() {
		return height;
	}
	public void setHeight(int height) {
		if(height < 0) {
			System.out.println("Dimenzije moraju biti vece od nule");
		}else {
			this.height = height;
		}
	}
	public boolean intersects(GameObject other) {
		
		int lijevo = this.x;
		int desno  = this.x + this.width;
	    int gore   = this.y;
	    int dolje   = this.y + this.height;

	    int lijevo2 = other.getX();
	    int desno2  = other.getX() + other.getWidth();
	    int gore2= other.getY();
	    int dolje2= other.getY() + other.getHeight();

	    if(lijevo<=lijevo2) {
	    	return false;
	    
	    } else if(desno>=desno2) {
	    	return false;
	    } else if(gore>=gore2) {
			return false;
			
		}
	    else if(dolje<=dolje2) {
	    	return false;
	    }else {
	    	return true;
	    }
	}
	@Override
	public String toString() {
		return "GameObject [x=" + x + ", y=" + y + ", width=" + width + ", height=" + height + "]";
	}
	
	
	
	
}
