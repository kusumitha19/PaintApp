/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.paint;

/**
 *
 * @author Kusumitha P
 */
public class Rectangle extends Shape {

    @Override
    public void draw() {
        System.out.println("Rectangle drawn");
    }

    @Override
    public void move(int x, int y) {
        System.out.println("Rectangle moved");
    }

    @Override
    public void resize(double factor) {
        System.out.println("Rectangle resized");
    }

    @Override
    public void erase() {
        System.out.println("Rectangle erased");
    }    
}
