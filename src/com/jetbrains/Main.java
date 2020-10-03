package com.jetbrains;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        double x, y, R;
        double circle_x, circle_y;
        Scanner check_console = new Scanner(System.in);

        System.out.print("Input the coordinates of dot.x: ");
        x = check_console.nextDouble();
        System.out.print("Input the coordinates of dot.y: ");
        y = check_console.nextDouble();
        Dot _dot = new Dot(x,y);

        System.out.print("Input radius of circle: ");
        R = check_console.nextDouble();

        System.out.print("Input the x of circle center: ");
        circle_x = check_console.nextDouble();

        System.out.print("Input the y of circle center: ");
        circle_y = check_console.nextDouble();

        Circle _circle = new Circle(circle_x,circle_y,R);

        System.out.println(_circle.inside(_dot));
    }
}