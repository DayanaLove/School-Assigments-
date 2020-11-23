package DayanaLove_Interface;

public class Point implements Cloneable, Comparable<Point> {
	
 double x=0;
 double y=0;


 public double getX() {
	 return this.x;
 } 
 
 public double getY() {
	 return this.y;
 }
 
 Point(){}
 
 Point(double x, double y){
	 this.x=x;
	 this.y=y;
}
 

public int compareTo(Point o) {
	
	if (computeL() > o.computeL())
return 1;

else if (computeL() < o.computeL())

return -1;

else;

return 0;	

}

public double computeL() {
	 double xsquared=Math.pow(x, 2); 
	 double ysquared=Math.pow(y, 2); 
	 double  L= Math.sqrt(xsquared+ysquared);
	return L;
}

@Override
public boolean equals(Object o){
	Point p = (Point) o;
	
	 if (getX() == p.getX() && getY() == p.getY())
		 return true;
	 else 
		 return false;
		 
}

@Override
public String toString(){
	return "[" + x + y + "]"; 
}

@Override
public Object clone() throws CloneNotSupportedException  {
	Point pointClone = (Point)super.clone();
	return pointClone;
	}

}








	 
 
 
