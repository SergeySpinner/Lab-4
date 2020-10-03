package com.jetbrains;
import java.lang.Math;

public class Circle extends Dot {
    private double R;
    public Circle(double x, double y, double R)
    {
        super(x,y);
        this.R = R;
    }
    public boolean inside(Dot _dot)
    {
        return (Math.pow((this.x - _dot.x),2)  + Math.pow((this.y - _dot.y),2)) < R * R;
    }
}
