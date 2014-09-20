package com.example.fun.funfacts;

import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.example.fun.funfacts.R;

import java.util.Random;

/**
 * Created by billaros on 21/9/2014.
 */
public class FactBook {

    public String getFact() {

        String[] facts = {
                "malaka",
                "papara",
                "ante gamisou",
                "sta steria thelw gipedo",
                "kai me ena trifilo kalooooo"

        };
        // The button was clicked, so update he fact label with a new fact
        String fact = "";
        // Randomly select a fact
        Random randoGenerator = new Random(); // Construct a new Random number generrator
        int randomNumber = randoGenerator.nextInt(facts.length);
        //fact = randomNumber + "";

        fact = facts[randomNumber];

        return fact;

    }
}
