package com.company; /***  Mason Porter-Brown
 *    mp3902@bard.edu
 *    2/20/19
 *    Lab 3 RingBuffer, GuitarString and GuitarHero
 *    Collaboration Statement: I worked alone on the Guitar Hero class alone. Assisted by the websites given in Lab sheet.
 */

import edu.princeton.cs.algs4.*;

import java.awt.event.KeyEvent;

public class GuitarHero {

    public static void main(String[] args) {

        int keyTemp = 0;
        GuitarString[] gtrStrings = new GuitarString[13];
        //create all guitar strings
        for (int i = 0; i < gtrStrings.length; i++) {
            double temp = (261.6) * (Math.pow(1.05956, i - 24));
            gtrStrings[i] = new GuitarString(temp);
        }


        while (true) {

//             check if the user has typed a key; if so, process it
            while (StdDraw.hasNextKeyTyped()) {
                char key = StdDraw.nextKeyTyped();

                String keyboard = "awsedftgyhujk";
                for (int i = 0; i < keyboard.length(); i++) {

                    keyTemp = keyboard.indexOf(key);
                    if (keyTemp != -1 && keyTemp < gtrStrings.length) {
                        gtrStrings[(i + 0)].pluck();

                    }
                }
            }

            // compute the superposition of samples
            double sample = 0;
            if (keyTemp != -1 && keyTemp < gtrStrings.length) {
                sample = gtrStrings[keyTemp].sample() + sample;
            }

            // play the sample on standard audio
            StdAudio.play(sample);

            // advance the simulation of each guitar string by one step
            if (keyTemp != -1 && keyTemp < gtrStrings.length) {
                gtrStrings[keyTemp].tic();
            }
        }
    }


}