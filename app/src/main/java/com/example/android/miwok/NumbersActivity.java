package com.example.android.miwok;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.LinearLayout;
import android.widget.TextView;

import java.util.ArrayList;

public class NumbersActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_numbers);

        //Create an array of words
        ArrayList<String> words = new ArrayList<String>();
        words.add("one");
        words.add("two");
        words.add("three");
        words.add("four");
        words.add("five");
        words.add("six");
        words.add("seven");
        words.add("eight");
        words.add("nine");
        words.add("ten");

        // Find the root view of whole layout
        LinearLayout rootView = (LinearLayout) findViewById(R.id.rootView);

        //Create a loop to diaplay the list
        int count = 0;

        while (count < words.size()) {

            //display the word from list
            TextView wordView = new TextView(this);
            wordView.setText(words.get(count));
            rootView.addView(wordView);

            //update counter
            count++;

        }


    }
}
