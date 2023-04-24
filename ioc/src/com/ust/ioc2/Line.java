package com.ust.ioc2;

public class Line {
	
	
 Point p1;
 Point p2;
 
 
 
public Line(Point p1, Point p2) {
	System.out.println("from Line(P1,P2)");
	this.p1 = p1;
this.p2 = p2;
}
public Point getp1() {
	return p1;
}
public void setp1(Point p1) {
	p1 = p1;
}
public Point getp2() {
	return p2;
}
public void setp2(Point p2) {
	p2 = p2;
}
 
public void drawLine() {
	System.out.println("from"+p1.getX()+","+p1.getY()+"..."+p2.getX()+","+p2.getY());
}
public void init() {
	System.out.println("from init()..");
}

public void destroy() {
	System.out.println("from destroy()..");
}

}
 
 

