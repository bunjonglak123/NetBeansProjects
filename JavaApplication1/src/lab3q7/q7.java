/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab3q7;

/**
 *
 * @author bunjo
 */
// Java program to check if rectangles overlap
class q7 {

static class Point {

		double x, y;
	}
// l1.x =x1 l1.y =y1 r1.x =w r1.y =h
static boolean doOverlap(Point l1, Point r1, Point l2, Point r2) {
		
		
	
		if (l1.x == r1.x || l1.y == r1.y || l2.x == r2.x || l2.y == r2.y)
			{
					
				return false;
			}
	
	

		if (l1.x >= r2.x || l2.x >= r1.x) {
			return false;
		}

		
		if (r1.y >= l2.y || r2.y >= l1.y) {
			return false;
		}

		return true;
	}


	public static void main(String[] args) {
		Point l1 = new Point(),r1 = new Point(),
				l2 = new Point(),r2 = new Point();
		l1.x=2.5;l1.y=4; r1.x=2.5;r1.y=43;
		l2.x=1.5;l2.y=5; r2.x=6 ;r2.y=3;

		if (doOverlap(l1, r1, l2, r2)) {
			System.out.println("Rectangles Overlap");
		} else {
			System.out.println("Rectangles Don't Overlap");
		}
	}
}

