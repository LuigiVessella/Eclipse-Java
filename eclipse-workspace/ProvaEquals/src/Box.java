import java.util.Objects;

public class Box {
	
	private int x, y;

	public Box(int x, int y) {
		super();
		this.x = x;
		this.y = y;
	}

	@Override
	public boolean equals(Object obj) {
		// TODO Auto-generated method stub
		if(obj == this) return true;
		if(!(obj instanceof Box)) return false;
		
		Box box = (Box)obj;
		
		return box.x == this.x && box.y == this.y;
		
	}

	@Override
	public int hashCode() {
		// TODO Auto-generated method stub

		return Objects.hash(x,y);
	}
	
	

}
