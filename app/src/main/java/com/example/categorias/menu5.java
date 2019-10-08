package com.example.categorias;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class menu5 extends AppCompatActivity {

    Button btn5;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu5);

        btn5 = (Button) findViewById(R.id.btncinco);

        btn5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent15 = new Intent(menu5.this,MainActivity.class);
                startActivity(intent15);
                finish();
            }
        });
    }
}
