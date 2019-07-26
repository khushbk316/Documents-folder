package com.stackroute.spring.draw_triangle;


public class Triangle
{
    private String TypeofTriangle;

    public Triangle(String typeofTriangle, int height) {
        TypeofTriangle = typeofTriangle;
        this.height = height;
    }

    public Triangle(int height) {
        this.height = height;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    private int height;

    public Triangle(String typeofTriangle) {
        TypeofTriangle = typeofTriangle;
    }

    public String getTypeofTriangle() {
        return TypeofTriangle;
    }

    public void setTypeofTriangle(String typeofTriangle) {
        TypeofTriangle = typeofTriangle;
    }
    public void draw()
    {
        System.out.println("print the triangle of type..."+getTypeofTriangle()+"and height is..."+getHeight());
    }
}