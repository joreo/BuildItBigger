package com.udanano.mylibrary;

import android.app.Activity;
import android.os.Bundle;
import android.widget.TextView;


public class JokeAcceptor extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.joke_shower);


        Bundle p = getIntent().getExtras();
        String joke = p.getString("joke");

        TextView textView = (TextView) findViewById(R.id.joke);
        textView.setText(joke);

        //let's see if we can reuse a layout and change the "click button" text to the joke?
        //update: too much of a pain to access another area's R.
//        Toast.makeText(this,
//                joke,
//                Toast.LENGTH_SHORT).show();
    }


}
