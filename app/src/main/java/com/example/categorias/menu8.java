package com.example.categorias;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class menu8 extends AppCompatActivity {

    Button btn8;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu8);

        btn8 = (Button) findViewById(R.id.btnocho);

        btn8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent18 = new Intent(menu8.this,MainActivity.class);
                startActivity(intent18);
                finish();
            }
        });
    }
}
