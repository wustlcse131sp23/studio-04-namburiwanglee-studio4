package studio4;

import java.awt.Color;
import java.util.Scanner;

import edu.princeton.cs.introcs.StdDraw;

public class Flag {
	public static void main(String[] args) {
		StdDraw.clear();

		StdDraw.setXscale(0, 20);
		StdDraw.setYscale(0, 16);
		
		int canvasHeight = 512;
		int canvasWidth = 22 * canvasHeight / 16;
		StdDraw.setCanvasSize(canvasWidth, canvasHeight);
		
		StdDraw.setPenColor(255, 192, 203);
		StdDraw.filledRectangle(10, 8, 10, 8);
		
		StdDraw.setPenColor(Color.CYAN);
		StdDraw.filledRectangle(10, 5, 10, 1);
		
		StdDraw.setPenColor(230,230,250);
		StdDraw.filledRectangle(10, 9, 10, 1);
		
		StdDraw.setPenColor(255,255,0);
		StdDraw.filledRectangle(10, 13, 10, 1);
		
		
		
	}
}