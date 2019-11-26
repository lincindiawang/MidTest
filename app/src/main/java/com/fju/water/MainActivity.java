package com.fju.water;

import android.content.Intent;
import android.os.Bundle;

import com.google.android.material.floatingactionbutton.FloatingActionButton;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.core.util.TimeUtils;

import android.text.TextUtils;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Button;
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
        month = findViewById(R.id.month);
        next = findViewById(R.id.next);

        FloatingActionButton fab = findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
//                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
//                        .setAction("Action", null).show();
            }
        });
        Button button = findViewById(R.id.button);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
//                String MonthS = month.getText().toString();
//                String NextS = next.getText().toString();
//
//                if (!TextUtils.isEmpty(MonthS)){
//
//                    float mon = Float.parseFloat(MonthS);
//                    Double total;
//
//                    if(mon >= 1 && mon<=10 ){
//                        total = mon *7.35;
//
//                    }else if (mon>=11 && mon<=30){
//                        total = (mon * 9.45)-21;
//
//                    }else if (mon>=31 && mon>=50){
//                        total = (mon*11.55)-84;
//
//                    }else {
//                        total = (mon*12.075)-110.25;
//
//
//                    }
//                    Intent intent = new Intent(MainActivity.this,ResultActivity.class);
//                    startActivity(intent);
////            new AlertDialog.Builder(MainActivity.this)
////                    .setTitle("每月抄表費用")
////                    .setMessage("費用" + total )
////                    .setPositiveButton("OK",null)
////                    .show();
//                }else {
//                    if (!TextUtils.isEmpty(NextS)){
//                        Double total;
//                        float nex = Float.parseFloat(NextS);
//
//                        if (nex >=1  &&nex<=20){
//                            total = nex*7.35;
//
//                        }else if (nex>=21&& nex<=60){
//                            total= (nex*9.45)-42;
//
//                        }else if (nex>=61&&nex<=100){
//                            total =(nex*11.55)-168;
//
//                        }else {
//                            total=(nex*12.075)-220.5;
//
//                        }
//                        Intent intent = new Intent(MainActivity.this,ResultActivity.class);
//                        startActivity(intent);
////                        new AlertDialog.Builder(MainActivity.this)
////                                .setTitle("隔月抄表費用")
////                                .setMessage("費用" + total)
////                                .setPositiveButton("OK",null)
////                                .show();
//                    }

                //}
                Btn();
            }
        });
    }
    public void Btn(){

        String MonthS = month.getText().toString();
        String NextS = next.getText().toString();

        if (!TextUtils.isEmpty(MonthS)){

            float mon = Float.parseFloat(MonthS);
            Float fee;

            if(mon >= 1 && mon<=10 ){
                fee = mon *7.35f;

            }else if (mon>=11 && mon<=30){
                fee = (mon * 9.45f)-21f;

            }else if (mon>=31 && mon>=50){
                fee = (mon*11.55f)-84f;

            }else {
                fee = (mon*12.075f)-110.25f;


            }
            Intent intent = new Intent(this,ResultActivity.class);
            intent.putExtra("FEE", fee);
            startActivity(intent);
//            new AlertDialog.Builder(MainActivity.this)
//                    .setTitle("每月抄表費用")
//                    .setMessage("費用" + fee )
//                    .setPositiveButton(getString(R.string.OK),null)
//                    .show();
        }else {
            if (!TextUtils.isEmpty(NextS)){
//                float fee;
                float nex = Float.parseFloat(NextS);
                Float fee;

                if (nex >=1  &&nex<=20){
                    fee= nex*7.35f;

                }else if (nex>=21&& nex<=60){
                    fee= (nex*9.45f)-42f;

                }else if (nex>=61&&nex<=100){
                    fee =(nex*11.55f)-168f;

                }else {
                    fee=(nex*12.075f)-220.5f;

                }
                Intent intent = new Intent(this,ResultActivity.class);
                intent.putExtra("FEE", fee);
                startActivity(intent);
//                new AlertDialog.Builder(MainActivity.this)
//                        .setTitle("隔月抄表費用")
//                        .setMessage("費用" + fee)
//                        .setPositiveButton("OK",null)
//                        .show();
            }

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
