package com.example.appcrud;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public boolean onCreateOptionsMenu(Menu menu){
        getMenuInflater().inflate(R.menu.overflow, menu);
        return true;
    }

    public boolean onOptionsItemSelected(MenuItem item){
        int id = item.getItemId();

        if(id == R.id.item1){
            Intent i = new Intent(this, activity_login.class);
            startActivity(i);
        } else if(id == R.id.item2){
            Intent i = new Intent(this, activity2.class);
            startActivity(i);
        }else if(id == R.id.item3){
            Intent i = new Intent(this, activity3.class);
            startActivity(i);
        }
        return super.onOptionsItemSelected(item);
    }



}



