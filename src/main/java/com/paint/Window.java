package com.paint;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

import com.paint.Event;
import com.paint.Frame;

/**
 *
 * @author 1da20
 */
public class Window extends Frame {
    public void open() {
        System.out.println("Window opened");
    }

    public void close() {
        System.out.println("Window closed");
    }

    public void move() {
        System.out.println("Window moved");
    }

    public void display() {
        System.out.println("Displaying window");
    }

    public void handleEvent(Event e) {
        System.out.println("Handling event: " + e.getType());
    }
}
