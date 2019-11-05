package com.fju.water;

import android.os.Bundle;

import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.snackbar.Snackbar;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    private EditText month;
    private EditText next;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        month = findViewById(R.id.edit_month);
        next = findViewById(R.id.edit_next);

        FloatingActionButton fab = findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
//                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
//                        .setAction("Action", null).show();
            }
        });
    }
    public void Btn(View view){
        Double total;
        float mon = Integer.parseInt(String.valueOf(month.getText().toString()));



        if(mon >= 1 && mon<=10 ){
            total = mon *7.35;


            new AlertDialog.Builder(MainActivity.this)
                    .setTitle("每月抄表費用")
                    .setMessage("費用" + total )
                    .setPositiveButton("OK",null)
                    .show();
        }else if (mon>=11 && mon<=30){
            total = (mon * 9.45)-21;
            new AlertDialog.Builder(MainActivity.this)
                    .setTitle("每月抄表費用")
                    .setMessage("費用" + total)
                    .setPositiveButton("OK",null)
                    .show();
        }else if (mon>=31 && mon>=50){
            total = (mon*11.55)-84;
            new AlertDialog.Builder(MainActivity.this)
                    .setTitle("每月抄表費用")
                    .setMessage("費用" + total)
                    .setPositiveButton("OK",null)
                    .show();
        }else {
            total = (mon*12.075)-110.25;
            new AlertDialog.Builder(MainActivity.this)
                    .setTitle("每月抄表費用")
                    .setMessage("費用" + total)
                    .setPositiveButton("OK",null)
                    .show();

        }

        Double totaln;
        float nex = Integer.parseInt(String.valueOf(next.getText().toString()));
        if (nex >=1  &&nex<=20){
            totaln = nex*7.35;
            new AlertDialog.Builder(MainActivity.this)
                    .setTitle("每月抄表費用")
                    .setMessage("費用" + totaln)
                    .setPositiveButton("OK",null)
                    .show();
        }else if (nex>=21&& nex<=60){
            totaln= (nex*9.45)-42;
            new AlertDialog.Builder(MainActivity.this)
                    .setTitle("每月抄表費用")
                    .setMessage("費用" + totaln)
                    .setPositiveButton("OK",null)
                    .show();
        }else if (nex>=61&&nex<=100){
            totaln =(nex*11.55)-168;
            new AlertDialog.Builder(MainActivity.this)
                    .setTitle("每月抄表費用")
                    .setMessage("費用" + totaln)
                    .setPositiveButton("OK",null)
                    .show();
        }else {
            totaln=(nex*12.075)-220.5;
            new AlertDialog.Builder(MainActivity.this)
                    .setTitle("每月抄表費用")
                    .setMessage("費用" + totaln)
                    .setPositiveButton("OK",null)
                    .show();
        }

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
