package com.udacity.gradle.builditbigger;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;

import com.example.JokeDepot;
import com.udanano.mylibrary.JokeAcceptor;


public class MainActivity extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    public void tellJoke(View view){
        String joke = new JokeDepot().getJoke();
//        Toast.makeText(this,
//                joke, //the joke, which used to be 'derp'
//                Toast.LENGTH_SHORT).show();
        //I think step 3 means us to do away with this toast and use the other toast

        //step 3 says to add an intent
        Intent myIntent = new Intent(this, JokeAcceptor.class);
        myIntent.putExtra("joke", joke);
        startActivity(myIntent);
    }


}
