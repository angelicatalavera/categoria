package com.example.categorias;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    Button button1,button2,button3,button4,button5,button6,button7,button8,button9,button10;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        button1 = (Button) findViewById(R.id.cat1);
        button2 = (Button) findViewById(R.id.cat2);
        button3 = (Button) findViewById(R.id.cat3);
        button4 = (Button) findViewById(R.id.cat4);
        button5 = (Button) findViewById(R.id.cat5);
        button6 = (Button) findViewById(R.id.cat6);
        button7 = (Button) findViewById(R.id.cat7);
        button8 = (Button) findViewById(R.id.cat8);
        button9 = (Button) findViewById(R.id.cat9);
        button10 = (Button) findViewById(R.id.cat10);

        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent1 = new Intent(MainActivity.this,menu1.class);
                startActivity(intent1);
                finish();
            }
        });

        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent2 = new Intent(MainActivity.this,menu2.class);
                startActivity(intent2);
                finish();
            }
        });

        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent3 = new Intent(MainActivity.this,menu3.class);
                startActivity(intent3);
                finish();
            }
        });

        button4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent4 = new Intent(MainActivity.this,menu4.class);
                startActivity(intent4);
                finish();
            }
        });

        button5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent5 = new Intent(MainActivity.this,menu5.class);
                startActivity(intent5);
                finish();
            }
        });

        button6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent6 = new Intent(MainActivity.this,menu6.class);
                startActivity(intent6);
                finish();
            }
        });

        button7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent7 = new Intent(MainActivity.this,menu7.class);
                startActivity(intent7);
                finish();
            }
        });

        button8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent8 = new Intent(MainActivity.this,menu8.class);
                startActivity(intent8);
                finish();
            }
        });

        button9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent9 = new Intent(MainActivity.this,menu9.class);
                startActivity(intent9);
                finish();
            }
        });

        button10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent10 = new Intent(MainActivity.this,menu10.class);
                startActivity(intent10);
                finish();
            }
        });
    }
}
