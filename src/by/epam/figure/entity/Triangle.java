/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package by.epam.figure.entity;

import by.epam.figure.holder.DataHolder;
import by.epam.figure.observer.TriangleObserver;

import java.util.ArrayList;
import java.util.Iterator;


/**
 * @author Acer
 */
public class Triangle {

    private Point a;
    private Point b;
    private Point c;

    private ArrayList<TriangleObserver> observerList = new ArrayList<>();

    public Triangle(Point a, Point b, Point c) {
        this.a = a;
        this.b = b;
        this.c = c;
        notifyObserver();

    }

    public void setA(Point a) {

        this.a = a;
        addObserver(DataHolder.getInstance());
        notifyObserver();
    }

    public Point getA() {

        return a;
    }

    public void setB(Point b) {

        this.b = b;
        addObserver(DataHolder.getInstance());
        notifyObserver();
    }

    public Point getB() {

        return b;
    }

    public void setC(Point c) {

        this.c = c;
        addObserver(DataHolder.getInstance());
        notifyObserver();
    }

    public Point getC() {

        return c;
    }


    public void addObserver(TriangleObserver observer) {

        observerList.add(observer);
    }

    public void removeObserver(TriangleObserver observer)
    {
        observerList.remove(observer);
    }
    public void notifyObserver() {
        Iterator it = observerList.iterator();
        while (it.hasNext()) {
            ((TriangleObserver) it.next()).update(this);
        }
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Triangle triangle = (Triangle) o;

        if (!a.equals(triangle.a)) return false;
        if (!b.equals(triangle.b)) return false;
        return c.equals(triangle.c);
    }

    @Override
    public int hashCode() {
        int result = a.hashCode();
        result = 31 * result + b.hashCode();
        result = 31 * result + c.hashCode();
        return result;
    }

    @Override
    public String toString() {
        return "Triangle{" +
                "a=" + a +
                ", b=" + b +
                ", c=" + c +
                '}';
    }
}




