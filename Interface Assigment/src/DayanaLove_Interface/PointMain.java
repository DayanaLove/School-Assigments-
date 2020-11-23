package DayanaLove_Interface;

public class PointMain {

	
	public static void main(String[] args) throws CloneNotSupportedException {
		// TODO Auto-generated method stub
		Point p1 = new Point(3, 4);
		Point p2 = new Point(3.4, 1.4); 
		Point p3=p2;
		
		System.out.println("p1.equals(p2):" + p1.equals(p2));
		System.out.println("p2.equals(p3):"+ p2.equals(p3));
		System.out.println("p1.compareTo(p2):" + p1.compareTo(p2));
		System.out.println("p2.compareTo(p3):" + p2.compareTo(p3));
		Point p4= (Point)(p1.clone());
		System.out.println("p4 is a clone of p1 so it is equal: " + p4.equals(p1));
		System.out.println("p4 is a clone of p1, p4.compareTo(p1): " + p4.compareTo(p1));
	
	}

}
