package com.universalkids.greetings;

import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.LinearLayout;
import android.widget.TextView;


public class Greeting extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.greeting_layout);

        //load the greetings into the layout
        dynamicallySetGreetings();
    }

    private void dynamicallySetGreetings()
    {
        //First load greetings list from db

        //Populate layout with greetings
        LinearLayout layout = (LinearLayout)findViewById(R.id.greetingList);
        String [] greetingList = {"Hello", "Hi", "Sup!", "How are you?" };

        for (String greeting : greetingList) {
            TextView tv = new TextView(this);
            tv.setText(greeting);

            layout.addView(tv);
        }
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_greeting, menu);
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
}
