package com.stackroute.spring.draw_triangle;

public class Point {
    private XandYCordinates pointA;
    private XandYCordinates pointB;
    private XandYCordinates pointC;
    public XandYCordinates getPointA() {
        return pointA;
    }

    public void setPointA(XandYCordinates pointA) {
        this.pointA = pointA;
    }

    public XandYCordinates getPointB() {
        return pointB;
    }

    public void setPointB(XandYCordinates pointB) {
        this.pointB = pointB;
    }

    @Override
    public String toString() {
        return "Point{" +
                "pointA=" + pointA +
                ", pointB=" + pointB +
                ", pointC=" + pointC +
                '}';
    }

    public XandYCordinates getPointC() {
        return pointC;
    }

    public void setPointC(XandYCordinates pointC) {
        this.pointC = pointC;
    }

   public void prinCordinates()
   {
       System.out.println("Cordinates of pointA are....."+getPointA().getX()+" and "+getPointA().getY()+"\n cordinates of pointB are...."+getPointB().getX()+" and "+getPointB().getY()+"\n cordinates of pointC are........."+getPointC().getX()+" and "+getPointC().getY());


   }


}
