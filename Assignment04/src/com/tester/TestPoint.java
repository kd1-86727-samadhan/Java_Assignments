package com.tester;

import com.app.geometry.Point2D;

public class TestPoint {

	public static void main(String[] args) {

		Point2D p1 = new Point2D();
		p1.accept();

		Point2D p2 = new Point2D(1, 2);

		if (p1.isEqual(p2)) {
			System.out.println("Both the points are same.");
		} else {
			p1.calculateDistance(p2);
		}

	}

}
