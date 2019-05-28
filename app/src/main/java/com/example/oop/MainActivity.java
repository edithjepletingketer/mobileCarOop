package com.example.oop;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.util.Log;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        FloatingActionButton fab = findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });

        Car toyota=new Car("white","toyota",5,200);
        Car ford=new Car("blue", "ford",4, 180);
        Car benz=new Car("pink","benz",6,190);
        Car subaru=new Car("black","subaru",8,200);
        Car bmw=new Car("purple","bmw",10,280);

        toyota.hoot();
        toyota.carrygoods();
        toyota.accelerate(76);
        Log.d("Car","toyota speed"+toyota.getSpeed());
        bmw.getColor();
        Log.d("Car",bmw.getColor());
        Taxi taxi= new Taxi("pink","Taxi",4,160);
        taxi.hoot();

        taxi.stop();
        Log.d("Taxi ", "Taxi speed"+taxi.getSpeed());
        Sportscar sportscar=new Sportscar("orange","sporty",7,300);
        sportscar.accelerate(800);
        Log.d("Sportscar","Sportscar speed" + sportscar.getSpeed());
        sportscar.hoot();
        sportscar.hoot("Kwikwikwi");

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
}
