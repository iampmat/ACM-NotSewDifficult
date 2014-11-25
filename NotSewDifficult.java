package ProblemE;

import java.util.Scanner;

public class NotSewDifficult {
	public static final int MAX = 100000;
	public static void main(String[] args) {
		int rectangleCount;
		int currentLayerCount;
		int finalLayerCount;
		int x1, y1, x2, y2;
		
		Scanner input = new Scanner(System.in);
		
		rectangleCount = input.nextInt();
		do {
			currentLayerCount = 0;
			finalLayerCount = 0;
			rectangle r[] = new rectangle [rectangleCount];
			
			for (int i = 0; i < rectangleCount; i++) {
				r[i] = new rectangle();
				
				x1 = input.nextInt();
				y1 = input.nextInt();
				x2 = input.nextInt();
				y2 = input.nextInt();
				
				if(x1 > MAX || y1 > MAX || x2 > MAX || y2 > MAX){
					System.out.println("Value out of range");
					return;
				}
				
				r[i].setPoints( x1, y1, x2, y2 );
			}
			for (int i = 0; i < rectangleCount; i++) {
				rectangle r1 = r[i];
				for (int j = 0; j < rectangleCount; j++) {
					rectangle r2 = r[j];
					if(r1 != r2){
						if ( findOverlap( r1, r2 ) != null ) {
							r1 = findOverlap( r1, r2 );
							currentLayerCount++;	
						}	
					}
				}
				if (currentLayerCount > finalLayerCount){
					finalLayerCount = currentLayerCount;	
				}
				currentLayerCount = 0;
			}
			System.out.println(finalLayerCount);
			rectangleCount = input.nextInt();
		}while (rectangleCount > 0);
	}
	
	public static rectangle findOverlap( rectangle r1, rectangle r2) {
		
		if (r1.getx1() < r2.getx2() && r1.getx2() > r2.getx1() && r1.gety1() < r2.gety2() && r1.gety2() > r2.gety1()) {
			int xL = Math.max(r1.getx1(), r2.getx1());
			int xR = Math.min(r1.getx2(), r2.getx2());
			int yT = Math.max(r1.gety1(), r2.gety1());
		    int yB = Math.min(r1.gety2(), r2.gety2());

		    rectangle overlap = new rectangle();
		    overlap.setPoints(xL, yT, xR, yB);
			return overlap;
		}
		else{
			return null;
		}
	}
}

