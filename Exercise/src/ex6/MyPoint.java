package ex6;

public class MyPoint {
		int x;
		int y;

		MyPoint(int x, int y) {
			this.x = x;
			this.y = y;
		}
		double getDistance(int dx, int dy) {
			return Math.sqrt((dx-x)*(dx-x)+(dy-y)*(dy-y));
		}
		double getDistance(MyPoint p) {
			return Math.sqrt((p.x-x)*(p.x-x)+(p.y-y)*(p.y-y));
		}
		
	
	}
