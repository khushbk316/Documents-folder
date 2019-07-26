package com.stackroute.spring.Spring_Inheritance;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class TriangleClass implements InitializingBean, DisposableBean


    {

        private String TypeofTriangle;

    public TriangleClass(String typeofTriangle, int height){
        TypeofTriangle = typeofTriangle;
        this.height = height;
    }

    public TriangleClass( int height){
        this.height = height;
    }

        public int getHeight () {
        return height;
    }

        public void setHeight ( int height){
        this.height = height;
    }

        private int height;

    public TriangleClass(String typeofTriangle) {
        TypeofTriangle = typeofTriangle;
    }

        public String getTypeofTriangle () {
        return TypeofTriangle;
    }

        public void setTypeofTriangle (String typeofTriangle){
        TypeofTriangle = typeofTriangle;
    }

        public void draw () {
        System.out.println("print the triangle of type..." + getTypeofTriangle() + "and height is..." + getHeight());
    }

        //2nd way to call initi and destroy methhod through xml file....
        public void myInit ()
        {
            System.out.println("my beans have been initialized...");
        }
        public void myDestroy ()
        {
            System.out.println("my beans have been destroyed...");
        }


        //overriding the method of initializingbean....

        public void afterPropertiesSet () throws Exception {
        System.out.println("we are in Triangle class....");

    }
//overriding method of destroybean.....

        public void destroy () throws Exception {
        System.out.println("bean has bean destroyed......");
    }
    }

