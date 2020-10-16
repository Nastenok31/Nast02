package com.company;

import java.lang.*;

public class TestBall {
    public static void main(String[] args) {
        Ball b1 = new Ball(132, 154);
        System.out.println(b1);
        b1.move (47, 48);
        System.out.println(b1);
        System.out.println("///////////////////////////////////");
        Ball b2 = new Ball (483, 0);
        System.out.println(b2);
        b2.move ( -37, 5);
        System.out.println(b2);
        System.out.println("///////////////////////////////////");
        Ball b3 = new Ball ( -94, -3);
        System.out.println(b3);
        b3.move (3, 6);
        System.out.println(b3);
        System.out.println("///////////////////////////////////");
    }
}