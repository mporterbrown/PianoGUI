package com.company; /***  Mason Porter-Brown
 *    mp3902@bard.edu
 *    2/20/19
 *    Lab 3 RingBuffer, GuitarString and GuitarHero
 *    Collaboration Statement: I worked alone on the Guitar String class. Assisted by the websites given in Lab sheet.
 */

import java.util.concurrent.ThreadLocalRandom;

public class GuitarString {
    int capacity;
    int time;
    RingBuffer r;


    GuitarString(double frequency) {
        capacity = (int) Math.ceil((44100 / frequency));
        r = new RingBuffer(capacity);
        for (int i = 0; i < capacity; i++) {
            r.enqueue(0);
        }
    }

    public void pluck() {
        double max = 0.5;
        double min = -0.5;
        for (int i = 0; i < capacity; i++) {
            double randomNum = ThreadLocalRandom.current().nextDouble(min, max);
            r.enqueue(randomNum);
        }

    }

    public void tic() {
        double newEnd = ((r.dequeue() + r.peek()) / 2) * 0.994;
        r.enqueue(newEnd);
        time++;
    }

    public double sample() {
        return r.peek();
    }

    public int time() {
        return time;
    }
}
