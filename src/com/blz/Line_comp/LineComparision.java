package com.blz.Line_comp;

import java.util.Scanner;

import static java.lang.Math.sqrt;

public class LineComparision {
    static int x1;
    static int y1;
    static int x2;
    static int y2;

    public static void main(String[] args) {
        System.out.println("Welcome to line comparision computation");
        LineComparision line2 = new LineComparision();
        Integer Line1 = Integer.valueOf(line2.length_of_line());
        System.out.println("length of first line: " + Line1);
        Integer Line2 = Integer.valueOf(line2.length_of_line());
        System.out.println("length of second line: " + Line2);
        Integer compare = Line1.compareTo(Line2);
        if (compare.equals(-1)) {
            System.out.println(" line1 is less than line2");
        } else if (compare.equals(1)) {
            System.out.println("line1 is greater than line2");
        } else {
            System.out.println("line1 and line2 are equals");
        }
    }

    public int length_of_line() {
        System.out.println("Enter a co-ordinates");
        Scanner sc = new Scanner(System.in);
        x1 = sc.nextInt();
        System.out.println("x1: " + x1);
        y1 = sc.nextInt();
        System.out.println("y1: " + y1);
        x2 = sc.nextInt();
        System.out.println("x2: " + x2);
        y2 = sc.nextInt();
        System.out.println("y2: " + y2);
        double c = Math.pow((x2 - x1), 2);
        double d = Math.pow((y2 - y1), 2);
        int length_Of_Line = (int) sqrt(c + d);
        return length_Of_Line;
    }
}
