package com.company; /***  Mason Porter-Brown
 *    mp3902@bard.edu
 *    2/20/19
 *    Lab 3 RingBuffer, GuitarString, and GuitarHero
 *    Collaboration Statement: I worked alone on the Ring Buffer class. Assisted by the websites given in Lab sheet.
 */


import java.util.Iterator;
import java.util.NoSuchElementException;

public class RingBuffer {
    private double[] q;
    private int n;
    private int nextIn;
    private int nextOut;


    public RingBuffer(int capacity) {
        q = new double[capacity];
        n = 0;
        nextIn = 0;
        nextOut = 0;
    }

    public boolean isEmpty() {
        return n == 0;
    }

    public int size() {
        return n;
    }

    public boolean isFull() {
        return n == q.length;
    }

    public void enqueue(double val) {

        q[nextIn] = val;
        if (nextIn == nextOut) {
            nextOut = (nextOut + 1) % q.length;
        }
        if (n < q.length) {
            n++;
        }
        nextIn = (nextIn + 1) % q.length;
    }

    public double dequeue() throws IllegalArgumentException {
        if (isEmpty()) {
            throw new IllegalArgumentException("Queue is empty: Cannot dequeue from empty RingBuffer");

        }
        if (isEmpty()) {
            nextOut = 0;
            nextIn = 0;
        }

        double temp = q[nextOut];
        q[nextOut] = 0;
        n--;
        nextOut = (nextOut + 1) % q.length;


        return temp;
    }

    public double peek() throws IllegalArgumentException {
        if (isEmpty()) {
            throw new IllegalArgumentException("Cannot peek into an empty queue!");
        }

        double temp = q[nextOut];
        return temp;


    }
}

