/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.paint;

/**
 *
 * @author Kusumitha P
 */
public class Polygon extends Shape {
    
    @Override
    public void draw() {
        System.out.println("Polygon drawn");
    }

    @Override
    public void move(int x, int y) {
        System.out.println("Polygon moved");
    }

    @Override
    public void resize(double factor) {
        System.out.println("Polygon resized");
    }

    @Override
    public void erase() {
        System.out.println("Polygon erased");
    }

}
