package com.example.joseph.perposterousquiz;

import android.content.Intent;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.LinearLayout;


public class MainActivity extends ActionBarActivity {

    FrameLayout fragLay;
    LinearLayout startLay;
    LinearLayout creditLay;
    LinearLayout instructionLay;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        fragLay = (FrameLayout) findViewById(R.id.fragment_container);

        startLay = (LinearLayout) findViewById(R.id.StartButton);
        startLay.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent newAct = new Intent(MainActivity.this, InstructionActivity.class);
                newAct.putExtra("key", "main menu");
                startActivity(newAct);

            }
        });
        creditLay = (LinearLayout) findViewById(R.id.CreditButton);
        creditLay.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent newAct = new Intent(MainActivity.this, CreditActivity.class);
                newAct.putExtra("key","main menu");
                startActivity(newAct);
            }
        });

        instructionLay = (LinearLayout) findViewById(R.id.InstructionButton);
        instructionLay.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent newAct = new Intent(MainActivity.this, InstructionActivity.class);
                newAct.putExtra("key","main menu");
                startActivity(newAct);
            }
        });

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
