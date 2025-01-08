package org.example;

public class Wall {
    //instance variables
    private double width;
    private double height;

    //constructors
    public Wall (double width, double height) {
        this.width = width;
        this.height = height;
    }

    //methods
    public double getWidth() {
        return width;
    }

    public double getHeight() {
        return height;
    }

    public void setWidth(double width) {
        if (width < 0) {
            this.width =0;
        } else {
            this.width = width;
        }
    }

    public void setHeight (double height) {
        if (height < 0) {
            this.height =0;
        } else {
            this.height = height;
        }
    }

    public double getArea() {
        return width*height;
    }

}
