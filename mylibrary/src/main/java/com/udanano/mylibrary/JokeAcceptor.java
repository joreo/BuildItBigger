package com.udanano.mylibrary;

import android.app.Activity;
import android.os.Bundle;
import android.widget.Toast;

/**
 * Created by Rawk on 3/14/2016.
 */


public class JokeAcceptor extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);


        Bundle p = getIntent().getExtras();
        String joke = p.getString("joke");


        Toast.makeText(this,
                joke, //the joke, which used to be 'derp'
                Toast.LENGTH_SHORT).show();
    }


}
