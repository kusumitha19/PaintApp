/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.paint;

/**
 *
 * @author gayat
 */
public class PaintApp {
    public static void main(String[] args) {

        Window window = new Window();
        window.open();

        Shape circle = new Circle(5, new Point(10, 20));
        circle.draw();
        circle.resize(2);

        Shape rect = new Rectangle();
        rect.draw();

        window.display();
        window.close();
    }
}
