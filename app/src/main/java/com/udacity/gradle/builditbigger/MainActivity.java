package com.udacity.gradle.builditbigger;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Toast;

import com.joreo.JokeDepot;
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

        //If I'm understanding correctly:
        //1st we were to just display a joke in a toast
        //2nd we were to get the joke from the java lib and send it to the JokeAcceptor as an extra
        //3rd now that we have GCE running, we get the joke from the GCE which is getting it from
        // the java lib. What it returns is then launched into the JokeAcceptor
        String joke = new JokeDepot().getJoke();

        //AsyncTask  getting my joke

        new JokeAsync() {
            @Override
            protected void onPostExecute(String s) {
                if (s != null) {
                    startActivity(launchJoke(MainActivity.this, s));
                } else {
                    Toast.makeText(MainActivity.this, "No Joke Available", Toast.LENGTH_LONG).show();
                }

            }
        }.execute();


  }
    public static Intent launchJoke(Context context, String joke){
        Intent myIntent = new Intent(context, JokeAcceptor.class);
        myIntent.putExtra("joke", joke);
        return(myIntent);
    }

}
