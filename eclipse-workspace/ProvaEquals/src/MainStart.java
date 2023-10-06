
public class MainStart {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Box box1 = new Box(5,5);
		Box box2 = new Box(5,5);
		//Box box3 = box1;
		
		if(box1.equals(box2)) {
			System.out.println("sono uguali");
		}
		
		else System.out.println("non sono uguali");
		
		System.out.println(box1.hashCode() + "\n" + box2.hashCode());

	}
}
