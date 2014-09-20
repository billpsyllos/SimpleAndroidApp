package com.example.fun.funfacts;

import android.graphics.Color;

import java.util.Random;

/**
 * Created by billaros on 21/9/2014.
 */
public class ColorWheel{

    public int getColor() {

        String[] mColor = {
                "#39add1", // light blue
                "#3079ab", // dark blue
                "#c25975", // mauve
                "#e15258", // red
                "#f9845b", // orange
                "#838cc7", // lavender
                "#7d669e", // purple
                "#53bbb4", // aqua
                "#51b46d", // green
                "#e0ab18", // mustard
                "#637a91", // dark gray
                "#f092b0", // pink
                "#b7c0c7"  // light gray

        };
        // The button was clicked, so update he color label with a new color
        String color = "";
        // Randomly select a color
        Random randoGenerator = new Random(); // Construct a new Random number generrator
        int randomNumber = randoGenerator.nextInt(mColor.length);
        //color = randomNumber + "";

        color = mColor[randomNumber];
        int colorAsint = Color.parseColor(color);
        return colorAsint;

    }
}
