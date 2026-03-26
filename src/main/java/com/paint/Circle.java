/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.paint;

/**
 *
 * @author Kusumitha P
 */
public class Circle extends Shape {
    
    public double radius;
    public Point center;

    public Circle(double radius, Point center) {
        this.radius = radius;
        this.center = center;
    }

    public double area() {
        return Math.PI * radius * radius;
    }

    @Override
    public void draw() {
        System.out.println("Circle drawn");
    }

    @Override
    public void move(int x, int y) {
        center = new Point(x, y);
    }

    @Override
    public void resize(double factor) {
        radius *= factor;
    }

    @Override
    public void erase() {
        System.out.println("Circle erased");
    }
}
