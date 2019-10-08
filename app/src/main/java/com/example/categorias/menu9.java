package com.example.categorias;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class menu9 extends AppCompatActivity {
    Button btn9;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu9);

        btn9 = (Button) findViewById(R.id.btnnueve);

        btn9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent19 = new Intent(menu9.this,MainActivity.class);
                startActivity(intent19);
                finish();
            }
        });
    }
}
