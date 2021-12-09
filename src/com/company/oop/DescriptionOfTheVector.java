package com.company.oop;

import java.util.ArrayList;
import java.util.Collections;


public class DescriptionOfTheVector {
    private double x;
    private double y;
    private double z;

    public DescriptionOfTheVector(double x, double y, double z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }

    public double VectorLength() {
        return Math.sqrt((x * x) + (y * y) + (z * z));
    }

    public double scalarProduct(DescriptionOfTheVector a) {
        return (this.x * a.x + this.y * a.y + this.z * a.z);
    }

    public DescriptionOfTheVector VectorProductWithAnotherVector(DescriptionOfTheVector a) {
        return new DescriptionOfTheVector(this.y * a.z - this.z * a.y, this.z * a.x - this.x * a.z, this.x * a.y - this.y * a.x);
    }

    public double AngleBetweenVectors(DescriptionOfTheVector a) {
        return (this.scalarProduct(a) / Math.abs(this.VectorLength()) * Math.abs(a.VectorLength()));
    }

    public DescriptionOfTheVector SummsVector(DescriptionOfTheVector a) {
        return new DescriptionOfTheVector(this.x + a.x, this.y + a.y, this.z + a.z);
    }

    public DescriptionOfTheVector DifferencesVector(DescriptionOfTheVector a) {
        return new DescriptionOfTheVector(this.x - a.x, this.y - a.y, this.z - a.z);
    }

    public static ArrayList<DescriptionOfTheVector> ArrayVectors(int n) {
        ArrayList<DescriptionOfTheVector> c = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            c.add(new DescriptionOfTheVector(Math.random() * 10, Math.random() * 10, Math.random() * 10));
        }
        return c;
    }
}


