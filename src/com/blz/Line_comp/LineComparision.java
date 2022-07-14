package com.blz.Line_comp;

import java.util.Scanner;

import static java.lang.Math.sqrt;

class CoOrdinator {
    private int x1;
    private int y1;
    private int x2;
    private int y2;

    public int getX1() {
        return x1;
    }

    public void setX1(int x1) {
        this.x1 = x1;
    }

    public int getY1() {
        return y1;
    }

    public void setY1(int y1) {
        this.y1 = y1;
    }

    public int getX2() {
        return x2;
    }

    public void setX2(int x2) {
        this.x2 = x2;
    }

    public int getY2() {
        return y2;
    }

    public void setY2(int y2) {
        this.y2 = y2;
    }
}

public class LineComparision {
    public static void main(String[] args) {
        CoOrdinator coordinate = new CoOrdinator();

        LengthOfLine length = new Length();
        Integer line_1 = length.lenthOfLine(coordinate);
        System.out.println("Length of line: " + line_1);
        Integer line_2 = length.lenthOfLine(coordinate);
        line_Compare(line_1, line_2);


    }

    public static void line_Compare(Integer line1, Integer line2) {
        Integer compare = line1.compareTo(line2);
        if (compare.equals(-1)) {
            System.out.println(" line1 is less than line2");
        } else if (compare.equals(1)) {
            System.out.println("line1 is greater than line2");
        } else {
            System.out.println("line1 and line2 are equals");
        }
    }
}

interface LengthOfLine {
    public int lenthOfLine(CoOrdinator co);
}

class Length implements LengthOfLine {
    public int lenthOfLine(CoOrdinator coordinate) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter coordinate x1");
        coordinate.setX1(sc.nextInt());
        System.out.println("x1: " + coordinate.getX1());
        System.out.println("Enter coordinate y1");
        coordinate.setY1(sc.nextInt());
        System.out.println("y1: " + coordinate.getY1());
        System.out.println("Enter coordinate x2");
        coordinate.setX2(sc.nextInt());
        System.out.println("x2: " + coordinate.getX2());
        System.out.println("Enter coordinate y2");
        coordinate.setY2(sc.nextInt());
        System.out.println("y2: " + coordinate.getY2());
        double c = Math.pow((coordinate.getX2() - coordinate.getX1()), 2);
        double d = Math.pow((coordinate.getY2() - coordinate.getY1()), 2);
        int length_Of_Line = (int) sqrt(c + d);
        return length_Of_Line;
    }
}
